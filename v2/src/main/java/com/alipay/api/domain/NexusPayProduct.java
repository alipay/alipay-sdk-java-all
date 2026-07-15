package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品模型
 *
 * @author auto create
 * @since 1.0, 2026-06-30 22:29:50
 */
public class NexusPayProduct extends AlipayObject {

	private static final long serialVersionUID = 6369696844133199177L;

	/**
	 * 是否可用
	 */
	@ApiField("active")
	private Boolean active;

	/**
	 * 默认价格信息
	 */
	@ApiField("default_price")
	private NexusSimplePrice defaultPrice;

	/**
	 * 商品的默认价格id
	 */
	@ApiField("default_price_id")
	private String defaultPriceId;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品信息元数据，通过商品创建接口传入
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单位名称
	 */
	@ApiField("unit_label")
	private String unitLabel;

	public Boolean getActive() {
		return this.active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public NexusSimplePrice getDefaultPrice() {
		return this.defaultPrice;
	}
	public void setDefaultPrice(NexusSimplePrice defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public String getDefaultPriceId() {
		return this.defaultPriceId;
	}
	public void setDefaultPriceId(String defaultPriceId) {
		this.defaultPriceId = defaultPriceId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUnitLabel() {
		return this.unitLabel;
	}
	public void setUnitLabel(String unitLabel) {
		this.unitLabel = unitLabel;
	}

}
