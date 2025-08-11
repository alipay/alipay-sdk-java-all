package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku属性
 *
 * @author auto create
 * @since 1.0, 2025-06-30 20:23:03
 */
public class MallSkuAttrValue extends AlipayObject {

	private static final long serialVersionUID = 1346984841893137351L;

	/**
	 * 规格报价上的属性英文名称
	 */
	@ApiField("attr_en_name")
	private String attrEnName;

	/**
	 * 属性值名称的英文版本
	 */
	@ApiField("attr_en_value")
	private String attrEnValue;

	/**
	 * 商品规格报价属性Id
	 */
	@ApiField("attr_id")
	private Long attrId;

	/**
	 * 属性中文名称
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * 用户勾选（或填写）的属性值
	 */
	@ApiField("attr_value")
	private String attrValue;

	/**
	 * 属性值ID
	 */
	@ApiField("attr_value_id")
	private Long attrValueId;

	/**
	 * 商品规格主键
	 */
	@ApiField("sku_id")
	private Long skuId;

	public String getAttrEnName() {
		return this.attrEnName;
	}
	public void setAttrEnName(String attrEnName) {
		this.attrEnName = attrEnName;
	}

	public String getAttrEnValue() {
		return this.attrEnValue;
	}
	public void setAttrEnValue(String attrEnValue) {
		this.attrEnValue = attrEnValue;
	}

	public Long getAttrId() {
		return this.attrId;
	}
	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	public Long getAttrValueId() {
		return this.attrValueId;
	}
	public void setAttrValueId(Long attrValueId) {
		this.attrValueId = attrValueId;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

}
