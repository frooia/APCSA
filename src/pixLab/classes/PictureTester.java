/*
 * Purpose: To manipulate images using the Picture class
 * 
 * Lydia Chung
 * 05/28/2019
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  public static void testGrayscale()
  {
	  Picture flower = new Picture("src/pixLab/images/whiteFlower.jpg");
	  flower.explore();
	  flower.grayscale();
	  flower.explore();
  }
  public static void testNegate()
  {
	  Picture bike = new Picture("src/pixLab/images/redMotorcycle.jpg");
	  bike.explore();
	  bike.negate();
	  bike.explore();
  }
  public static void testKeepOnlyBlue()
  {
	  Picture water = new Picture("src/pixLab/images/water.jpg");
	  water.explore();
	  water.keepOnlyBlue();
	  water.explore();
  }
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/pixLab/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture bike = new Picture("src/pixLab/images/redMotorcycle.jpg");
	  bike.explore();
	  bike.mirrorVerticalRightToLeft();
	  bike.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture pic = new Picture("src/pixLab/images/gorge.jpg");
	  pic.explore();
	  pic.mirrorHorizontal();
	  pic.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture pic = new Picture("src/pixLab/images/kitten2.jpg");
	  pic.explore();
	  pic.mirrorHorizontalBotToTop();
	  pic.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/pixLab/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture pic = new Picture("src/pixLab/images/snowman.jpg");
	  pic.explore();
	  pic.mirrorArms();
	  pic.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture pic = new Picture("src/pixLab/images/seagull.jpg");
	  pic.explore();
	  pic.mirrorGull();
	  pic.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/pixLab/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/pixLab/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
	/*
    testZeroBlue();
    testKeepOnlyBlue();
    testNegate();
    testGrayscale();
    */
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
	/*
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    */
    
    // Activity 7
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();

    
    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();
    
    // Activity 9
    //testEdgeDetection();
    //testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












