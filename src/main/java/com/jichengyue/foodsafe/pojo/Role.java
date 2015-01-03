package com.jichengyue.foodsafe.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="roles")
public class Role {
	
	@Id
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(cascade={ CascadeType.PERSIST,CascadeType.MERGE},fetch=FetchType.EAGER,mappedBy="role")
	private List<Permission> rolePermissions;
	
}
