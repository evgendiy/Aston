import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {


    public void showUniqueWords(String[] words) {
        List<String> wordList = new ArrayList<>(List.of(words));
        Set<String> uniqueWords = new HashSet<>(wordList);
        System.out.println("Unique words: " + uniqueWords);
    }

    public void uniqueWordCounter(String[] words) {
        List<String> uniqueWords = new ArrayList<>();   // для юник слов
        List<Integer> wordCount = new ArrayList<>();   // кол-во повторов

        for (String word : words) {
            if (uniqueWords.contains(word)) {
                int index = uniqueWords.indexOf(word);
                wordCount.set(index, wordCount.get(index) + 1);
            } else {
                uniqueWords.add(word);
                wordCount.add(1);
            }
        }

        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println(uniqueWords.get(i) + ": " + wordCount.get(i));
        }

    }


}
