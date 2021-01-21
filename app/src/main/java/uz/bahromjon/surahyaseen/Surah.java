package uz.bahromjon.surahyaseen;

public class Surah {

    private int numOfAyat;
    private String ayat;

    public Surah(int numOfAyat, String ayat) {
        this.numOfAyat = numOfAyat;
        this.ayat = ayat;
    }

    public int getNumOfAyat() {
        return numOfAyat;
    }

    public void setNumOfAyat(int numOfAyat) {
        this.numOfAyat = numOfAyat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
