public class Player {
  IStrategy behavious;
  String type;

  public Player(String type) {
    this.type = type;
  }
  public void setStrategy(IStrategy behavious) {
    this.behavious = behavious;
  }
  public void action() {
    System.out.println("Player: "+this.type);
    behavious.actionCommand();
  }
}