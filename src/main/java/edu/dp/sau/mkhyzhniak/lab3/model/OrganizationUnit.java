package edu.dp.sau.mkhyzhniak.lab3.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class OrganizationUnit<T> {
    private String name;
    private Human head;
    private Set<T> contents = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public Set<T> getContents() {
        return contents;
    }

    public void setContents(Set<T> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationUnit<?> that = (OrganizationUnit<?>) o;
        return Objects.equals(name, that.name) && Objects.equals(head, that.head) && Objects.equals(contents, that.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, contents);
    }
}

