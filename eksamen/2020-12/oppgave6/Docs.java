package oppgave6;

import java.time.LocalDate;
public class Docs {
    private int archiveNumber;
    private String title;
    private String subtitle;
    private int year;

    public Docs(int number, String title) {
        this.archiveNumber = number;
        this.title = title;
        this.year = LocalDate.now().getYear();
    }

    public Docs(int number, String title, String subtitle) {
        this.archiveNumber = number;
        this.title = title;
        this.subtitle = subtitle;
        this.year = LocalDate.now().getYear();
    }

    public int getArchiveNumber() {
        return this.archiveNumber;
    }

    public void setArchiveNumber(int number) {
        this.archiveNumber = number;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
