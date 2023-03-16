package LabTask.start;

import java.util.List;

public class Human implements Needs {
    private String name;
    private String nickname;
    private double salary;
    private List<String> hobbies;

    enum Languages {Arabic, English, Japanese}

    String sayHello(Languages languages) {
        if (languages == Languages.Arabic)
            return "مرحبا";
        return "Hello";
    }

    void calculateTax(int percentage) {
        salary = salary * percentage;
    }

    int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }

    void createNickName(String postFix) {
        nickname = name.concat(postFix);
    }

    @Override
    public void pray() {
    }

    @Override
    public void playSports() {

    }

    @Override
    public void getMarried() {

    }

    @Override
    public void ownCompany() {

    }

    @Override
    public void becomeEmployee() {

    }
}
