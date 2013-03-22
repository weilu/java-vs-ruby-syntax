import java.util.*;

class Programmer {
  private String name;
  private int age;
  private List<String> languages;

  public Programmer(String name) {
    this.name = name;
    this.languages = new ArrayList<String>();
  }

  public void learn(String languages) {
    this.languages.add(languages);
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public String toString() {
    return "A programmer named " + name
      + ", " + age + " years old, knows " + languagesString() + ".";
  }

  private String languagesString() {
    String result = Arrays.toString(languages.toArray());
    return result.substring(1, result.length() - 1);
  }

  public static void main(String[] args) {
    Programmer alice = new Programmer("Alice");
    alice.setAge(8);
    String[] languages = { "Java", "Ruby", "Python" };

    for(int i = 0; i < languages.length; i++) {
      alice.learn(languages[i]);
    }
    System.out.println(alice);
  }
}

