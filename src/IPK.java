public class IPK extends mahasiswa {
    private float ipks;
    private float ipk;
    private float ip;
    private int sms;

    public IPK(){

    }

    public IPK(float ipks, float ip, int sms) {
        this.ipks = ipks;
        this.ip = ip;
        this.sms = sms;
    }

    public float getIpks() {
        return ipks;
    }

    public void setIpks(float ipks) {
        this.ipks = ipks;
    }


    public float getIp() {
        return ip;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public float getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public void setIp(float ip) {
        this.ip = ip;
    }


    public float getIpk() {
        ipk = ((ipks * (sms - 1)) + ip) / sms;
        return ipk;
    }

    public float getIpk(float ipks,float ip, int sms) {
        ipk = ((ipks * (sms - 1)) + ip) / sms;
        return ipk;
    }

    public float getIpk(float ipks) {
        ipk = ((ipks * (sms - 1)) + ip) / sms;
        return ipk;
    }

    public String toString(){
        if((ipk < 3)){
         return "Anda dapat mengambil 20 sks untuk semester berikutnya.";
        }
        else{
         return "Anda dapat mengambil 24 sks untuk semester berikutnya.";}
    }
    }

