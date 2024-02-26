package ToyShop.Toys;

public class Toys {
  int id;
  String name;
  int quantity;
  int succesNumber;

  public Toys(int id, String name, int quantity, int succesNumber) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.succesNumber = succesNumber;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getSuccesNumber() {
    return succesNumber;
  }

  public void setSuccesNumber(int succesNumber) {
    this.succesNumber = succesNumber;
  }

  public void decreaseQuantity() {
  };
}
