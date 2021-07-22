
package com.moringaschool.eathealthy.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel


public class TotalDaily {

    @SerializedName("ENERC_KCAL")
    @Expose
    private EnercKcal__1 enercKcal;
    @SerializedName("FAT")
    @Expose
    private Fat__1 fat;
    @SerializedName("FASAT")
    @Expose
    private Fasat__1 fasat;
    @SerializedName("CHOCDF")
    @Expose
    private Chocdf__1 chocdf;
    @SerializedName("FIBTG")
    @Expose
    private Fibtg__1 fibtg;
    @SerializedName("PROCNT")
    @Expose
    private Procnt__1 procnt;
    @SerializedName("CHOLE")
    @Expose
    private Chole__1 chole;
    @SerializedName("NA")
    @Expose
    private Na__1 na;
    @SerializedName("CA")
    @Expose
    private Ca__1 ca;
    @SerializedName("MG")
    @Expose
    private Mg__1 mg;
    @SerializedName("K")
    @Expose
    private K__1 k;
    @SerializedName("FE")
    @Expose
    private Fe__1 fe;
    @SerializedName("ZN")
    @Expose
    private Zn__1 zn;
    @SerializedName("P")
    @Expose
    private P__1 p;
    @SerializedName("VITA_RAE")
    @Expose
    private VitaRae__1 vitaRae;
    @SerializedName("VITC")
    @Expose
    private Vitc__1 vitc;
    @SerializedName("THIA")
    @Expose
    private Thia__1 thia;
    @SerializedName("RIBF")
    @Expose
    private Ribf__1 ribf;
    @SerializedName("NIA")
//    @Expose
//    private Nia__1 nia;
//    @SerializedName("VITB6A")
    @Expose
    private Vitb6a__1 vitb6a;
    @SerializedName("FOLDFE")
    @Expose
    private Foldfe__1 foldfe;
    @SerializedName("VITB12")
    @Expose
    private Vitb12__1 vitb12;
    @SerializedName("VITD")
    @Expose
    private Vitd__1 vitd;
    @SerializedName("TOCPHA")
    @Expose
    private Tocpha__1 tocpha;
    @SerializedName("VITK1")
    @Expose
    private Vitk1__1 vitk1;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TotalDaily() {
    }

    /**
     * 
     * @param fasat
     * @param enercKcal
     * @param procnt
     * @param chole
   //  * @param nia
     * @param vitaRae
     * @param ribf
     * @param vitd
     * @param vitc
     * @param vitb6a
     * @param fat
     * @param mg
     * @param vitb12
     * @param tocpha
     * @param foldfe
     * @param ca
     * @param chocdf
     * @param k
     * @param p
     * @param na
     * @param zn
     * @param vitk1
     * @param thia
     * @param fibtg
     * @param fe
     */
    public TotalDaily(EnercKcal__1 enercKcal, Fat__1 fat, Fasat__1 fasat, Chocdf__1 chocdf, Fibtg__1 fibtg, Procnt__1 procnt, Chole__1 chole, Na__1 na, Ca__1 ca, Mg__1 mg, K__1 k, Fe__1 fe, Zn__1 zn, P__1 p, VitaRae__1 vitaRae, Vitc__1 vitc, Thia__1 thia, Ribf__1 ribf, Vitb6a__1 vitb6a, Foldfe__1 foldfe, Vitb12__1 vitb12, Vitd__1 vitd, Tocpha__1 tocpha, Vitk1__1 vitk1) {
        super();
        this.enercKcal = enercKcal;
        this.fat = fat;
        this.fasat = fasat;
        this.chocdf = chocdf;
        this.fibtg = fibtg;
        this.procnt = procnt;
        this.chole = chole;
        this.na = na;
        this.ca = ca;
        this.mg = mg;
        this.k = k;
        this.fe = fe;
        this.zn = zn;
        this.p = p;
        this.vitaRae = vitaRae;
        this.vitc = vitc;
        this.thia = thia;
        this.ribf = ribf;
       // this.nia = nia;
        this.vitb6a = vitb6a;
        this.foldfe = foldfe;
        this.vitb12 = vitb12;
        this.vitd = vitd;
        this.tocpha = tocpha;
        this.vitk1 = vitk1;
    }

    public EnercKcal__1 getEnercKcal() {
        return enercKcal;
    }

    public void setEnercKcal(EnercKcal__1 enercKcal) {
        this.enercKcal = enercKcal;
    }

    public Fat__1 getFat() {
        return fat;
    }

    public void setFat(Fat__1 fat) {
        this.fat = fat;
    }

    public Fasat__1 getFasat() {
        return fasat;
    }

    public void setFasat(Fasat__1 fasat) {
        this.fasat = fasat;
    }

    public Chocdf__1 getChocdf() {
        return chocdf;
    }

    public void setChocdf(Chocdf__1 chocdf) {
        this.chocdf = chocdf;
    }

    public Fibtg__1 getFibtg() {
        return fibtg;
    }

    public void setFibtg(Fibtg__1 fibtg) {
        this.fibtg = fibtg;
    }

    public Procnt__1 getProcnt() {
        return procnt;
    }

    public void setProcnt(Procnt__1 procnt) {
        this.procnt = procnt;
    }

    public Chole__1 getChole() {
        return chole;
    }

    public void setChole(Chole__1 chole) {
        this.chole = chole;
    }

    public Na__1 getNa() {
        return na;
    }

    public void setNa(Na__1 na) {
        this.na = na;
    }

    public Ca__1 getCa() {
        return ca;
    }

    public void setCa(Ca__1 ca) {
        this.ca = ca;
    }

    public Mg__1 getMg() {
        return mg;
    }

    public void setMg(Mg__1 mg) {
        this.mg = mg;
    }

    public K__1 getK() {
        return k;
    }

    public void setK(K__1 k) {
        this.k = k;
    }

    public Fe__1 getFe() {
        return fe;
    }

    public void setFe(Fe__1 fe) {
        this.fe = fe;
    }

    public Zn__1 getZn() {
        return zn;
    }

    public void setZn(Zn__1 zn) {
        this.zn = zn;
    }

    public P__1 getP() {
        return p;
    }

    public void setP(P__1 p) {
        this.p = p;
    }

    public VitaRae__1 getVitaRae() {
        return vitaRae;
    }

    public void setVitaRae(VitaRae__1 vitaRae) {
        this.vitaRae = vitaRae;
    }

    public Vitc__1 getVitc() {
        return vitc;
    }

    public void setVitc(Vitc__1 vitc) {
        this.vitc = vitc;
    }

    public Thia__1 getThia() {
        return thia;
    }

    public void setThia(Thia__1 thia) {
        this.thia = thia;
    }

    public Ribf__1 getRibf() {
        return ribf;
    }

    public void setRibf(Ribf__1 ribf) {
        this.ribf = ribf;
    }

//    public Nia__1 getNia() {
//        return nia;
//    }
//
//    public void setNia(Nia__1 nia) {
//        this.nia = nia;
//    }

    public Vitb6a__1 getVitb6a() {
        return vitb6a;
    }

    public void setVitb6a(Vitb6a__1 vitb6a) {
        this.vitb6a = vitb6a;
    }

    public Foldfe__1 getFoldfe() {
        return foldfe;
    }

    public void setFoldfe(Foldfe__1 foldfe) {
        this.foldfe = foldfe;
    }

    public Vitb12__1 getVitb12() {
        return vitb12;
    }

    public void setVitb12(Vitb12__1 vitb12) {
        this.vitb12 = vitb12;
    }

    public Vitd__1 getVitd() {
        return vitd;
    }

    public void setVitd(Vitd__1 vitd) {
        this.vitd = vitd;
    }

    public Tocpha__1 getTocpha() {
        return tocpha;
    }

    public void setTocpha(Tocpha__1 tocpha) {
        this.tocpha = tocpha;
    }

    public Vitk1__1 getVitk1() {
        return vitk1;
    }

    public void setVitk1(Vitk1__1 vitk1) {
        this.vitk1 = vitk1;
    }

}
