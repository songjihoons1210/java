package day09.실습10;

public class Score {
    private int score;

    public int setScore(int score) {
        if (score >= 0 && score <= 100) { // score 가 0보다 크면서 100보다 작을떄
            System.out.println(score);
            this.score = score;
        } else {
            System.out.println("오류"); // 0보다 작거나 100보다 높을경우 "오류"
        }
        return score; // score 반환
        }
    }
