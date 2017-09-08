package com.wasu.model;

public class Role {
    /**
     * id   key
     * 1    ROLE_ADMIN
     * 2    ROLE_RESTRICTED_ADMIN
     * 3    ROLE_USER
     * 4    ROLE_PUSH
     * 12   ROLE_SERV
     * 13   ROLE_JIESAN
     */
    private Long id;

    private String description;

    private String roleKey;

    private String roleValue;

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

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey == null ? null : roleKey.trim();
    }

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue == null ? null : roleValue.trim();
    }
}