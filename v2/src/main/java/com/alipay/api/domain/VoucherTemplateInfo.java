package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券模板信息
 *
 * @author auto create
 * @since 1.0, 2021-07-19 15:26:24
 */
public class VoucherTemplateInfo extends AlipayObject {

	private static final long serialVersionUID = 2376344757767719445L;

	/**
	 * 面额。每张代金券可以抵扣的金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 优惠封顶金额
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 券不可用时间详细规则
	 */
	@ApiListField("disable_detail_periods")
	@ApiField("time_period_rule")
	private List<TimePeriodRule> disableDetailPeriods;

	/**
	 * 单品价格可以享受的折扣力度（如填写0.9就表示9折）。 该值大于等于0.1且小于1，小数点以后最多保留两位。
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
	 * 单品id列表, 单品券场景返回该字段
	 */
	@ApiListField("goods_id")
	@ApiField("string")
	private List<String> goodsId;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

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
	 * 时间类型
RELATIVE: 相对类型
RELATIVE_BY_DAY: 相对类型按天取整
ABSOLUTE:绝对类型
	 */
	@ApiField("usable_time_type")
	private String usableTimeType;

	/**
	 * 券使用说明
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 优惠券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 拟发行券的数量。单位为张。该数值是大于0的整数。
	 */
	@ApiField("voucher_quantity")
	private String voucherQuantity;

	/**
	 * 券类型; GLOBAL_MONEY_OFF_VOUCHER: 全场代金券, GLOBAL_DISCOUNT_VOUCHER: 全场折扣券, ITEM_MONEY_OFF_VOUCHER:单品代金券, ITEM_DISCOUNT_VOUCHER:单品折扣券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public List<TimePeriodRule> getDisableDetailPeriods() {
		return this.disableDetailPeriods;
	}
	public void setDisableDetailPeriods(List<TimePeriodRule> disableDetailPeriods) {
		this.disableDetailPeriods = disableDetailPeriods;
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

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
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

	public String getUsableTimeType() {
		return this.usableTimeType;
	}
	public void setUsableTimeType(String usableTimeType) {
		this.usableTimeType = usableTimeType;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherQuantity() {
		return this.voucherQuantity;
	}
	public void setVoucherQuantity(String voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
