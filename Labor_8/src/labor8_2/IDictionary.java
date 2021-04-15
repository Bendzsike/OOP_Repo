package labor8_2;

public interface IDictionary {
    public final String DICTIONARY_FILE = "Labor_8\\src\\labor8_2\\dictionary.txt";
    public boolean add(String word);
    public boolean find(String word);
    public int size();
}
