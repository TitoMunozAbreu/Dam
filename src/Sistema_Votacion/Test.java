package Sistema_Votacion;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();

        vs.addOption("Papaya");
        vs.addOption("Conchita");
        vs.addOption("Pitaya");

        vs.starVoting();
        vs.starVoting();
        vs.starVoting();

        vs.showResults();

    }
}
