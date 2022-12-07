package task_13.model;

import task_12.model.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook that = (ProgrammerBook) o;
        return level == that.level && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + level;
        return result;
    }
}
