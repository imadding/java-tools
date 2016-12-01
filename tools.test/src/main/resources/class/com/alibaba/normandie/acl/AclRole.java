package com.alibaba.normandie.acl;

import java.util.List;

/**
 * Created by huangjun on 6/24/16.
 */
public class AclRole extends AbstractAclRole{

    private static final long serialVersionUID = 5360726329785215792L;

    private Integer roleId;

    private List<AclResource> aclResources;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<AclResource> getAclResources() {
        return aclResources;
    }

    public void setAclResources(List<AclResource> aclResources) {
        this.aclResources = aclResources;
    }
}
