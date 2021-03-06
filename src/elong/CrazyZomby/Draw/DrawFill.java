/**********************************************************
 * 项目名称：消除僵尸
 * 作          者：郑敏新
 * 腾讯微博：SuperCube3D
 * 日          期：2013年12月
 * 声          明：版权所有   侵权必究
 * 本源代码供网友研究学习OpenGL ES开发Android应用用，
 * 请勿全部或部分用于商业用途
 ********************************************************/

package elong.CrazyZomby.Draw;

import javax.microedition.khronos.opengles.GL10;
import elong.CrazyZomby.CrazyZombyConstent;
import elong.CrazyZomby.Control.CtlFill;
import elong.CrazyZomby.Interface.IControl;

public class DrawFill {

	DrawAnimal drawAnimal;
	int mWitch1 = 0;
	int mWitch2 = 0;
	
	int mCol1 = 0;
	int mCol2 = 0;
	int mRow1 = 0;
	int mRow2 = 0;
	
	public IControl control;
	
	public DrawFill(DrawAnimal drawAnimal)
	{
		this.drawAnimal = drawAnimal;
		
		control = new CtlFill();
	}
	
	public void draw(GL10 gl, int witch, int col, int row)
	{
		//if(!control.isRun()) return;
		CtlFill ctl = (CtlFill)control;
		gl.glPushMatrix();		
		gl.glTranslatef(0f, ctl.getY()*CrazyZombyConstent.translateRatio, 0f);
		drawAnimal.draw(gl, witch, col, row);
		gl.glPopMatrix();
	}
}
