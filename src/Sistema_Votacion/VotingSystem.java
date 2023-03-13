package Sistema_Votacion;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class VotingSystem {
    private Set<Option> options;
    private String[] nombreCandidate;

    public VotingSystem(){
        this.options = new HashSet<>();
        this.nombreCandidate = new String [0];
    }

    public void addOption(String optionName){
        this.options.add(new Option(optionName));
    }

    public void starVoting(){ // mostrar candidatos, votar al candidato, sumar votos
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        mostrarCandidatos();
        System.out.print("Ingresar opcion:");
        int teclado = sc.nextInt();

        //Iterator to Option
        Iterator<Option> ite = options.iterator();

        while (ite.hasNext()){
            Option o = ite.next();

            if(teclado == contador){
                o.addVote();
            }
            contador++;
        }

    }

    public void mostrarCandidatos(){
        //indice para cada iteraccion
        AtomicInteger indice = new AtomicInteger();

        //Mostar un menu
        System.out.println("\n ** CHOOSE YOUR FAVORITE CANDIDATE **");

        options.stream().forEach(option -> {
                                            System.out.println("[" + indice + "] " + option.getName());
                                            indice.getAndIncrement();
                                             });

    }

    public void showResults(){
        Option ganador = new Option("");

        for (Option o: options){
            if(o.getVotes() > ganador.getVotes()){
                ganador = o;
            }
        }

        HashSet<Option>optionSorted = options.stream()
                                            .sorted()
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(optionSorted);
        System.out.println(" ** Candidato gandador: " + ganador.getName() + " " + ganador.getVotes() + " votos. **");
    }
}
