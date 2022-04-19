package day12.task4;

public class Member {

    private String fio;

    public String getFio() {
        return fio;
    }

    public Member(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Member{" +
                "fio='" + fio + '\'' +
                '}';
    }

}
