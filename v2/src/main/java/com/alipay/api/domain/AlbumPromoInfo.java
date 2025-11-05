package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专辑营销信息
 *
 * @author auto create
 * @since 1.0, 2024-09-03 11:41:01
 */
public class AlbumPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 8216841798478349857L;

	/**
	 * 营销活动折扣价（即到手价），单位元
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/**
	 * 活动结束时间，若有营销活动，则必填
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 营销活动类型，有则传入。
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 活动开始时间，若存在营销活动，则必填
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getDiscountPrice() {
		return this.discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
