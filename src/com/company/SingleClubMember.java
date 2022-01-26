package com.company;

public class SingleClubMember extends Member{
    private int club;

    public SingleClubMember(char memberType, int memberId, String name, double fees, int club) {
        super(memberType, memberId, name, fees);
        this.club = club;
    }

    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "SingleClubMember{" +
                "memberType=" + memberType +
                ", memberId=" + memberId +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                ", club=" + club +
                '}';
    }
}
