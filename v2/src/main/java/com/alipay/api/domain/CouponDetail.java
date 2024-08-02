package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠券详情信息
 *
 * @author auto create
 * @since 1.0, 2024-05-22 16:19:37
 */
public class CouponDetail extends AlipayObject {

	private static final long serialVersionUID = 7625582168463753773L;

	/**
	 * 活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 面额(分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 优惠券编码
	 */
	@ApiField("coupon_code")
	private String couponCode;

	/**
	 * 优惠券内容详情
	 */
	@ApiField("coupon_desc")
	private String couponDesc;

	/**
	 * 优惠券标题
	 */
	@ApiField("coupon_title")
	private String couponTitle;

	/**
	 * 优惠券类型
 - VOUCHER
 - DISCOUNT
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 优惠券使用限制列表
	 */
	@ApiListField("coupon_use_products")
	@ApiField("coupon_use_product")
	private List<CouponUseProduct> couponUseProducts;

	/**
	 * 折扣（0-1）
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商品最大购买数量可用
	 */
	@ApiField("purchase_max_num")
	private String purchaseMaxNum;

	/**
	 * 商品最少购买数量可用
	 */
	@ApiField("purchase_min_num")
	private String purchaseMinNum;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 优惠券状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 使用门槛-无门槛传0
	 */
	@ApiField("use_threshold")
	private String useThreshold;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCouponCode() {
		return this.couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponDesc() {
		return this.couponDesc;
	}
	public void setCouponDesc(String couponDesc) {
		this.couponDesc = couponDesc;
	}

	public String getCouponTitle() {
		return this.couponTitle;
	}
	public void setCouponTitle(String couponTitle) {
		this.couponTitle = couponTitle;
	}

	public String getCouponType() {
		return this.couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public List<CouponUseProduct> getCouponUseProducts() {
		return this.couponUseProducts;
	}
	public void setCouponUseProducts(List<CouponUseProduct> couponUseProducts) {
		this.couponUseProducts = couponUseProducts;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPurchaseMaxNum() {
		return this.purchaseMaxNum;
	}
	public void setPurchaseMaxNum(String purchaseMaxNum) {
		this.purchaseMaxNum = purchaseMaxNum;
	}

	public String getPurchaseMinNum() {
		return this.purchaseMinNum;
	}
	public void setPurchaseMinNum(String purchaseMinNum) {
		this.purchaseMinNum = purchaseMinNum;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUseThreshold() {
		return this.useThreshold;
	}
	public void setUseThreshold(String useThreshold) {
		this.useThreshold = useThreshold;
	}

}
