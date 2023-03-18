package org.utl.dsm.core;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 *
 * @author 52477
 */
public class prueba {
    
    MongoClient client = MongoClients.create("");
        MongoDatabase db = client.getDatabase("Autos");
        MongoCollection col = db.getCollection("Marca");
        Document sampleDoc = new Document("_id", "1").append("nombreMarca", "FORD");
        Document sampleDoc2 = new Document("_id", "2").append("nombreMarca", "CHEVROLET");
        //col.find();
        //col.insertOne(sampleDoc);
        //col.insertOne(sampleDoc2);
        //col.deleteOne(sampleDoc);
        //col.updateOne(sampleDoc,sampleDoc);
        //col.find();
}
