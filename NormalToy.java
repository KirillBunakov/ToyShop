package ToyShop.Toys;

public class NormalToy extends Toys {

  public NormalToy(int id, String name, int quantity, int succesNumber) {
    super(id, name, quantity, succesNumber);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int getId() {
    // TODO Auto-generated method stub
    return getId();
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return super.getName();
  }

  @Override
  public int getQuantity() {
    // TODO Auto-generated method stub
    return super.getQuantity();
  }

  @Override
  public int getSuccesNumber() {
    // TODO Auto-generated method stub
    return super.getSuccesNumber();
  }

  @Override
  public void setId(int id) {
    // TODO Auto-generated method stub
    super.setId(id);
  }

  @Override
  public void setName(String name) {
    // TODO Auto-generated method stub
    super.setName(name);
  }

  @Override
  public void setQuantity(int quantity) {
    // TODO Auto-generated method stub
    super.setQuantity(quantity);
  }

  @Override
  public void setSuccesNumber(int succesNumber) {
    // TODO Auto-generated method stub
    super.setSuccesNumber(succesNumber);
  }

  public void decreaseQuantity() {
    setQuantity(getQuantity() - 1);
  }
}
