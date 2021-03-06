package moe.banana.jsonapi2.model;

import moe.banana.jsonapi2.HasMany;
import moe.banana.jsonapi2.HasOne;
import moe.banana.jsonapi2.JsonApi;
import moe.banana.jsonapi2.Resource;

@JsonApi(type = "private")
public class Protected extends Resource {

    protected String someString;
    protected Double someDouble;
    protected Integer someInteger;
    protected Boolean someBoolean;
    protected HasOne<Person> author;
    protected HasMany<Person> readers;
    protected transient String ignored;

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public Double getSomeDouble() {
        return someDouble;
    }

    public void setSomeDouble(Double someDouble) {
        this.someDouble = someDouble;
    }

    public Integer getSomeInteger() {
        return someInteger;
    }

    public void setSomeInteger(Integer someInteger) {
        this.someInteger = someInteger;
    }

    public Boolean getSomeBoolean() {
        return someBoolean;
    }

    public void setSomeBoolean(Boolean someBoolean) {
        this.someBoolean = someBoolean;
    }

    public HasOne<Person> getAuthor() {
        return author;
    }

    public void setAuthor(HasOne<Person> author) {
        this.author = author;
    }

    public HasMany<Person> getReaders() {
        return readers;
    }

    public void setReaders(HasMany<Person> readers) {
        this.readers = readers;
    }

    public String getIgnored() {
        return ignored;
    }

    public void setIgnored(String ignored) {
        this.ignored = ignored;
    }

}
