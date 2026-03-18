public class FIve {
    public static void main(String args[]){
        float dist=15000.0f;
        float hr=3.5f,min=15.0f,sec=40.0f;
        float mps,kph;
        mps=dist/(hr*60*60+min*60+sec);
        kph=(dist/1000)/(hr+(min/60)+(sec/(60*60)));
        System.out.println("for distance="+dist+"meters and");
        System.out.println("time taken="+hr+"hours="+min+"minutes and"+sec+"seconds");
        System.out.println("speed(in m/s)="+mps+"m/s and");
        System.out.println("speed (in km/h)="+kph+"km/h");
    }
}
