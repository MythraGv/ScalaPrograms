//REPL Example
//1: The signum of the number is 1 if the number is positive,-1 if it is negative, and 0 if it is zero. 
//Write a function that computes this value.
def signum(num:Int)= { if(num==0) 0 
                       else if(num >0) 1
                       else -1     }
//signum: (num: Int)Int

scala> signum(0)
//res23: Int = 0
scala> signum(-10)
//res24: Int = -1
scala> signum(50)
//res25: Int = 1

//2: What is the value of an empty block expression {}?What is its type?

//Ans : Value of empty block {} is nothing and it's type is Unit
//ex: scala> def fun = {}
//    fun: Unit

//3: Come up with one situtation where the assignment x=y=1 is valie in Scala(Hint:Pick a suitable type for x)

// You need to define variable before you can use them as x=y=1, and becuase an assignmnet does not retuen the value assigned
//y=1 will reutrn nothing hence we need to define x as Unit 
// ex:
scala> var x:Unit ={}
//x: Unit = ()
scala> var y:Int = 10
//y: Int = 10
scala> x=y=1
//x: Unit = ()
//scala> y
//res27: Int = 1 
// you can see that y gets assinged to 1 where as x is still Unit with no value. 

// Write a Scala equivalent for the Java loop
// for(int i = 10;i>=0;i--) System.out.println(i);

scala> for(i <- 10 to(0,-1)) println(i)
//10
//9
//8
//7
//6
//5
//4
//3
//2
//1
//0

//5: Write a procedure cpountdown(n:Int) that print prints the numbers from n to 0.

scala> def countdown(n:Int) { for(i<-n to (0,-1)) println(i)}
//countdown: (n: Int)Unit

//Note: that after defition of countdown there is no = before { , hence it is a procedure not function

scala> countdown(5)
//5
//4
//3
//2
//1
//0

//6: Write a for loop for computing the product of hte Unicaode codes of all letter in a string.
//FOr example the product of the characters in "Hello" is 9415087488L.

scala> var sumchar:Long=1
//sumchar: Long = 1

scala> for(c<-"Hello") sumchar *=c

scala> sumchar
//res35: Long = 9415087488

//7. Solve the preceing excercise without writing a loop.(HInt:Look at the StringOps Scaladoc.)
