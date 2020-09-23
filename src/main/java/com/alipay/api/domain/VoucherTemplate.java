package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝券模板模型
 *
 * @author auto create
 * @since 1.0, 2020-09-11 22:07:54
 */
public class VoucherTemplate extends AlipayObject {

	private static final long serialVersionUID = 3368853321396357926L;

	/**
	 * 劵有效期时间类型 (绝对时间:ABSOLUTE 相对时间:RELATIVE)
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 过期时间，绝对时间格式为：yyyy-MM-dd HH:mm:ss，相对时间格式为：20，为使用截止时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 满减类型：券面额

折扣类型：折扣；单次封顶优惠金额；

减至：减至金额；
	 */
	@ApiField("promo_info")
	private PromoInfo promoInfo;

	/**
	 * 优惠类型：代金\折扣\减至
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 发券时间，绝对时间格式为：yyyy-MM-dd HH:mm:ss，相对时间格式为：10，为使用开始时间
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
	 * 优惠券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 优惠归属为商家优惠时，优惠类型包括：商家全场券（ALIPAY_BIZ_VOUCHER）、单品优惠券(ALIPAY_COMMON_ITEM_VOUCHER)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getDateType() {
		return this.dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
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
