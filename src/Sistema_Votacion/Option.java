package Sistema_Votacion;

public class Option implements Comparable<Option> {
    private String name;
    private int votes;

    public Option(String name){
        this.name = name;
        this.votes = 0;
    }

    public void addVote(){
        this.votes += 1;
        System.out.println("Voted succesfully to : " + this.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    @Override
    public int compareTo(Option o) {
        return Integer.compare(o.getVotes(),this.getVotes());
    }

    @Override
    public String toString() {
        return "\n" + "Candidate " + "\n" +
                "name = " + this.getName() + "\n" +
                "votes = " + this.getVotes() + "\n";
    }

}
