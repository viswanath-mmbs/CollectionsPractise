package com.j8.features.JavaNashron;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashronExample {

	public static void main(String[] args) throws Exception{  

		  /*ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
	      ee.eval(new FileReader("/js/hello.js"));  */
		
		  ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
		  ee.eval("print('Hello Nashorn' + java.lang.Math.sqrt(4));");  
		
	}

}
