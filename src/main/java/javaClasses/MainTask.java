package javaClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MainTask {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        Student students[] = new Student[5];
        students[0] = new Student(1, "Petrov", "Petr", "Ivanovich",
                formatter.parse("Sat, April 4, 2000"), "Kiev", "52341345",
                "rpd", "1", "5");
        students[1] = new Student(2, "Petrov2", "Petr", "Ivanovich",
                formatter.parse("Sat, April 4, 2001"), "Kiev", "52341345",
                "fifo", "2", "5");
        students[2] = new Student(3, "Petrov3", "Petr", "Ivanovich",
                formatter.parse("Sat, April 4, 2002"), "Kiev", "52341345",
                "mhm", "2", "3");
        students[3] = new Student(4, "Petrov4", "Petr", "Ivanovich",
                formatter.parse("Sat, April 4, 2003"), "Kiev", "52341345",
                "rpd", "1", "5");
        students[4] = new Student(5, "Petrov5", "Petr", "Ivanovich",
                formatter.parse("Sat, April 4, 2002"), "Kiev", "52341345",
                "rpd", "1", "4");

        //a) список студентов заданного факультета;
        List<Student> studentRPDfaculty = Arrays.stream(students)
                .filter(student -> student.department.equals("rpd"))
                .collect(Collectors.toList());
        System.out.println("List student where faculty equal rpd :" + studentRPDfaculty.toString());

        //b)списки студентов для каждого факультета и курса;
        List<Student> definetlyStudentRPDfacultyFirstCourse = Arrays.stream(students)
                .filter(student -> student.department.equals("rpd") && student.course.equals("1"))
                .collect(Collectors.toList());
        System.out.println("List student where faculty equal rpd and course=1 :" +
                definetlyStudentRPDfacultyFirstCourse.toString());

        //c) список студентов, родившихся после заданного года;
        Date dateFrom = null;
        try {
            dateFrom = formatter.parse("Sat, April 4, 2002");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date finalDateFrom = dateFrom;
        List<Student> studentAfter2001 = Arrays.stream(students)
                .filter(student -> student.getBirthDay().getTime() > finalDateFrom.getTime())
                .collect(Collectors.toList());
        System.out.println("List students which born after Sat, April 4, 2002  :" + studentAfter2001.toString());

        //d) список учебной группы.
        List<Student> studentListGroup = Arrays.stream(students)
                .filter(student -> student.getGroup().equals("3"))
                .collect(Collectors.toList());
        System.out.println("List students where group equal=3 :" + studentListGroup.toString());

    }
}
