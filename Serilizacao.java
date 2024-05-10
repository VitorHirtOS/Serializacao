import java.io.*;
import java.util.Scanner;

public class Serilizacao {

    public void serilizacao() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String cep = scanner.nextLine();
        Api api = new Api();
        api.json(cep);

        // Serialização
        ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("Dados.bytej"));
        objectInputStream.writeObject(cep);
        objectInputStream.close();
        System.out.println(api);

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("Dados.bytej"));
        String _cep = (String) objectInputStream1.readObject();
        objectInputStream1.close();
        System.out.println("CEP lido do arquivo: " + cep);


    }

}
