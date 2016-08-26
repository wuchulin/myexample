package com.myexample.system.model;

public class BaseMenu {
    private Long id;

    private String description;

    private Integer lower;

    private String name;

    private Long parentid;

    private Long sequence;

    private String status;

    private String value;

    private String icon;

    private Long moduleid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Long getModuleid() {
        return moduleid;
    }

    public void setModuleid(Long moduleid) {
        this.moduleid = moduleid;
    }
}