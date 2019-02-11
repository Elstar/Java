import java.util.Arrays;

public class Group implements Army {
        private Student[] students = new Student[10];
        private String groupName;
        public StringBuilder stringBuilder = new StringBuilder();

        public Group(String groupName) {
                this.groupName = groupName;
        }

        public Group() {

        }

        public String getGroupName() {
                return groupName;
        }

        public void setGroupName(String groupName) {
                this.groupName = groupName;
        }
        
        @Override
        public Student[] getInductee() {
                Student[] inducteeStudent = new Student[students.length];
                int index = 0;
                for (int i=0; i<students.length; i++) {
                        if (students[i] != null && students[i].getAge()>18) {
                                inducteeStudent[index] = students[i];
                                index++;
                        }
                }
                return inducteeStudent;
        }

        public boolean addStudent() throws StudentExeption {
                for (int i=0; i<students.length; i++) {
                        if (students[i] == null) {
                                Student student = new Student();
                                student.setAllParams();
                                if (groupName != null)
                                        student.setGroupName(groupName);
                                students[i] = student;
                                return true;
                        }
                }
                throw new StudentExeption();

        }

        public boolean delStudent(String zachetka) throws StudentExeption {
                if (zachetka.equals("")) {
                        throw new IllegalArgumentException();
                }

                for (int i=0; i<students.length; i++) {
                        if (students[i] != null && students[i].getZachetka().equals(zachetka)) {
                                students[i] = null;
                                return true;
                        }
                }
                return false;
        }

        public Student searchStudent(String fam) {

                for (Student student:students
                     ) {
                        if (student != null && student.getFam().equals(fam))
                                return student;
                }

                return null;
        }

        @Override
        public String toString() {
                if (stringBuilder.length() > 0)
                        stringBuilder.delete(0, stringBuilder.length());
                Arrays.sort(students);
                for (int i=0; i<students.length; i++) {
                        if (students[i] != null) {
                                stringBuilder.append(
                                        students[i].getFam() + " "
                                        + students[i].getName() + " "
                                        + students[i].getParent()
                                );
                        }
                }
                return stringBuilder.toString();
        }
}
