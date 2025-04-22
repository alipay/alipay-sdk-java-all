package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推送酒店价格计划
 *
 * @author auto create
 * @since 1.0, 2024-12-10 19:00:39
 */
public class AlipayCommerceHotelRateplanUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3143119449128939184L;

	/**
	 * 预定规则列表
	 */
	@ApiListField("booking_rules")
	@ApiField("booking_rule")
	private List<BookingRule> bookingRules;

	/**
	 * 酒店id
	 */
	@ApiField("hotel_id")
	private String hotelId;

	/**
	 * 是否为增量更新, 默认为false全量更新
	 */
	@ApiField("increment")
	private Boolean increment;

	/**
	 * 酒店价格优惠活动静态信息列表
	 */
	@ApiListField("promotion_static_info_list")
	@ApiField("hotel_promotion_static_info")
	private List<HotelPromotionStaticInfo> promotionStaticInfoList;

	/**
	 * 价格计划列表
	 */
	@ApiListField("rate_plans")
	@ApiField("rate_plan")
	private List<RatePlan> ratePlans;

	/**
	 * 退款规则列表
	 */
	@ApiListField("refund_rules")
	@ApiField("refund_rule")
	private List<RefundRule> refundRules;

	public List<BookingRule> getBookingRules() {
		return this.bookingRules;
	}
	public void setBookingRules(List<BookingRule> bookingRules) {
		this.bookingRules = bookingRules;
	}

	public String getHotelId() {
		return this.hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public Boolean getIncrement() {
		return this.increment;
	}
	public void setIncrement(Boolean increment) {
		this.increment = increment;
	}

	public List<HotelPromotionStaticInfo> getPromotionStaticInfoList() {
		return this.promotionStaticInfoList;
	}
	public void setPromotionStaticInfoList(List<HotelPromotionStaticInfo> promotionStaticInfoList) {
		this.promotionStaticInfoList = promotionStaticInfoList;
	}

	public List<RatePlan> getRatePlans() {
		return this.ratePlans;
	}
	public void setRatePlans(List<RatePlan> ratePlans) {
		this.ratePlans = ratePlans;
	}

	public List<RefundRule> getRefundRules() {
		return this.refundRules;
	}
	public void setRefundRules(List<RefundRule> refundRules) {
		this.refundRules = refundRules;
	}

}
