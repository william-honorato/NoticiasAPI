package com.ftt.ec7.Noticias.Model;

import java.util.ArrayList;

public class NoticiasModel {



	 private String status;
	 private float totalResults;
	 ArrayList < CodebeautifyModel > articles = new ArrayList < CodebeautifyModel > ();


	 // Getter Methods 

	 public String getStatus() {
	  return status;
	 }

	 public float getTotalResults() {
	  return totalResults;
	 }

	 // Setter Methods 

	 public void setStatus(String status) {
	  this.status = status;
	 }

	 public void setTotalResults(float totalResults) {
	  this.totalResults = totalResults;
	 }

}
