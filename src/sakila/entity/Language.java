package sakila.entity;
// Generated 19-ene-2019 18:42:57 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Language generated by hbm2java
 */
public class Language  implements java.io.Serializable {


     private Byte languageId;
     private String name;
     private Date lastUpdate;
     private Set filmsForLanguageId = new HashSet(0);
     private Set filmsForOriginalLanguageId = new HashSet(0);

    public Language() {
    }

	
    public Language(String name, Date lastUpdate) {
        this.name = name;
        this.lastUpdate = lastUpdate;
    }
    public Language(String name, Date lastUpdate, Set filmsForLanguageId, Set filmsForOriginalLanguageId) {
       this.name = name;
       this.lastUpdate = lastUpdate;
       this.filmsForLanguageId = filmsForLanguageId;
       this.filmsForOriginalLanguageId = filmsForOriginalLanguageId;
    }
   
    public Byte getLanguageId() {
        return this.languageId;
    }
    
    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set getFilmsForLanguageId() {
        return this.filmsForLanguageId;
    }
    
    public void setFilmsForLanguageId(Set filmsForLanguageId) {
        this.filmsForLanguageId = filmsForLanguageId;
    }
    public Set getFilmsForOriginalLanguageId() {
        return this.filmsForOriginalLanguageId;
    }
    
    public void setFilmsForOriginalLanguageId(Set filmsForOriginalLanguageId) {
        this.filmsForOriginalLanguageId = filmsForOriginalLanguageId;
    }




}


