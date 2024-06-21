package Main;


import dataStructure.Queue;

import java.util.Random;

public class FilaDeAtendimento {

    public static void main(String[] args) {
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);

        Queue queue = new Queue(cliente);

        System.out.println("chegou o cliente" + cliente);

        for (int i = 2; i <= 5 ; i++) {
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente" + cliente);
            queue.enqueue(cliente);
        }

        var node = queue.dequeue();
        while (node != null){
            System.out.println("atendido o cliente " + node.getvalue());
            node = queue.dequeue();
        }










    }
}
