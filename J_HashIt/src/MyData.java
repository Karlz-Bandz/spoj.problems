public class MyData implements Comparable<MyData> {

    private String key;
    private String value;




    public MyData(String key, String value) {
        this.key = key;
        this.value = value;

    }



    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\n" + key + " : " + value;
    }

    @Override
    public int compareTo(MyData o) {
        return Integer.compare(Integer.parseInt(this.key), Integer.parseInt(o.getKey()));
    }
}
