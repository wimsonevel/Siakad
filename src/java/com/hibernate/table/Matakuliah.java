package com.hibernate.table;
// Generated Nov 27, 2013 9:08:41 AM by Hibernate Tools 3.2.1.GA



/**
 * Matakuliah generated by hbm2java
 */
public class Matakuliah  implements java.io.Serializable {


     private Integer no;
     private String idmatkul;
     private String matkul;
     private String sks;

    public Matakuliah() {
    }

    public Matakuliah(String idmatkul, String matkul, String sks) {
       this.idmatkul = idmatkul;
       this.matkul = matkul;
       this.sks = sks;
    }
   
    public Integer getNo() {
        return this.no;
    }
    
    public void setNo(Integer no) {
        this.no = no;
    }
    public String getIdmatkul() {
        return this.idmatkul;
    }
    
    public void setIdmatkul(String idmatkul) {
        this.idmatkul = idmatkul;
    }
    public String getMatkul() {
        return this.matkul;
    }
    
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }
    public String getSks() {
        return this.sks;
    }
    
    public void setSks(String sks) {
        this.sks = sks;
    }




}

