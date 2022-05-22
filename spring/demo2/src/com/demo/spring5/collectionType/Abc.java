package com.demo.spring5.collectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Abc {
    private String[] string;
    private List<String> list;
//    key value
    private Map<String,String> map;
    private Set<String> sets;

    private List<Course> courseList;
//    public void setCourse(Course course) {
//        this.course = course;
//    }
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setString(String[] string) {
        this.string = string;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void add(){
        System.out.println(string.toString()+list+map+list);
        System.out.println(courseList);
    }
}
