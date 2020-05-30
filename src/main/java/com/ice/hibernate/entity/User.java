package com.ice.hibernate.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name="user")
public class User implements Serializable {
	@Id
	private String id;

    private String username;

    private String password;

    @Column(name = "real_name")
    private String realName;

}