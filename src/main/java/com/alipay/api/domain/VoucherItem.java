package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝券详细信息
 *
 * @author auto create
 * @since 1.0, 2021-07-22 15:25:26
 */
public class VoucherItem extends AlipayObject {

	private static final long serialVersionUID = 2742121226857164262L;

	/**
	 * 券可使用时间规则
	 */
	@ApiListField("available_time_rule")
	@ApiField("voucher_time_rule")
	private List<VoucherTimeRule> availableTimeRule;

	/**
	 * 券可使用过期时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 单品券商品信息
	 */
	@ApiField("item_info")
	private VoucherSingleItemInfo itemInfo;

	/**
	 * 优惠规则：
1）满减类型：券面额 
2）折扣类型：折扣；单次封顶优惠金额
3）减至类型：减至金额
	 */
	@ApiField("promo_info")
	private PromoInfo promoInfo;

	/**
	 * 优惠类型，共三种。
代金(FIX),折扣(DISCOUNT),减至(SPECIAL)
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 用户领取时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("receive_time")
	private String receiveTime;

	/**
	 * 券可使用开始时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 消费门槛金额
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 券不可使用时间规则
	 */
	@ApiListField("unavailable_time_rule")
	@ApiField("voucher_time_rule")
	private List<VoucherTimeRule> unavailableTimeRule;

	/**
	 * 券描述
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券状态：
可用(ENABLED)，已核销(即完全使用，USED)，已过期(EXPIRED)，不可用(DISABLED)，删除(DELETE，已废弃)，
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券类型：
1）商家全场优惠券(ALIPAY_BIZ_VOUCHER)
2）商家单品优惠券(ALIPAY_COMMON_ITEM_VOUCHER)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public List<VoucherTimeRule> getAvailableTimeRule() {
		return this.availableTimeRule;
	}
	public void setAvailableTimeRule(List<VoucherTimeRule> availableTimeRule) {
		this.availableTimeRule = availableTimeRule;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public VoucherSingleItemInfo getItemInfo() {
		return this.itemInfo;
	}
	public void setItemInfo(VoucherSingleItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	public PromoInfo getPromoInfo() {
		return this.promoInfo;
	}
	public void setPromoInfo(PromoInfo promoInfo) {
		this.promoInfo = promoInfo;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public List<VoucherTimeRule> getUnavailableTimeRule() {
		return this.unavailableTimeRule;
	}
	public void setUnavailableTimeRule(List<VoucherTimeRule> unavailableTimeRule) {
		this.unavailableTimeRule = unavailableTimeRule;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
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

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
