import java.io.*;
import java.util.Scanner;

public class Serilizacao {

    public void serilizacao() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String cep = scanner.nextLine();
        Api api = new Api();
        api.json(cep);

        // Serialização
        ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("Dados.class"));
        objectInputStream.writeObject(cep);
        objectInputStream.close();
        System.out.println(api);
    }

}
