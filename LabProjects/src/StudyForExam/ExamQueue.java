package StudyForExam;

public interface ExamQueue <E>{
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E element);
    E dequeue();
}
