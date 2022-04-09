package me.yj.designpattern._03_behavioral_patterns._18_memento._04_custom;

import lombok.Getter;

@Getter
public class Resume {
    private final String name;
    private String job;
    private String description;

    // 생성자
    public Resume(String name, String job, String description) {
        this.name = name;
        this.job = job;
        this.description = description;
    }

    // Memento(Snapshot) 생성
    public Memento createMemento() {
        return new Memento(this.job, this.description);
    }

    // Memento(Snapshot) 복원
    public void restore(Memento ResumeSnapshot) {
        this.job = ResumeSnapshot.getJob();
        this.description = ResumeSnapshot.getDescription();
    }

    // 현재 Resume 상태 보기
    public void view() {
        System.out.println("name = " + this.name);
        System.out.printf("    job [%s] description : %s  ", job, description);
        System.out.println();
    }

    // Resume 데이터 변경
    public void changeData(String job, String description) {
        this.job = job;
        this.description = description;
    }

}