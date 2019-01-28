import java.util.*;
class Box
{
	float width;
	float height;
	float depth;
    
    Box()
    {
       width=0;
	   height=0;
	   depth=0;
	}
	Box(float w,float h, float d)
	{
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	Box(Box bx)
	{
	   	this.width = bx.width;
		this.height = bx.height;
		this.depth = bx.depth;
	}
	public void setwidth(float w)
	{
	    this.width = w;
	}
	public double getwidth()
	{
	    return width;
	}
	public void setheight(float h)
	{
		this.height = h;
	}
	public double getheight()
	{
		return height;
	}
	public void setdepth(float d)
	{ 
		this.depth = d;
	}
	public double getdepth()
	{
		return depth;
	}
	public double displayVolume()	
    {
    	return width*height*depth;
    }	
}    
class BoxWeight extends Box
{
	float weight;
	BoxWeight()
	{
		weight = 0;
	}
	BoxWeight(float w, float h,float d,float mg )
	{
		super(w,h,d);
		this.weight = mg;
	}
	BoxWeight(BoxWeight bw)
	{
		super(bw.weight, bw.height ,bw.depth);
		this.weight= bw.weight;
	}
	public double displayWeight()
	{ 
		return weight;
	}
}
class BoxWeightDemo
{
	public static void main(String args[])
	{
		  Scanner input= new Scanner(System.in);
		  float w,h,d,mg;
		  
		  w=input.nextFloat();
          System.out.println("enter width"+w);
		  h=input.nextFloat();
		  System.out.println("enter height"+h);
		  d=input.nextFloat();
		  System.out.println("enter depth"+d);
		  mg=input.nextFloat();

		  System.out.println("");
          BoxWeight obj= new BoxWeight(w,h,d,mg);
          System.out.println("volume is"+ obj.displayVolume());
          System.out.println("weight is"+ obj.displayWeight());
    }      
}





	        	

