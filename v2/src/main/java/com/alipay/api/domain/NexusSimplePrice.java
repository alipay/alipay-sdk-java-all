package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简易价格模型
 *
 * @author auto create
 * @since 1.0, 2026-03-29 14:48:37
 */
public class NexusSimplePrice extends AlipayObject {

	private static final long serialVersionUID = 6827652173382674561L;

	/**
	 * 是否可用
	 */
	@ApiField("active")
	private Boolean active;

	/**
	 * 价格id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 价格信息元数据
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 订阅周期信息
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
	private Long unitAmount;

	public Boolean getActive() {
		return this.active;
	}
	public void setActive(Boolean active) {
		this.active = active;
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

	public Long getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(Long unitAmount) {
		this.unitAmount = unitAmount;
	}

}
