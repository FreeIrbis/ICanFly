package com.quasar.hibernateh2.dao.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Irbis
 */
@Entity
@Table(name = "gender")
public class Gender extends Model implements Serializable {

    private static final long serialVersionUID = 1990501617629593245L;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "id_gender")
    private Set<Student> students;

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void setWorkers(Set<Worker> workers) {
        this.workers = workers;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Set<Worker> getWorkers() {
        return workers;
    }

    @OneToMany(mappedBy = "id_gender")
    private Set<Worker> workers;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "role_id")
//    private Role role;
    public Gender() {
        name = null;
    }
    
    public Gender(String name) {
        this.name = name;
    }
    
    public Gender(String name, Long id) {
        this.name = name;
        setId(id);
    }

    public Gender(Gender s) {
        name = s.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
}
