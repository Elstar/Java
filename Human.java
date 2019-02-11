public class Human {
        //0 - men, 1 - women
        /**
         * variable of sex: 0 - unknown, 1 - men, 2 - women
         */
        private int sex;
        private int age;
        private double height;
        private double weight;

        public Human(int sex, int age, double height, double weight) {
                this.sex = sex;
                this.age = age;
                this.height = height;
                this.weight = weight;
        }

        public Human() {

        }

        public int getSex() {
                return sex;
        }

        public void setSex(int sex) {
                this.sex = sex;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public double getHeight() {
                return height;
        }

        public void setHeight(double height) {
                this.height = height;
        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        @Override
        public String toString() {
                return "Human{" +
                        "sex=" + sex +
                        ", age=" + age +
                        ", height=" + height +
                        ", weight=" + weight +
                        '}';
        }
}
