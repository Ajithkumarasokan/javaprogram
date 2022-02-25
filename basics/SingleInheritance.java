package basics;

class Bicycle
{
	int gear,speed;
	void BicycleSpeed(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	void applyBreak(int dorement)
	{
		speed=speed-dorement;
	}
	void speeup(int increment)
	{
		speed=speed+increment;
	}
	void display()
	{
		System.out.println("no of gear are"+gear);
		System.out.println("speed of Bicycle:"+speed);
	}
}

class MountainBike extends Bicycle
{
	int SeatHeight;
	void MountainBikeSpeed(int speed,int gear,int StartHeight)
	{
		SeatHeight=StartHeight;
	}
	void SetHeight(int newValue)
	{
		SeatHeight=newValue;
	}
	void disp()
	{
		System.out.println("SeatHeight:"+SeatHeight);
	}
}

class SingleInheritance
{
public static void main(String[] args) 
	{
	MountainBike mb=new MountainBike();
	mb.BicycleSpeed(3,80); 
	mb.speeup(30); mb.applyBreak(20);
	mb.MountainBikeSpeed(40, 3, 5); 
	mb.SetHeight(4);
	mb.display();
	mb.disp();
	}
}
