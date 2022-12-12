package user.nicovic.Objects;

import java.util.HashMap;

public class Bruger {

    String brugerNavn;
    String kodeord;
    int antalSpil;
    HashMap<Integer, Score> scoreHashMap;

    public Bruger(String tbrugerNavn, String tkodeord) {
        brugerNavn = tbrugerNavn;
        kodeord = tkodeord;
        antalSpil = 0;
        scoreHashMap = new HashMap<>();

    }

    public String getBrugerNavn() {
        return brugerNavn;
    }

    public void setScore(int level, Score score){
        scoreHashMap.put(level, score);
    }

    public Score getScore(int level){
        return scoreHashMap.get(level);
    }

}
