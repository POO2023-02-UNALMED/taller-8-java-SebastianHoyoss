package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre,int edad,short goles,byte dorsal) {
		super(nombre,edad,"Portero");
		this.dorsal=dorsal;
		this.golesRecibidos=goles;
	}
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
	}
	public short getGolesRecibidos() {
		return this.golesRecibidos;
	}
	public void setGolesRecibidos(short goles) {
		this.golesRecibidos=goles;
	}
	public byte getDorsal() {
		return this.dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal=dorsal;
	}
	public int compareTo(Portero p) {
		return Math.abs(this.golesRecibidos-p.getGolesRecibidos());
	}
	
	
	
	
	
	
	
	
	
	public boolean jugarConLasManos() {
		return true;
	}
}
