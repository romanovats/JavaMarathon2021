package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<Member> member;

    public MusicBand(String name, int year, List<Member> member) {
        this.name = name;
        this.year = year;
        this.member = member;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<Member> getMember() {
        return member;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", member=" + member +
                '}';
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (Member member: band1.getMember()) {
            band2.getMember().add(member);
        }
        band1.getMember().removeAll(band1.getMember());
    }

    public static void printMembers(MusicBand band) {
        System.out.println(band);
    }
}
