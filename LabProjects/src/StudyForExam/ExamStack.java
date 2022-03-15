package StudyForExam;

public interface ExamStack <E>{
    boolean isEmpty();
    int size();
    E Top();
    void push(E element);
    E pop();
}
