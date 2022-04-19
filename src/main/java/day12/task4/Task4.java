package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Member> members1 = new ArrayList<>();
        Member member1 = new Member("Дмитрий");
        Member member2 = new Member("Татьяна");
        members1.add(member1);
        members1.add(member2);
        MusicBand band1 = new MusicBand("Анал-карнавал", 2021, members1);

        List<Member> members2 = new ArrayList<>();
        Member member4 = new Member("Олег");
        Member member5 = new Member("Алексей");
        Member member6 = new Member("Артем");
        members2.add(member4);
        members2.add(member5);
        members2.add(member6);
        MusicBand band2 = new MusicBand("Группа 2", 1980, members2);

        MusicBand.printMembers(band1);
        MusicBand.printMembers(band2);
        MusicBand.transferMembers(band1, band2);
        System.out.println("После трансформации");
        MusicBand.printMembers(band2);
        MusicBand.printMembers(band1);


    }
}
