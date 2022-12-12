package user.nicovic.Objects;

public class Score {
    int stjerner;
    int bedsteTid;

    public Score(int tStjerner, int tBedsteTid){
        stjerner = tStjerner;
        bedsteTid = tBedsteTid;
    }

    public int getBedsteTid() {
        return bedsteTid;
    }

    public int getStjerner() {
        return stjerner;
    }

}
