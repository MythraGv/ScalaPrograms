object Chap3soln {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  // 1. Write a code snippet that sets a to an array wof n random integers between 0(inclusive) and n (exclusive)
  
  val n = 10                                      //> n  : Int = 10
  val a = new Array[Int](n)                       //> a  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  for(i <-  0 until n) a(i)= scala.util.Random.nextInt(n)
  a                                               //> res0: Array[Int] = Array(4, 5, 9, 3, 7, 6, 8, 2, 1, 4)
  
  //2.  Write a loop that swaps adjacent elements of an array of integers. For Ex Array(1,2,3,4) becomes Array(2,1,4,3)
  
  val ar = Array(1,2,3,4,5)                       //> ar  : Array[Int] = Array(1, 2, 3, 4, 5)
  var i = 0                                       //> i  : Int = 0
  while(i < ar.length - 1){
    val temp = ar(i)
    ar(i)=ar(i+1)
    ar(i+1) = temp
    i=i+2
  }
  ar                                              //> res1: Array[Int] = Array(2, 1, 4, 3, 5)

  //3. Repeat the preceding assigment,but produce a new array with the swapped values.use for/yeild
  
  val ar1 = Array(1,2,3,4,5)                      //> ar1  : Array[Int] = Array(1, 2, 3, 4, 5)
  val ar3 = for(i <- 0 until ar1.length ) yield {
               if(i%2 == 0 && i == ar1.length -1) ar1(i)
               else if(i%2 == 0)
               ar1(i+1)
               else
               ar1(i-1)                           //> ar3  : scala.collection.immutable.IndexedSeq[Int] = Vector(2, 1, 4, 3, 5)
            }
 ar3                                              //> res2: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 1, 4, 3, 5)
 
 //4. Given an array of integers,produce a new array that contains all positive values of hte original array,in their original
 //order,follwed by all values tat are zero or negative,in their original order.
 
 val mixedAr = Array(1,0,-2,5,6,-3,0,0,7,-4)      //> mixedAr  : Array[Int] = Array(1, 0, -2, 5, 6, -3, 0, 0, 7, -4)
 // result = Array(1,5,6,7,0,-2,-3,0,0,-4)
 
//val or1 = for ( i <- 0 until mixedAr.length if mixedAr(i) > 0) yield i
// val or2 = for ( i <- 0 until mixedAr.length if mixedAr(i) <= 0) yield

import scala.collection.mutable.ArrayBuffer
val posordered = new ArrayBuffer[Int]()           //> posordered  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
val negordered = new ArrayBuffer[Int]()           //> negordered  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
for(i <- 0 until mixedAr.length) {
  if(mixedAr(i) > 0)
   posordered += mixedAr(i)
  else
   negordered += mixedAr(i)
}
posordered.appendAll(negordered)
val result = posordered.toArray                   //> result  : Array[Int] = Array(1, 5, 6, 7, 0, -2, -3, 0, 0, -4)

//5. How do you compute the average of Array[Double]

val doubleArr = new Array[Double](5)              //> doubleArr  : Array[Double] = Array(0.0, 0.0, 0.0, 0.0, 0.0)

doubleArr(0) = 1.2
doubleArr(1) = 2.4
doubleArr(2) = 23.4
doubleArr(3) = 2.46
doubleArr(4) = 26.478

val avg = doubleArr.sum / doubleArr.length        //> avg  : Double = 11.1876

//6. How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
//How do you do the smae with an Arraybuffer[Int]?

val arr = Array(2,5,6,3,9,0)                      //> arr  : Array[Int] = Array(2, 5, 6, 3, 9, 0)
arr.sortWith(_ > _)                               //> res3: Array[Int] = Array(9, 6, 5, 3, 2, 0)

val arrB = ArrayBuffer(2,6,3,0,5,4)               //> arrB  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 6, 3, 0,
                                                  //|  5, 4)
arrB.sortWith(_ > _)                              //> res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(6, 5, 4, 3, 2
                                                  //| , 0)

//7. Write a code snippet that produces all values from an array with duplicates removed

val dupArr = Array( 2,4,3,5,6,3,2)                //> dupArr  : Array[Int] = Array(2, 4, 3, 5, 6, 3, 2)
dupArr.distinct                                   //> res5: Array[Int] = Array(2, 4, 3, 5, 6)

//8. Rewrite the example at the end of Section 3.4, "Transforming Arrays," on page 32 ,Collect indexes of the negative elements,
//reverse the sequence,drop the last index, and call a.remove(i) for each index. Compare the efficiency of this approach with
//the two approaces in section 3.4
val arrAll = ArrayBuffer( -1 , 3 , 4 , -2, -4)    //> arrAll  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-1, 3, 4,
                                                  //|  -2, -4)
val indexes = for(i <- 0 until arrAll.length if arrAll(i) < 0 ) yield i
                                                  //> indexes  : scala.collection.immutable.IndexedSeq[Int] = Vector(0, 3, 4)
val rever=indexes.reverse                         //> rever  : scala.collection.immutable.IndexedSeq[Int] = Vector(4, 3, 0)
val reverd = rever.drop(1)                        //> reverd  : scala.collection.immutable.IndexedSeq[Int] = Vector(3, 0)
for (i <- reverd) arrAll.remove(i)
val arrObj = arrAll.toArray                       //> arrObj  : Array[Int] = Array(3, 4, -4)



//9. Make a collection of all timeZones returned by java.util.timeZone.getAvailableIDs that are in America.
//Strip off the "America/"prefix and sort the result.
val timezone = java.util.TimeZone.getAvailableIDs.filter(_.startsWith("America/",0)).map((s) => s.stripPrefix("America/"))
                                                  //> timezone  : Array[String] = Array(Adak, Anchorage, Anguilla, Antigua, Aragu
                                                  //| aina, Argentina/Buenos_Aires, Argentina/Catamarca, Argentina/ComodRivadavia
                                                  //| , Argentina/Cordoba, Argentina/Jujuy, Argentina/La_Rioja, Argentina/Mendoza
                                                  //| , Argentina/Rio_Gallegos, Argentina/Salta, Argentina/San_Juan, Argentina/Sa
                                                  //| n_Luis, Argentina/Tucuman, Argentina/Ushuaia, Aruba, Asuncion, Atikokan, At
                                                  //| ka, Bahia, Bahia_Banderas, Barbados, Belem, Belize, Blanc-Sablon, Boa_Vista
                                                  //| , Bogota, Boise, Buenos_Aires, Cambridge_Bay, Campo_Grande, Cancun, Caracas
                                                  //| , Catamarca, Cayenne, Cayman, Chicago, Chihuahua, Coral_Harbour, Cordoba, C
                                                  //| osta_Rica, Creston, Cuiaba, Curacao, Danmarkshavn, Dawson, Dawson_Creek, De
                                                  //| nver, Detroit, Dominica, Edmonton, Eirunepe, El_Salvador, Ensenada, Fort_Ne
                                                  //| lson, Fort_Wayne, Fortaleza, Glace_Bay, Godthab, Goose_Bay, Grand_Turk, Gre
                                                  //| nada, Guadeloupe, Guatemala, Guayaquil, Guyana, Halifax, Havana, Hermosillo
                                                  //| , Indiana/Indianapolis,
                                                  //| Output exceeds cutoff limit.


//10. Improt java.awt.datatransfer._ and make an object of type SystemFlavorMap with hte call
// val flavors = SystemFlavor.getDefualtFlavorMap().asInstanceof[SystemFlavorMap]
//Then call the getNativsFofFlavor method with parameter DataFlavor.imageFlavor and get the
//return value as a Scala buffer.(Why this obscure calss?it's hard to find uses of java.util.Lis in the standard Java Linbrary

import java.awt.datatransfer._
import scala.collection.JavaConversions._
val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
                                                  //> flavors  : java.awt.datatransfer.SystemFlavorMap = java.awt.datatransfer.Sy
                                                  //| stemFlavorMap@dc24521
val nativeFlavors = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
                                                  //> nativeFlavors  : java.util.List[String] = [PNG, JFIF, DIB, ENHMETAFILE, MET
                                                  //| AFILEPICT]
val scalaBuffer = scala.collection.JavaConversions.asScalaBuffer[String](nativeFlavors)
                                                  //> scalaBuffer  : scala.collection.mutable.Buffer[String] = Buffer(PNG, JFIF, 
                                                  //| DIB, ENHMETAFILE, METAFILEPICT)
