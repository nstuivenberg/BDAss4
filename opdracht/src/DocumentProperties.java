import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
This class contains details such as the word frequency count for each term and term frequency for each term of the document.
 */
class DocumentProperties {


    public HashMap<String, Double> getTermFreqMap() {
        return termFreqMap;
    }

    HashMap<String, Integer> getWordCountMap() {
        return DocWordCounts;
    }

    void setTermFreqMap(HashMap<String, Double> inMap) {
        termFreqMap = new HashMap<String, Double>(inMap);
    }


    void setWordCountMap(HashMap<String, Integer> inMap) {
        DocWordCounts = new HashMap<String, Integer>(inMap);
    }

    private
    HashMap<String, Double> termFreqMap;
    HashMap<String, Integer> DocWordCounts;
}


