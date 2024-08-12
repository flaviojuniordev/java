package arquivo;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class main {

	public static void main(String[] args) {
		
		String path = "./src/arquivo/arq.txt";
				try {
					
					//fluxo de saída de um arquivo
					OutputStream os = new FileOutputStream(path);
					Writer wr = new OutputStreamWriter(os);
					BufferedWriter br = new BufferedWriter(wr);
					
					br.write("Escrevendo nosso primeiro arquivo em Java!");
					br.newLine();
					br.newLine();
					br.write("Outra Linha!");
					br.close();
					
				} catch (Exception e) { 
					System.out.println("Algo de errado nao esta certo");
				}
	}

}
