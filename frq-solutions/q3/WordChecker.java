import java.util.*;

public class WordChecker {
    private ArrayList<String> wordList = new ArrayList<String>();
    
    public WordChecker(String[] x) {
        for(String s: x) {
            wordList.add(s);
        }
    }

    public boolean isWordChain() {
        for(int i = 1; i < wordList.size(); i++) {
            if((wordList.get(i)).indexOf(wordList.get(i-1)) == -1){
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> createList(String target) {
        ArrayList<String> back = new ArrayList<String>();
        int tLen = target.length();
        for(String x: wordList) {
            if(x.indexOf(target) == 0) {
                back.add(x.substring(tLen));
            }
        }
        return back;
    }

}
