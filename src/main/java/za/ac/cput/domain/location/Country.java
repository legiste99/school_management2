package za.ac.cput.domain.location;
/*
 *Country class
 *Country.java
 *Thina Mbiza: 217217095
 * Date: 18/06/2022
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Country implements Serializable  {
    @NotNull
    @Id
    private String id;
    @NotNull
    private String name;
    protected Country() {
    }
    public Country(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return id.equals(country.id) && name.equals(country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static class Builder {
        private String id;
        private String name;
        public Builder setId(String id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder copy(Country country) {
            this.id = country.id;
            this.name = country.name;
            return this;
        }
        public Country build() {
            return new Country(this);
        }
    }
}


