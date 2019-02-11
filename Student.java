import java.util.Scanner;

public class Student extends Human implements Comparable {
        private String fam;
        private String name;
        private String parent;
        private String zachetka;
        private int kurs;
        private String facultet;
        private String groupName;
        public Scanner scanner = new Scanner(System.in);

        public Student(int sex, int age, double height, double weight, String fam, String name, String parent, String zachetka, int kurs, String facultet, String groupName) {
                super(sex, age, height, weight);
                this.fam = fam;
                this.name = name;
                this.parent = parent;
                this.zachetka = zachetka;
                this.kurs = kurs;
                this.facultet = facultet;
                this.groupName = groupName;
        }

        public Student() {

        }

        public String getZachetka() {
                return zachetka;
        }

        public void setZachetka(String zachetka) {
                this.zachetka = zachetka;
        }

        public void setZachetka() {
                System.out.println("Введите номер зачетки: ");
                zachetka = scanner.nextLine();
                if (zachetka == "") {
                        throw new IllegalArgumentException();
                }
        }

        public String getGroupName() {
                return groupName;
        }

        public void setGroupName(String groupName) {
                this.groupName = groupName;
        }

        public String getFam() {
                return fam;
        }

        public void setFam() {
                System.out.println("Введите фамилию: ");
                fam = scanner.nextLine();
                if (fam == "") {
                        throw new IllegalArgumentException();
                }
        }

        public void setFam(String fam) {
                this.fam = fam;
        }

        public String getName() {
                return name;
        }

        public void setName() {
                System.out.println("Введите имя: ");
                name = scanner.nextLine();
                if (name == "") {
                        throw new IllegalArgumentException();
                }
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getParent() {
                return parent;
        }

        public void setParent() {
                System.out.println("Введите отчество: ");
                parent = scanner.nextLine();
                if (parent == "") {
                        throw new IllegalArgumentException();
                }
        }

        public void setParent(String parent) {
                this.parent = parent;
        }

        public int getKurs() {
                return kurs;
        }

        public void setKurs(int kurs) {
                this.kurs = kurs;
        }

        public void setKurs() {
                System.out.println("Введите номер курса: ");
                kurs = scanner.nextInt();
                if (kurs<1 || kurs>5) {
                        throw new IllegalArgumentException();
                }
        }

        public String getFacultet() {
                return facultet;
        }

        public void setFacultet(String facultet) {
                this.facultet = facultet;
        }

        public void setFacultet() {
                this.facultet = facultet;
        }

        public void setAllParams() {
                this.setFam();
                this.setName();
                this.setParent();
                this.setZachetka();
                this.setKurs();
        }

        @Override
        public int compareTo(Object o) {
                if (o == null || this == null)
                        return -1;
                Student anotherStudent = (Student) o;
                if (anotherStudent.getFam() == null || this.getFam() == null)
                        return -1;
                return getFam().compareTo(anotherStudent.getFam());
        }

        @Override
        public String toString() {
                String sex;
                if (super.getSex() == 1)
                        sex = "мужской";
                else if (super.getSex() == 2)
                        sex = "женский";
                else
                        sex = "неопределен";

                return "Student{" +
                        "fam='" + fam + '\'' +
                        ", name='" + name + '\'' +
                        ", parent='" + parent + '\'' +
                        ", kurs=" + kurs +
                        ", facultet='" + facultet + '\'' +
                        ", sex='" + sex + '\'' +
                        ", age=" + super.getAge() +
                        ", height=" + super.getHeight() +
                        ", weight=" + super.getWeight() +
                        '}';
        }
}
