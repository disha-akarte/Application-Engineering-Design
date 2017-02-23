/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalDocs;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author SONY
 */
public class MedicalReports {
    private ArrayList<MedicalDocs> docList;
    
    public MedicalReports(){
   
       this.docList = new ArrayList<>();
   }
    
    public MedicalDocs addDoc(ImageIcon icon,String desc,String filename){
    MedicalDocs doc = new MedicalDocs();
    docList.add(doc);
    doc.setImage(icon);
    doc.setDescription(desc);
    doc.setURL(filename);
    return doc;
    }
    
    
   public void deleteDoc(MedicalDocs doc){
       docList.remove(doc);
   }

    public ArrayList<MedicalDocs> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<MedicalDocs> docList) {
        this.docList = docList;
    }

   
}
