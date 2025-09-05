package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油产品优惠信息
 *
 * @author auto create
 * @since 1.0, 2024-03-06 14:32:04
 */
public class GasDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 7691463516457542284L;

	/**
	 * 优惠金额 （单位：元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 优惠描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商家优惠id
	 */
	@ApiField("discount_id")
	private String discountId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext")
	private ExtensionMap ext;

	/**
	 * 优惠名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 优惠类型
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public ExtensionMap getExt() {
		return this.ext;
	}
	public void setExt(ExtensionMap ext) {
		this.ext = ext;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
