class BoxParameters{
	
	private double length;
	private double breath;
	private double height;
	private double volume;
	
	public BoxParameters(double length, double breath, double height){
		this.length=length;
		this.breath=breath;
		this.height=height;
		
	}
		
	public double getLength(){ 
		return this.length;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double getBreath(){
		return this.breath;
	}
	public void setBreath(double breath){
		this.breath=breath;
	}
	public double getHeight(){
		return this.height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getVolume(){
		volume = length * breath * height;
		return volume;
	}
	
}

class Box{
	
	public static void main(String args[]){
		BoxParameters b = new BoxParameters(2,4,3);
	
		System.out.println(b.getVolume());
		
		//b.setLength(3);
		//b.setBreath(2);
		//b.setHeight(4);
	}
}



/*
class Box{
	double l;
	double b;
	double h;

	void dimension(double l, double b,double h){
		this.l=l;
		this.b=b;
		this.h=h;
		System.out.println(volume());
	}
	
	double volume(){
		double vol= l*b*h;
		return vol;
	}

	public static void main(String args[])
	{
		Box b= new Box();
		b.dimension(3,6,2);
		//System.out.println();

	}
}

*/