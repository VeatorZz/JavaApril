import java.util.Scanner;
public class test {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    test1(sc);
                    break;
                case 2:
                    test2(sc);
                    break;
                case 3:
                    test3(sc);
                    break;
                case 4:
                    test4(sc);
            }
        }

        //test方法为（4）中情况，见上述说明
        public static void test1(Scanner sc) {
            Student s1 = new Student();
            Student s2 = new Student();
            String i1, i2, n1, n2;
            i1 = sc.next();
            n1 = sc.next();
            i2 = sc.next();
            n2 = sc.next();
            s1.setStdName(n1);
            s1.getStdID();
            s2.setStdName(n2);
            s2.getStdName();
            Student.count();
        }

        public static void test2(Scanner sc) {
            Course c1 = new Course();
            Course c2 = new Course();
            Course c3 = new Course();
            String i1, i2, n1, n2, m1, m2;
            i1 = sc.next();
            n1 = sc.next();
            i2 = sc.next();
            n2 = sc.next();
            m1 = sc.next();
            m2 = sc.next();
            c1.setcID(i1);
            c1.setcName(i2);
            c2.setcID(n1);
            c2.setcName(n2);
            c3.setcID(m1);
            c3.setcName(m2);
            Course.count();
        }

        public static void test3(Scanner sc) {
            String a=sc.next();
            String b=sc.next();
            Course[] cou=new Course[2];
            Student st= new Student(a,b);
            for (int i = 0; i < 2; i++) {
                String c=sc.next();
                String d=sc.next();
                Course xx=new Course();
                xx.setcName(d);
                xx.setcID(c);
                cou[i]=xx;
                st.scst.setXx(xx);
            }
            Schedule.count();
            System.out.println("学生选课情况如下：");
            st.print();
        }

        public static void test4(Scanner sc) {
            Student[] ST=new Student[100];
            for (int i = 0; i < 3; i++) {
                String a,b;
                a=sc.next();
                b=sc.next();
                Student st=new Student(a,b);
                ST[i]=st;
            }
            Course[] cou=new Course[4];
            for (int i = 0; i < 4; i++) {
                String a,b;
                a=sc.next();
                b=sc.next();
                Course x=new Course(a,b);
                cou[i]=x;
            }
            ST[0].scst.setXx(cou[1]);
            ST[0].scst.setXx(cou[2]);
            ST[1].scst.setXx(cou[0]);
            ST[2].scst.setXx(cou[0]);
            ST[2].scst.setXx(cou[1]);
            ST[2].scst.setXx(cou[3]);
            Student.count();
            Course.count();
            Schedule.count();
            System.out.println("学生选课情况如下：");
            ST[0].print();
            ST[1].print();
            ST[2].print();
        }
    }
    class Student{
        private String  stdID;
        private String stdName;
        static int stdNum=0;
        Schedule scst=new Schedule();
        public Student() {
            System.out.println("学生类无参构造方法");
            stdNum++;
        }

        public Student(String stdID, String stdName) {
            this.stdID = stdID;
            this.stdName = stdName;
            System.out.println("学生类有参构造方法");
            stdNum++;
        }
        public String getStdID() {
            return stdID;
        }

        public void setStdID(String stdID) {
            this.stdID = stdID;
        }

        public String getStdName() {
            return stdName;
        }

        public void setStdName(String stdName) {
            this.stdName = stdName;
        }
        public static void count(){
            System.out.println("学生总数为：" + stdNum);
        }
        public void print(){
            for (int i = 0; i < scst.scid; i++) {
                System.out.printf("%s\t%s\t%s\t%s\n",stdID,stdName,scst.getXx(i).getcID(),scst.getXx(i).getcName());
            }
        }
    }
    class Course{
        private String cID;
        private String cName;
        static int cNum;

        public Course() {
            System.out.println("课程类无参构造方法");
            cNum++;
        }

        public Course(String cID, String cName) {
            this.cID = cID;
            this.cName = cName;
            cNum++;
            System.out.println("课程类有参构造方法");
        }

        public String getcID() {
            return cID;
        }

        public void setcID(String cID) {
            this.cID = cID;
        }

        public String getcName() {
            return cName;
        }

        public void setcName(String cName) {
            this.cName = cName;
        }

        public static   void count(){
            System.out.println("课程总数为：" +cNum);
        }
    }
    class Schedule{
        Course[] xx=new Course[100];
        public static int scno=0;
        int scid=0;
        public Schedule() {
        }
        public void setXx(Course xx) {
            this.xx[scid] = xx;
            this.scid++;
            scno++;
        }
        public  static void count(){
            System.out.println("学生选课的总数为：" + scno);
        }
        public Course getXx(int i) {
            return xx[i];
        }

    }

