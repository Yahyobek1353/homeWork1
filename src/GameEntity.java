public abstract class GameEntity {
    private int age;
    private String type;

    public GameEntity(int age, String type) {
        if (age <= 0) {
            System.out.println("Возраст не может быть минусавым");
        } else {
            this.age = age;
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "GameEntity{" +
                "age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
    //    public GameEntity(int age, String ability) {
//        if (age <= 0) {
//            System.out.println("Возраст не может быть минусавым");
//        } else {
//            this.age = age;
//        }
//        this.type = ability;
//
//    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age) {
        if (age <= 0) {
            System.out.println("Возраст не может быть минусавым");
        } else {
            this.age = age;
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
