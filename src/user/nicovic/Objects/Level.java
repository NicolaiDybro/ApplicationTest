package user.nicovic.Objects;

public class Level {
    int id;
    int antalBolde;
    int maxTid;
    int hastighedSpawnBolde;

    public Level(int tID, int tAntalBolde, int tMaxTid, int tHastighedSpawnBolde) {
        id = tID;
        antalBolde = tAntalBolde;
        maxTid = tMaxTid;
        hastighedSpawnBolde = tHastighedSpawnBolde;
    }

    public int getAntalBolde() {
        return antalBolde;
    }

    public int getHastighedSpawnBolde() {
        return hastighedSpawnBolde;
    }

    public int getId() {
        return id;
    }

    public int getMaxTid() {
        return maxTid;
    }


}
