package com.ftt.ec7.Noticias.Controller;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class NoticiasController {
	
	private MongoClient client; 
	
	public NoticiasController(){
		client = new MongoClient(); 
	}
	
	public String RetornarNoticias() {
		
		MongoDatabase db = client.getDatabase("MongoDataBase");
		MongoCollection<Document> collection = db.getCollection("Noticias");
		String json = "";
		
		MongoCursor<Document> cursor = collection.find().iterator();
		try {
		while (cursor.hasNext()) {
		json += cursor.next().toJson();
		}
		} finally {
		cursor.close();
		}
		
		return json;
	}
	
	public String ExcluirNoticia(String id) {
		String retorno = "OK";
		
		MongoDatabase db = client.getDatabase("MongoDataBase");
		MongoCollection<Document> collection = db.getCollection("Noticias");
		collection.deleteOne(Filters.eq("tableName","Customer"));
		
		return retorno;
	}
	
	public String SalvarNoticia(String json) {
		
		String retorno = "OK";
		
		MongoDatabase db = client.getDatabase("MongoDataBase");
		MongoCollection<Document> collection = db.getCollection("Noticias");
		//Document doc = new Document(json);
		//collection.insertOne(json);
		
		return retorno;
	}

}