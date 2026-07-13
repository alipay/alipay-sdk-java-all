package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品价格模型
 *
 * @author auto create
 * @since 1.0, 2026-04-15 23:19:29
 */
public class NexusPayPrice extends AlipayObject {

	private static final long serialVersionUID = 2365426697692319425L;

	/**
	 * 是否可用
	 */
	@ApiField("active")
	private Boolean active;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 价格id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 价格信息元数据，通过价格创建接口传入
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 价格归属的商品模型信息
	 */
	@ApiField("product")
	private NexusPayProduct product;

	/**
	 * 商品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 仅当type=recurring时必选
	 */
	@ApiField("recurring")
	private Recurring recurring;

	/**
	 * 价格类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 单位金额，单位：分
	 */
	@ApiField("unit_amount")
	private String unitAmount;

	public Boolean getActive() {
		return this.active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public NexusPayProduct getProduct() {
		return this.product;
	}
	public void setProduct(NexusPayProduct product) {
		this.product = product;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Recurring getRecurring() {
		return this.recurring;
	}
	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(String unitAmount) {
		this.unitAmount = unitAmount;
	}

}
