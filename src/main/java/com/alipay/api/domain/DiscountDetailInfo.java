package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠明细
 *
 * @author auto create
 * @since 1.0, 2019-12-27 20:55:55
 */
public class DiscountDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1541614393338217336L;

	/**
	 * 优惠金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 优惠明细ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 优惠券类型
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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
