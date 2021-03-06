package game

import scala.swing._
import scala.swing.event._

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File
import scala.collection.mutable.ArrayBuffer
/**
 * @author poyhias1
 */
class Background(var x: Int, var y: Int, img_src:String){
  var speedBuffer = new ArrayBuffer[Int]()
  val FRAME_W=game.MainFrame2.background_IMG.getWidth
  val FRAME_H=game.MainFrame2.background_IMG.getHeight
  var INCREMENT = 1 
  
  var x2=FRAME_W
  var y2=FRAME_H
  
  var srcx1=0
  var srcy1=0
  var srcx2=FRAME_W
  var srcy2=FRAME_H
  
  var srcy1a=0-FRAME_H
  var srcy2a=0
  
  def animateBackgroundMovement(){
    if (srcy1 == FRAME_H) {
      srcy1 = 1-FRAME_H
      srcy2 = 1
      srcy1a += INCREMENT;
      srcy2a += INCREMENT;
      }
    else if(srcy1a == FRAME_H){
      srcy1a = 1-FRAME_H
      srcy2a = 1
      srcy1 += INCREMENT;
      srcy2 += INCREMENT;
      }
    else{
      srcy1a += INCREMENT;
      srcy2a += INCREMENT;
      srcy1 += INCREMENT;
      srcy2 += INCREMENT;
      }
    }
  }