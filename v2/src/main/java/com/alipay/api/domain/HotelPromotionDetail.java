package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店优惠活动详情，包括优惠type和金额
 *
 * @author auto create
 * @since 1.0, 2024-05-21 19:36:20
 */
public class HotelPromotionDetail extends AlipayObject {

	private static final long serialVersionUID = 4586995831466844491L;

	/**
	 * 酒店优惠活动金额
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 酒店优惠活动type，ota维度唯一
	 */
	@ApiField("type")
	private String type;

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
