package sistemabancario.modelo;
import java.util.ArrayList;

public class Movimientos {
	//Atributos
	ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();

	public Movimientos() {}
	
	//Agregar Movimiento
	public void agregarMovimiento(Movimiento pMovimientoaAgregar) {
		//AGregar logica del negocio
		movimientos.add(pMovimientoaAgregar);
	}
	
	//Agregar Movimiento
	public void listarMovimientos() {
		System.out.println("====================");
		System.out.println("LISTA DE MOVIMIENTOS");
		System.out.println("====================");
		
		System.out.println("No. - Tipo  - Valor ");
		for(int i=0; i < movimientos.size() ; i++) {
			Movimiento mvto = movimientos.get(i);
			System.out.println(i + " - "+ mvto.getTipoMovimiento() + " - "+ mvto.getValor());
		}
		System.out.println("====================");
		
	}
	
	public void mayorConsignacion()
	{
		
		long maxNum = movimientos.get(0).getValor();
		int index2 = 0;
        for (int i = 0; i < movimientos.size(); i++) {
        	if(movimientos.get(i).getTipoMovimiento().equals("C")) {
        		if (i > maxNum) 
            	{
            		maxNum = movimientos.get(i).getValor();
                	index2 = i;
                }	
        	}
        	
        }
        System.out.println("La consignacion con mayor valor es " + movimientos.get(index2).getValor() + " - " + movimientos.get(index2).getTipoMovimiento());
	}
	
	public void mayorRetiro()
	{
		
		long maxNum = movimientos.get(0).getValor();
		int index3 = 0;
        for (int i = 0; i < movimientos.size(); i++) {
        	if(movimientos.get(i).getTipoMovimiento().equals("R")) {
        		if (i > maxNum) 
            	{
            		maxNum = movimientos.get(i).getValor();
                	index3 = i;
                }	
        	}
        	
        }
        System.out.println("El retiro con mayor valor es " + movimientos.get(index3).getValor() + " - " + movimientos.get(index3).getTipoMovimiento());
	}
	

	//Encapsulamiento
	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(ArrayList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	
}