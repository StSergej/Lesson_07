package worker_Info;

import java.util.InputMismatchException;

public class Worker implements Comparable<Worker>{
    String fio;
    String post;
    int yearOfEntry;

    public Worker(String fio, String post, int  yearOfEntry) {
        this.fio = fio;
        this.post = post;
        this.yearOfEntry = yearOfEntry;
    }

    public String getFio() {
        return fio;
    }
    public String getPost() {
        return post;
    }
    public int  getYearOfEntry()throws InputMismatchException {
        return yearOfEntry;
    }

    @Override
    public String toString() {
        return "Ф.И.О.: " + this.fio +"; " + "Должность: " + this.post +
                "; " + "Год поступления на работу: " + this.yearOfEntry + '\n';
    }

    @Override
    public int compareTo(Worker o) {
        return this.fio.compareTo(o.getFio());
    }
}
