package io.cucumber.aninfo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
	@Given("Tengo una calculadora")
	public void tengo_una_calculadora() {
	    this.calculadora = new Calculadora();
	    
	}

	@When("Multiplico {int} por {int}")
	public void multiplico_por(Integer int1, Integer int2) {
	    this.resultado = this.calculadora.mult(int1, int2);
	}
	@Then("Obtengo {int}")
	public void obtengo(Integer resultado) throws Exception {
	    if(resultado != this.resultado) {
	    	throw new Exception();
	    }
	}
	
	private int resultado;
	private Calculadora calculadora;
}
