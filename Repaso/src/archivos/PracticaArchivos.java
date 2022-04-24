package archivos;

import java.io.*;
import java.util.Scanner;

public class PracticaArchivos {

	public PracticaArchivos() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticaArchivos arch = new PracticaArchivos();
		
		String direct = "C://PruebasClase//";
		
		String pNombreArchivo = direct+"nuevo.txt";
		
		arch.crearArchivo(pNombreArchivo);
		
		
		
		
		

	}
	
	public void crearArchivo(String pNombreArchivo)
	{
		File fArchivo = new File(pNombreArchivo);
		
		BufferedWriter bw = null;
		try {
			if(fArchivo.exists())
			{
				Scanner iterate = new Scanner(fArchivo);
				int numLines=0;
				while(iterate.hasNextLine())
				{
					String currentLine = iterate.nextLine();
					numLines++;
				}
				iterate.close();
			}
			else
			{
				bw = new BufferedWriter(new FileWriter(pNombreArchivo));
				for (int i = 0; i < 10; i++) {
					bw.write("Linea creada " + i + "\n");
				}
			}
			System.out.println("==> Creado el archivo " + fArchivo);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				if(bw != null)
				{
					bw.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
				
			}
		}
		
		
	}

}
