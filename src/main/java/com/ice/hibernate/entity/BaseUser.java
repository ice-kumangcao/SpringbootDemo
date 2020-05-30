package com.ice.hibernate.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name="base_user")
public class BaseUser implements Serializable {
	@Id
	private String id;

    private String username;

    private String password;

    private String realName;

}