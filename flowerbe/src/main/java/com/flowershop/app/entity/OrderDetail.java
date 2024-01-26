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

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "delivery_destination")
    private String deliveryDestination;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "spesification_id")
    private Long spesificationId;
    @Column(name = "order_id")
    private Long orderId;

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
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "spesification_id", insertable = false, updatable = false)
    private Spesification spesification;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Order order;

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
