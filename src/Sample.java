import stdlib.StdOut;

public class Sample {
    public static  void main(String[] args){
        String a = "B", b = "A";
        String[] c = new String[1];
        c[0] = "A";
        Term[] term = new Term[1];
        term[0] = new Term(c[0]);
        Autocomplete d = new Autocomplete(term);

        //int v = a.compareTo(b);
        StdOut.println(d.allMatches("Term1"));
    }
}
