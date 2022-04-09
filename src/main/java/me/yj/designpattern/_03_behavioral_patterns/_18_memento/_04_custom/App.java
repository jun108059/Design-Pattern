package me.yj.designpattern._03_behavioral_patterns._18_memento._04_custom;

public class App {
    // 시나리오 1
    public static void main(String[] args) {
        System.out.println("================ 이력서 작성 ================");
        // 이력서 작성
        Resume resume = new Resume("내 이력서 1", "개발자", "백엔드 잘합니다.");
        // Snapshot 바로 생성
        Memento snapshot = resume.createMemento();
        // CareTaker 생성
        ResumeCareTaker careTaker = new ResumeCareTaker();
        // 현재 이력서 상태를 CareTaker Stack 저장
        careTaker.push(snapshot);
        // 이력서 상태 확인
        resume.view();

        System.out.println("================ 이력서 변경 ================");
        // 이력서 변경
        resume.changeData("프로그래머", "백엔드 합니다.");
        resume.view();

        System.out.println("============= 이력서 변경 취소 (복원) =============");
        // 페이지 이탈 - 이전 데이터 복원
        resume.restore(careTaker.pop());
        resume.view();
    }
}
