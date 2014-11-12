package fr.istic.cemembert.model;

import java.util.Map;

public class Model implements IModel{

	String name;
	Map<String, IQuartier> quartiers;

	
	
	public Model() {
		
	}
	
	public Model(String name, Map<String, IQuartier> quartiers) {
		this.name = name;
		this.quartiers = quartiers;
	}

	public Map<String, IQuartier> getQuartiers() {
		return quartiers;
	}

	public void setQuartiers(Map<String, IQuartier> quartiers) {
		this.quartiers = quartiers;
	}
	
	public void addQuartier(IQuartier quartier){
		
	}
	
}
