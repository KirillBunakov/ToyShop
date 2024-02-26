package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import ToyShop.Toys.NormalToy;
import ToyShop.Toys.OrdinaryToy;
import ToyShop.Toys.RareToy;
import ToyShop.Toys.Toys;

public class main {

  public static void main(String[] args) {
    Random random = new Random();
    // Создаем игрушки по типам
    RareToy WhiteBear = new RareToy(1, "WhiteBear", 3, 10);
    RareToy BlackBear = new RareToy(2, "BlackBear", 3, 9);
    NormalToy PinkRabbit = new NormalToy(3, "PinkRabbit", 5, 8);
    NormalToy GreyRabbit = new NormalToy(4, "GreyRabbit", 5, 7);
    NormalToy WhiteRabbit = new NormalToy(5, "WhiteRabbit", 5, 6);
    OrdinaryToy Panda = new OrdinaryToy(6, "Panda", 10, 1);
    OrdinaryToy Dog = new OrdinaryToy(7, "Dog", 10, 2);
    OrdinaryToy Cat = new OrdinaryToy(8, "Cat", 10, 3);
    OrdinaryToy Snake = new OrdinaryToy(9, "Snake", 10, 4);
    OrdinaryToy Bat = new OrdinaryToy(10, "Bat", 10, 5);

    // Список редких игрушек
    ArrayList<Toys> rarelist = new ArrayList();
    rarelist.add(WhiteBear);
    rarelist.add(BlackBear);
    ToyBox rare = new ToyBox(rarelist);

    // Список средних игрушек
    ArrayList<Toys> normallist = new ArrayList();
    normallist.add(PinkRabbit);
    normallist.add(GreyRabbit);
    normallist.add(WhiteRabbit);
    ToyBox normal = new ToyBox(normallist);

    // Список маленьких игрушек
    ArrayList<Toys> ordinarylist = new ArrayList();
    ordinarylist.add(Panda);
    ordinarylist.add(Dog);
    ordinarylist.add(Cat);
    ordinarylist.add(Snake);
    ordinarylist.add(Bat);
    ToyBox ordinary = new ToyBox(ordinarylist);

    // Розыгрыш случайной игрушки 10 раз, запись в файл с датой и временем розыгрыша
    Date date = new Date();
    try (FileWriter fw = new FileWriter("ПризовыеИгрушки.txt")) {
      System.out.println("Розыгрыш начался!");
      fw.write("Розыгрыш начался! " + date + "\n");
      for (int i = 0; i < 10; i++) {
        int x = random.nextInt(1, 11);
        if (x >= 1 && x <= 5) {
          System.out.println(ordinary.getNameFromSucces(x));
          fw.write((i + 1) + ": " + ordinary.getNameFromSucces(x) + "\n");
        } else if (x >= 6 && x <= 8) {
          System.out.println(normal.getNameFromSucces(x));
          fw.write((i + 1) + ": " + normal.getNameFromSucces(x) + "\n");
        } else if (x >= 9 && x <= 10) {
          System.out.println(rare.getNameFromSucces(x));
          fw.write((i + 1) + ": " + rare.getNameFromSucces(x) + "\n");
        }
      }
      System.out.println("Розыгрыш закончился!");
      fw.write("Розыгрыш закончился! " + date);

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
