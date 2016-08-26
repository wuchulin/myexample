package com.myexample.system.model;

public class BaseRegion {
    private Long id;

    private String code;

    private String description;

    private Integer lower;

    private String name;

    private Long parentid;

    private Long sequence;

    private String cp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getLower() {
        return lower;
    }

    public void setLower(Integer lower) {
        this.lower = lower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp == null ? null : cp.trim();
    }
}