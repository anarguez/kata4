package kata4;

import java.util.ArrayList;

public class HistogramBuilder {
    
    public static Histogram<String> build(ArrayList<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String m : mail) {
            histo.increment(new Mail(m).getDomain());
        }
        return histo;
    }
}
