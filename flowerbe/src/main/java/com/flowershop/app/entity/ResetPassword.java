package com.flowershop.app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "reset_password")
public class ResetPassword {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "old_password")
    private String oldPassword;
    @Column(name = "new_password")
    private String newPassword;
    @Column(name = "reset")
    private String resetFor;

    @Column(name = "created_by", nullable=false)
	private Long createdBy;
	@Column(name = "created_on", nullable=false)
	private Date createdOn;
	@Column(name = "modified_by")
	private Long modifiedBy;
	@Column(name = "modified_on")
	private Date modifiedOn;
	@Column(name = "deleted_by")
	private Long deletedBy;
	@Column(name = "deleted_on")
	private Date deletedOn;
	@Column(name = "is_delete", nullable=false)
	private Boolean isDelete = false;

    @ManyToOne
    @JoinColumn(name = "created_by", insertable = false, updatable = false)
    private User userCreated;

    @ManyToOne
    @JoinColumn(name = "modified_by", insertable = false, updatable = false)
    private User userModified;

    @ManyToOne
    @JoinColumn(name = "deleted_by", insertable = false, updatable = false)
    private User userDeleted;
}
