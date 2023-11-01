//color
class Color{
	public void color(String c) {
		System.out.println("Car Color: " + c);
	}
}

//engine
class Engine{
	public void start() {
		System.out.println("Engine ON");
	}
	public void drive() {
		System.out.println("Driving");
	}
	public void stop() {
		System.out.println("Engine OFF");
	}
}

//wheel
class Wheel{
	int diameter;
	int pressure;
	public void wheel() {
		pressure = 2;
	}
	
	public void diam(int psi) {
		diameter = psi;
		System.out.println("This wheel has diamater of " + psi + " inches");
	}
	
	public void inflate() {
		System.out.println("The wheel is inflated. Inflate it");
	}
	
	public void inflate(int bar) {
		pressure = bar;
		System.out.println("Pressure is " + bar + " bars.");
	}
}

//window
class Window{
	String carwindow;
	
	Window(String cw){
		carwindow = cw;
	}
	
	public void openwindow() {
		System.out.println("The " + carwindow + " car window is open");
	}
	
	public void closewindow() {
		System.out.println("The " + carwindow + " car window is closed");
	}
}

//door
class Door{
	String door;
	public Window carwin;
	public Door(String v) {
		door = v;
		carwin = new Window(door);
	}
	
	public void opendoor() {
		System.out.println("The " + door + " is opened");
	}
	
	public void closedoor() {
		System.out.println("The " + door + " is closed");
	}
}

//main
public class Bruh {
	String carcolor;
	public Engine eng = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door frontleft = new Door("Front Left");
	public Door frontright = new Door("Front Right");
	public Color c = new Color();
	public Bruh(String c) {
		for (int i = 0; i < 4; i++) {
			wheel[i] = new Wheel();
			carcolor = c;
		}
	}
	
	
	public static void main(String[] ars)
	{
		Bruh mycar = new Bruh("Silver");
		mycar.c.color("Silver");
		mycar.frontleft.opendoor();
		mycar.frontleft.closedoor();
		mycar.eng.start();
		mycar.eng.drive();
		mycar.frontleft.carwin.openwindow();
		mycar.wheel[0].diam(72);
	}
}
