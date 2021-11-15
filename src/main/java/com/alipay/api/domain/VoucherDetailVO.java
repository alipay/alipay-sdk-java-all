package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券详情信息
 *
 * @author auto create
 * @since 1.0, 2021-07-19 15:26:29
 */
public class VoucherDetailVO extends AlipayObject {

	private static final long serialVersionUID = 3282666188357519854L;

	/**
	 * 券对应的活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 优惠金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 活动发起方LOGO
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 活动发起方名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 优惠封顶金额
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 券不可用时间详细规
	 */
	@ApiListField("disable_detail_period")
	@ApiField("time_period_rule")
	private List<TimePeriodRule> disableDetailPeriod;

	/**
	 * 优惠折扣比例
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 券优惠类型; DISCOUNT: 折扣 FIX: 代金
	 */
	@ApiField("discount_calc_type")
	private String discountCalcType;

	/**
	 * 门槛金额
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 单品券场景下, 单品券能够核销的货品ID列表
	 */
	@ApiListField("goods_id")
	@ApiField("string")
	private List<String> goodsId;

	/**
	 * 券的领取时间
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 券状态; ENABLED: 可用, DISABLED: 不可用, EXPIRED: 已过期
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券使用时间详细规则
	 */
	@ApiListField("usable_detail_period")
	@ApiField("time_period_rule")
	private List<TimePeriodRule> usableDetailPeriod;

	/**
	 * 券生效结束时间
	 */
	@ApiField("usable_end_time")
	private String usableEndTime;

	/**
	 * 券生效开始时间
	 */
	@ApiField("usable_start_time")
	private String usableStartTime;

	/**
	 * 券使用说明
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 活动名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券类型; 
GLOBAL_MONEY_OFF_VOUCHER: 全场代金券, 
GLOBAL_DISCOUNT_VOUCHER: 全场折扣券,
ITEM_MONEY_OFF_VOUCHER:单品代金券,
ITEM_DISCOUNT_VOUCHER:单品折扣券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public List<TimePeriodRule> getDisableDetailPeriod() {
		return this.disableDetailPeriod;
	}
	public void setDisableDetailPeriod(List<TimePeriodRule> disableDetailPeriod) {
		this.disableDetailPeriod = disableDetailPeriod;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDiscountCalcType() {
		return this.discountCalcType;
	}
	public void setDiscountCalcType(String discountCalcType) {
		this.discountCalcType = discountCalcType;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public List<String> getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(List<String> goodsId) {
		this.goodsId = goodsId;
	}

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<TimePeriodRule> getUsableDetailPeriod() {
		return this.usableDetailPeriod;
	}
	public void setUsableDetailPeriod(List<TimePeriodRule> usableDetailPeriod) {
		this.usableDetailPeriod = usableDetailPeriod;
	}

	public String getUsableEndTime() {
		return this.usableEndTime;
	}
	public void setUsableEndTime(String usableEndTime) {
		this.usableEndTime = usableEndTime;
	}

	public String getUsableStartTime() {
		return this.usableStartTime;
	}
	public void setUsableStartTime(String usableStartTime) {
		this.usableStartTime = usableStartTime;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
