package aghazadeh.ahmad.smsblocke.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ROLES".
 */
public class Roles {

    private Long id;
    private String name;
    private Boolean isActive;
    private String condition;

    public Roles() {
    }

    public Roles(Long id) {
        this.id = id;
    }

    public Roles(Long id, String name, Boolean isActive, String condition) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.condition = condition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}