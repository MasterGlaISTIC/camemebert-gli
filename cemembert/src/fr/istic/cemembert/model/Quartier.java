package fr.istic.cemembert.model;

class Quartier implements IQuartier{
	  private String title;

	  private Integer value;

	  private String desc;



	  public Quartier() {
	  }

	  public Quartier(String aa, Integer bb, String cc) {
	    title = aa;
	    value = bb;
	    desc = cc;
	   
	  }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public void notity() {
		// TODO Auto-generated method stub
		
	}


	}
