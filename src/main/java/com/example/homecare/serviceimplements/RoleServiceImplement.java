package com.example.homecare.serviceimplements;

import com.example.homecare.entities.Role;
import com.example.homecare.repositories.IRoleRepository;
import com.example.homecare.serviceinterfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }


    @Override
    public Role ListId(long id) {
        return rR.findById(id).orElse(new Role());
    }
}
