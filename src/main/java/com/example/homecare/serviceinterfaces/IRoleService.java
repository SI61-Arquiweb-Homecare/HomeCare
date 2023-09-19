package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();

    public Role ListId(long id);
}