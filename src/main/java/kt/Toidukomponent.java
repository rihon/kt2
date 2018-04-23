package kt;
public class Toidukomponent{
	double kogus;
	Toiduaine toit;
	
	public Toidukomponent(Toiduaine toit, double kogus){
		this.toit = toit;
		this.kogus = kogus;
	}
	
	
	public double ToidukomponendiRasv(){
		return kogus*toit.rasv/100;
	}
}