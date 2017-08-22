package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;
import java.io.InputStream;

public class Proc{
	
	public Proc(){
		super();
	}
	
	public String os(){
		String sisop = System.getProperty("os.name");
		return sisop;
	}
	
	/*public void propriedades(){
		Properties prop = System.getProperties();
		Set<Object> keys = prop.keySet();
		for (Object obj: keys){
			System.out.print(obj.toString());
			System.out.print(" ==> ");
			System.out.println(System.getProperty(obj.toString()));
		}
	}
	
	//public void chamaProcesso(String caminhoProcesso){
		try {
			Runtime.getRuntime().exec(caminhoProcesso);
		} catch (IOException e) {
			String erro = e.getMessage();
			if (erro.contains("740")){
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd.exe /c ");
				buffer.append(caminhoProcesso);
				try {
					Runtime.getRuntime().exec(buffer.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else{ 
				e.printStackTrace();
			}
		}
	}
	
	public void leProcesso(String caminhoProcesso){
		
	
		try {
			Process p = Runtime.getRuntime().exec(caminhoProcesso);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leFluxo = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leFluxo);
			String linha = buffer.readLine();
			while (linha != null){
				System.out.println(linha);
				linha = buffer.readLine();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void mataProcessor(String processo){ 
		String cmdPid = "TASKKILL /PID ";
		String cmdNome = "TASKKILL /IM ";
		StringBuffer buffer = new StringBuffer();
		
		int pid = 0;
		
		try {
		pid = Integer.parseInt(processo);
		buffer.append(cmdPid);
		buffer.append(pid);
		} catch (NumberFormatException e){
			buffer.append(cmdNome);
			buffer.append(processo);
		}
		try {
			Runtime.getRuntime().exec(buffer.toString());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}*/

}
