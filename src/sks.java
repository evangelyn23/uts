public class sks extends mahasiswa{
    public int Jsks;
    private int sks;

    public int getJSks() {
        return Jsks;
    }

    public void setJsks(int jsks) {
        Jsks = jsks;
    }

    public void setSks(int sks) {
        this.Jsks = sks;
    }
    public sks(){

    }

    public sks(int Jsks){
        this.Jsks=Jsks;
    }

    public  int getsks(){
        if(Jsks<144){
        sks = 144-Jsks;
        }
        if(Jsks>=144){
            sks=160-Jsks;
        }
        return sks;
    }

    public  int getsks(int Jsks){
        if(Jsks<144){
            sks = 144-Jsks;
        }
        if(Jsks>=144){
            sks=160-Jsks;
        }
        return sks;
    }

    public String toString(){
        if(Jsks<144){
        return "Sisa sks yang masih perlu diambil adalah: ";
     }
        return "Sisa sks yang masih bisa diambil adalah : ";
    }
}


