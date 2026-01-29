package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖品信息列表
 *
 * @author auto create
 * @since 1.0, 2025-04-22 21:56:32
 */
public class PrizeDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 6224134792796331346L;

	/**
	 * 优惠券信息
	 */
	@ApiListField("coupon_info")
	@ApiField("coupon_info")
	private List<CouponInfo> couponInfo;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	public List<CouponInfo> getCouponInfo() {
		return this.couponInfo;
	}
	public void setCouponInfo(List<CouponInfo> couponInfo) {
		this.couponInfo = couponInfo;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

}
