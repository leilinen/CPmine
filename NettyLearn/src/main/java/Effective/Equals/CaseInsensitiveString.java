package Effective.Equals;

public class CaseInsensitiveString {
    private String s;

    public CaseInsensitiveString(String s){
        if (s==null){
            throw new NullPointerException();
        }

        this.s = s;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if(o instanceof String){
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }

}
