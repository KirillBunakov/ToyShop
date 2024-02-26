package ToyShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ToyShop.Toys.Toys;

public class ToyBox {
  public ArrayList<Toys> list;

  public ToyBox(ArrayList<Toys> list) {
    this.list = list;
  }

  public List<Toys> getList() {
    return list;
  }

  public void setList(ArrayList<Toys> list) {
    this.list = list;
  }

  public int getSize() {
    return list.size();
  }

  public String getToyName(int x) {
    return list.get(x).getName();
  }

  public Toys get(int x) {
    return list.get(x);
  }

  // Метод нахождения Имени игрушки через SuccesNumber
  public String getNameFromSucces(int x) {
    String q = "";
    for (Toys elem : list) {
      if (elem.getSuccesNumber() == x) {
        q = elem.getName();
        elem.decreaseQuantity();
      }
    }

    return q;
  }

  // public String getRandomToy() {
  // Random random = new Random();
  // int x = random.nextInt(0, list.size());
  // return list.get(x).getName();
  // }

}
