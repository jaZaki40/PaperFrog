/**
 * 
 */
package co.bta.jazaki40.paperFrog.monteMyoboku;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.bta.jazaki40.paperFrog.monteMyoboku.sapitos.Fukasaku;

/**
 * @author jaZaki40
 *
 */
public class GamaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Empieza a ejecutar el programa a las: " + new Date());
		
		String msgError = ""; 
				
		String rutaArchivo = "./resources/templates/templateAeroDigital.xml";
		String find = "";
		
		Fukasaku sapoProcesadorXml = new Fukasaku(); 
		
		try {
			File archivoXml = new File(rutaArchivo);
			if(archivoXml != null && archivoXml.exists()) {
				List<String> listadoRutas = sapoProcesadorXml.obtenerRutasCon(find, null);
			} else {
				msgError = "No existe archivo XML en ruta : " + archivoXml.getPath();
				Logger.getLogger(GamaMain.class.getName()).log(Level.INFO, msgError, new Throwable(msgError));
			}
		} catch (Exception e) {
			msgError = "Error creando el archivo xml en ruta: " + rutaArchivo;
			Logger.getLogger(GamaMain.class.getName()).log(Level.SEVERE, msgError, e);
		}
		
		System.out.println("Finaliza de ejecutar el programa a las: " + new Date());
	}

}
