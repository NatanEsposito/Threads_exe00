package controller;

public class Threadsvet extends Thread{
int cont, vet[] = new int[1000];

public Threadsvet(int cont, int[]vet) {
	this.cont=cont;
	this.vet=vet;
}
@Override
public void run() {
	if(cont%2==0) {
		par();
	}else {
		impar();
	}
super.run();
}
private void par() {
	double Ti = System.nanoTime();
	for(int i=0; cont<vet.length;i++) {
			}
	double Tf = System.nanoTime();
	double Tt = Tf-Ti;
	Tt=Tt/Math.pow(10,9);
	System.out.println("par: "+Tt+ "em segundo");

}

private void impar() {	
	double Ti = System.nanoTime();
	for(int var:vet) {
		
	}
	double Tf = System.nanoTime();
	double Tt = Tf-Ti;
	Tt=Tt/Math.pow(10,9);
	System.out.println("impar: "+Tt+ "em segundo");

}






}
