package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付费外卡售卖方案详情
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:48:34
 */
public class PaidOuterCardPriceDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 2452198128293226352L;

	/**
	 * 方案描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 售卖具体金额。单位为元。支持两位小数。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 售卖金额类型
	 */
	@ApiField("price_type")
	private String priceType;

	/**
	 * 价值。单位为元。支持两位小数
	 */
	@ApiField("worth")
	private String worth;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceType() {
		return this.priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getWorth() {
		return this.worth;
	}
	public void setWorth(String worth) {
		this.worth = worth;
	}

}
