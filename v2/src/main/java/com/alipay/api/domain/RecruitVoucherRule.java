package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 招商方案可提报的券的规则
 *
 * @author auto create
 * @since 1.0, 2022-02-23 11:50:46
 */
public class RecruitVoucherRule extends AlipayObject {

	private static final long serialVersionUID = 5639315589578975135L;

	/**
	 * 券面额（每张代金券可以抵扣的金额）的的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
	 */
	@ApiField("amount_max")
	private String amountMax;

	/**
	 * 券面额（每张代金券可以抵扣的金额）的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
	 */
	@ApiField("amount_min")
	private String amountMin;

	/**
	 * 券优惠比例的最大值。20代表优惠比例最多是20%。券优惠券比例=券优惠面额/门槛金额。
浮点类型，取值范围为[1,100]，左右均是闭区间，小数点以后最多保留两位。
该字段为空时表示不限制。
	 */
	@ApiField("denomination_percent_max")
	private String denominationPercentMax;

	/**
	 * 券优惠比例的最小值。10代表优惠比例最少是10%。券优惠券比例=券优惠面额/门槛金额。
浮点类型，取值范围为[1,100]，左右均是闭区间，小数点以后最多保留两位。
该字段为空时表示不限制。
	 */
	@ApiField("denomination_percent_min")
	private String denominationPercentMin;

	/**
	 * 券门槛金额的最大值。
币种为人民币，单位为元。小数点以后最多保留两位。
该字段为空时表示不限制。
	 */
	@ApiField("floor_amount_max")
	private String floorAmountMax;

	/**
	 * 券门槛金额的最小值。
币种为人民币，单位为元。小数点以后最多保留两位。
该字段为空时表示不限制。
	 */
	@ApiField("floor_amount_min")
	private String floorAmountMin;

	/**
	 * 券原价的最大值。
币种为人民币，单位为元。小数点以后最多保留两位。
该字段为空时表示不限制。
	 */
	@ApiField("origin_amount_max")
	private String originAmountMax;

	/**
	 * 券原价的最小值。
币种为人民币，单位为元。小数点以后最多保留两位。
该字段为空时表示不限制。
	 */
	@ApiField("origin_amount_min")
	private String originAmountMin;

	/**
	 * 券发放结束时间的最大值。
格式为：yyyy-MM-dd HH:mm:ss
该字段为空时表示不限制。
	 */
	@ApiField("publish_end_time_max")
	private Date publishEndTimeMax;

	/**
	 * 券发放结束时间的最小值。
格式为：yyyy-MM-dd HH:mm:ss
该字段为空时表示不限制。
	 */
	@ApiField("publish_end_time_min")
	private Date publishEndTimeMin;

	/**
	 * 券发放开始时间的最大值。
格式为：yyyy-MM-dd HH:mm:ss
该字段为空时表示不限制。
	 */
	@ApiField("publish_start_time_max")
	private Date publishStartTimeMax;

	/**
	 * 券发放开始时间的最小值。
格式为：yyyy-MM-dd HH:mm:ss
该字段为空时表示不限制。
	 */
	@ApiField("publish_start_time_min")
	private Date publishStartTimeMin;

	/**
	 * 退券类型要求，列表，总共有两种类型：
过期退OVERDUE_REFUND
随时退CAN_REFUND
该字段为空时表示不限制。
	 */
	@ApiListField("refund_type")
	@ApiField("string")
	private List<String> refundType;

	/**
	 * 用户购买优惠券需要支付的金额的最大值。
币种为人民币，单位为元。小数点以后最多保留两位。
该字段为空时表示不限制。
	 */
	@ApiField("sale_amount_max")
	private String saleAmountMax;

	/**
	 * 用户购买优惠券需要支付的金额的最小值。
币种为人民币，单位为元。小数点以后最多保留两位。
该字段为空时表示不限制。
	 */
	@ApiField("sale_amount_min")
	private String saleAmountMin;

	/**
	 * 券核销渠道要求，列表，总共有两个渠道：
门店SHOP
小程序MINI_APP
该字段为空时表示不限制。
	 */
	@ApiListField("use_channel")
	@ApiField("string")
	private List<String> useChannel;

	/**
	 * 券生效后至少N天内可以使用。比如：valid_days_after_receive_min=20代表
券生效后至少20天内可以使用。
该字段为空时表示不限制。
	 */
	@ApiField("valid_days_after_receive_min")
	private Long validDaysAfterReceiveMin;

	/**
	 * 券活动类型。支持七种商家券类型和两种支付券类型。

枚举值：
商家券类型：
	ALL_FIX_ORDER_VOUCHER 全场满减券；
	ITEM_FIX_ORDER_VOUCHER 单品满减券；
	ALL_DISCOUNT_ORDER_VOUCHER 全场折扣券；
	ITEM_DISCOUNT_ORDER_VOUCHER 单品折扣券；
	ITEM_SPE_ORDER_VOUCHER 单品特价券；
	EXCHANGE_GROUP_BUY_ORDER_VOUCHER 兑换团购券；
	EXCHANGE_FIX_ORDER_VOUCHER 兑换代金券；

支付券类型：
	ALL_FIX_VOUCHER 全场满减券；
	ITEM_FIX_VOUCHER 单品满减券；

创建商家券参考https://opendocs.alipay.com/apis/01xm17
创建支付券参考https://opendocs.alipay.com/pre-apis/027185（仅供受邀用户使用）
不同的创建券的参数创建出不同类型的券：
 1. 根据voucher_type区分满减券、折扣券、特价券、兑换券
 2. 根据goods_name是否为空区分单品券、全场券（当voucher_type为满减券、折扣券、特价券）
 3. 根据voucher_use_rule.exchange_voucher.biz_type区分团购券、代金券（当voucher_type为兑换券）
	 */
	@ApiField("voucher_activity_type")
	private String voucherActivityType;

	/**
	 * 每人领取限制的最大值。
默认按照支付宝uid进行领取限制。
该字段为空时表示不限制。
	 */
	@ApiField("voucher_quantity_limit_per_user_max")
	private Long voucherQuantityLimitPerUserMax;

	/**
	 * 每人领取限制的最小值。
默认按照支付宝uid进行领取限制。
该字段为空时表示不限制。
	 */
	@ApiField("voucher_quantity_limit_per_user_min")
	private Long voucherQuantityLimitPerUserMin;

	/**
	 * 券库存数量的最大值。
该字段为空时表示不限制。
	 */
	@ApiField("voucher_quantity_max")
	private Long voucherQuantityMax;

	/**
	 * 券库存数量的最小值。
该字段为空时表示不限制。
	 */
	@ApiField("voucher_quantity_min")
	private Long voucherQuantityMin;

	/**
	 * 券可使用的开始时间的最小值。
格式为：yyyy-MM-dd HH:mm:ss
该字段为空时表示不限制。
	 */
	@ApiField("voucher_valid_begin_time_min")
	private Date voucherValidBeginTimeMin;

	/**
	 * 券可使用的结束时间的最大值。
格式为：yyyy-MM-dd HH:mm:ss
该字段为空时表示不限制。
	 */
	@ApiField("voucher_valid_end_time_max")
	private Date voucherValidEndTimeMax;

	public String getAmountMax() {
		return this.amountMax;
	}
	public void setAmountMax(String amountMax) {
		this.amountMax = amountMax;
	}

	public String getAmountMin() {
		return this.amountMin;
	}
	public void setAmountMin(String amountMin) {
		this.amountMin = amountMin;
	}

	public String getDenominationPercentMax() {
		return this.denominationPercentMax;
	}
	public void setDenominationPercentMax(String denominationPercentMax) {
		this.denominationPercentMax = denominationPercentMax;
	}

	public String getDenominationPercentMin() {
		return this.denominationPercentMin;
	}
	public void setDenominationPercentMin(String denominationPercentMin) {
		this.denominationPercentMin = denominationPercentMin;
	}

	public String getFloorAmountMax() {
		return this.floorAmountMax;
	}
	public void setFloorAmountMax(String floorAmountMax) {
		this.floorAmountMax = floorAmountMax;
	}

	public String getFloorAmountMin() {
		return this.floorAmountMin;
	}
	public void setFloorAmountMin(String floorAmountMin) {
		this.floorAmountMin = floorAmountMin;
	}

	public String getOriginAmountMax() {
		return this.originAmountMax;
	}
	public void setOriginAmountMax(String originAmountMax) {
		this.originAmountMax = originAmountMax;
	}

	public String getOriginAmountMin() {
		return this.originAmountMin;
	}
	public void setOriginAmountMin(String originAmountMin) {
		this.originAmountMin = originAmountMin;
	}

	public Date getPublishEndTimeMax() {
		return this.publishEndTimeMax;
	}
	public void setPublishEndTimeMax(Date publishEndTimeMax) {
		this.publishEndTimeMax = publishEndTimeMax;
	}

	public Date getPublishEndTimeMin() {
		return this.publishEndTimeMin;
	}
	public void setPublishEndTimeMin(Date publishEndTimeMin) {
		this.publishEndTimeMin = publishEndTimeMin;
	}

	public Date getPublishStartTimeMax() {
		return this.publishStartTimeMax;
	}
	public void setPublishStartTimeMax(Date publishStartTimeMax) {
		this.publishStartTimeMax = publishStartTimeMax;
	}

	public Date getPublishStartTimeMin() {
		return this.publishStartTimeMin;
	}
	public void setPublishStartTimeMin(Date publishStartTimeMin) {
		this.publishStartTimeMin = publishStartTimeMin;
	}

	public List<String> getRefundType() {
		return this.refundType;
	}
	public void setRefundType(List<String> refundType) {
		this.refundType = refundType;
	}

	public String getSaleAmountMax() {
		return this.saleAmountMax;
	}
	public void setSaleAmountMax(String saleAmountMax) {
		this.saleAmountMax = saleAmountMax;
	}

	public String getSaleAmountMin() {
		return this.saleAmountMin;
	}
	public void setSaleAmountMin(String saleAmountMin) {
		this.saleAmountMin = saleAmountMin;
	}

	public List<String> getUseChannel() {
		return this.useChannel;
	}
	public void setUseChannel(List<String> useChannel) {
		this.useChannel = useChannel;
	}

	public Long getValidDaysAfterReceiveMin() {
		return this.validDaysAfterReceiveMin;
	}
	public void setValidDaysAfterReceiveMin(Long validDaysAfterReceiveMin) {
		this.validDaysAfterReceiveMin = validDaysAfterReceiveMin;
	}

	public String getVoucherActivityType() {
		return this.voucherActivityType;
	}
	public void setVoucherActivityType(String voucherActivityType) {
		this.voucherActivityType = voucherActivityType;
	}

	public Long getVoucherQuantityLimitPerUserMax() {
		return this.voucherQuantityLimitPerUserMax;
	}
	public void setVoucherQuantityLimitPerUserMax(Long voucherQuantityLimitPerUserMax) {
		this.voucherQuantityLimitPerUserMax = voucherQuantityLimitPerUserMax;
	}

	public Long getVoucherQuantityLimitPerUserMin() {
		return this.voucherQuantityLimitPerUserMin;
	}
	public void setVoucherQuantityLimitPerUserMin(Long voucherQuantityLimitPerUserMin) {
		this.voucherQuantityLimitPerUserMin = voucherQuantityLimitPerUserMin;
	}

	public Long getVoucherQuantityMax() {
		return this.voucherQuantityMax;
	}
	public void setVoucherQuantityMax(Long voucherQuantityMax) {
		this.voucherQuantityMax = voucherQuantityMax;
	}

	public Long getVoucherQuantityMin() {
		return this.voucherQuantityMin;
	}
	public void setVoucherQuantityMin(Long voucherQuantityMin) {
		this.voucherQuantityMin = voucherQuantityMin;
	}

	public Date getVoucherValidBeginTimeMin() {
		return this.voucherValidBeginTimeMin;
	}
	public void setVoucherValidBeginTimeMin(Date voucherValidBeginTimeMin) {
		this.voucherValidBeginTimeMin = voucherValidBeginTimeMin;
	}

	public Date getVoucherValidEndTimeMax() {
		return this.voucherValidEndTimeMax;
	}
	public void setVoucherValidEndTimeMax(Date voucherValidEndTimeMax) {
		this.voucherValidEndTimeMax = voucherValidEndTimeMax;
	}

}
