package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 价格计划
 *
 * @author auto create
 * @since 1.0, 2024-07-05 18:25:10
 */
public class RatePlan extends AlipayObject {

	private static final long serialVersionUID = 8164865518774876961L;

	/**
	 * 对应的预订规则编号列表
多个同时满足条件默认选第一个规则
	 */
	@ApiListField("booking_rule_ids")
	@ApiField("string")
	private List<String> bookingRuleIds;

	/**
	 * 平均确认时长分钟数，IsInstantConfirm 为false时需传该值
	 */
	@ApiField("confirm_minutes")
	private Long confirmMinutes;

	/**
	 * 客人类型
All:统一价
DOMESTIC：内宾
FOREIGNER：外宾
	 */
	@ApiField("customer_type")
	private String customerType;

	/**
	 * 证件数量类型：
      0：无特殊要求（下单不用证件）
     *1：整个订单需一个证件
     *2：订单中每个房间需一个证件
	 */
	@ApiField("identification")
	private Long identification;

	/**
	 * 需要的证件类型，多个值标识任意一种证件类型都可以,枚举值见下：
IDENTITY_CARD: 身份证
PASSPORT:护照
	 */
	@ApiListField("identification_type")
	@ApiField("string")
	private List<String> identificationType;

	/**
	 * 是否即时确认
	 */
	@ApiField("instant_confirmation")
	private Boolean instantConfirmation;

	/**
	 * 发票类型
	 */
	@ApiField("invoice")
	private HotelInvoice invoice;

	/**
	 * 每日价格列表
	 */
	@ApiListField("nightly_rates")
	@ApiField("nightly_rate")
	private List<NightlyRate> nightlyRates;

	/**
	 * 对应ota小程序的跳转链接
	 */
	@ApiField("ota_url")
	private String otaUrl;

	/**
	 * 付款类型
SELFPAY-前台现付,
PREPAY-预付
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 价格计划中对应的套餐信息，目前支持一个价格计划对应一个套餐，可以为空
	 */
	@ApiField("pkg_product_ids")
	private String pkgProductIds;

	/**
	 * 价格计划id
	 */
	@ApiField("rate_plan_id")
	private String ratePlanId;

	/**
	 * 价格计划标签列表
	 */
	@ApiListField("rate_plan_labels")
	@ApiField("rate_plan_label")
	private List<RatePlanLabel> ratePlanLabels;

	/**
	 * 产品名称
	 */
	@ApiField("rate_plan_name")
	private String ratePlanName;

	/**
	 * 对应退款规则编号
	 */
	@ApiField("refund_rule_id")
	private String refundRuleId;

	/**
	 * 退款规则列表
	 */
	@ApiListField("refund_rule_ids")
	@ApiField("string")
	private List<String> refundRuleIds;

	/**
	 * ratePlan对应的房间id
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 销售状态
true:在售
false:失效
	 */
	@ApiField("status")
	private Boolean status;

	/**
	 * 供应商信息
	 */
	@ApiField("supplier_source")
	private String supplierSource;

	public List<String> getBookingRuleIds() {
		return this.bookingRuleIds;
	}
	public void setBookingRuleIds(List<String> bookingRuleIds) {
		this.bookingRuleIds = bookingRuleIds;
	}

	public Long getConfirmMinutes() {
		return this.confirmMinutes;
	}
	public void setConfirmMinutes(Long confirmMinutes) {
		this.confirmMinutes = confirmMinutes;
	}

	public String getCustomerType() {
		return this.customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Long getIdentification() {
		return this.identification;
	}
	public void setIdentification(Long identification) {
		this.identification = identification;
	}

	public List<String> getIdentificationType() {
		return this.identificationType;
	}
	public void setIdentificationType(List<String> identificationType) {
		this.identificationType = identificationType;
	}

	public Boolean getInstantConfirmation() {
		return this.instantConfirmation;
	}
	public void setInstantConfirmation(Boolean instantConfirmation) {
		this.instantConfirmation = instantConfirmation;
	}

	public HotelInvoice getInvoice() {
		return this.invoice;
	}
	public void setInvoice(HotelInvoice invoice) {
		this.invoice = invoice;
	}

	public List<NightlyRate> getNightlyRates() {
		return this.nightlyRates;
	}
	public void setNightlyRates(List<NightlyRate> nightlyRates) {
		this.nightlyRates = nightlyRates;
	}

	public String getOtaUrl() {
		return this.otaUrl;
	}
	public void setOtaUrl(String otaUrl) {
		this.otaUrl = otaUrl;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPkgProductIds() {
		return this.pkgProductIds;
	}
	public void setPkgProductIds(String pkgProductIds) {
		this.pkgProductIds = pkgProductIds;
	}

	public String getRatePlanId() {
		return this.ratePlanId;
	}
	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	public List<RatePlanLabel> getRatePlanLabels() {
		return this.ratePlanLabels;
	}
	public void setRatePlanLabels(List<RatePlanLabel> ratePlanLabels) {
		this.ratePlanLabels = ratePlanLabels;
	}

	public String getRatePlanName() {
		return this.ratePlanName;
	}
	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}

	public String getRefundRuleId() {
		return this.refundRuleId;
	}
	public void setRefundRuleId(String refundRuleId) {
		this.refundRuleId = refundRuleId;
	}

	public List<String> getRefundRuleIds() {
		return this.refundRuleIds;
	}
	public void setRefundRuleIds(List<String> refundRuleIds) {
		this.refundRuleIds = refundRuleIds;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Boolean getStatus() {
		return this.status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getSupplierSource() {
		return this.supplierSource;
	}
	public void setSupplierSource(String supplierSource) {
		this.supplierSource = supplierSource;
	}

}
