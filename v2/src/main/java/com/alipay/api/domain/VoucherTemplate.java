package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝券模板模型
 *
 * @author auto create
 * @since 1.0, 2021-04-02 16:34:28
 */
public class VoucherTemplate extends AlipayObject {

	private static final long serialVersionUID = 1491597955878986384L;

	/**
	 * 券可使用时间规则
	 */
	@ApiListField("available_time_rule")
	@ApiField("voucher_time_rule")
	private List<VoucherTimeRule> availableTimeRule;

	/**
	 * 时间类型：
绝对时间(ABSOLUTE)，相对时间(RELATIVE)，
相对时间按天(RELATIVE_BY_DAY)
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 券可使用过期时间：
1）绝对时间，格式为：yyyy-MM-dd HH:mm:ss
2）相对时间，格式为：N，如100，即相对于领取时间之后的分钟数
3）相对时间按天，格式为：N，如100，即相对于领取时间当日0点之后的分钟数
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 单品券信息
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
	 * 优惠类型：
代金(FIX),折扣(DISCOUNT),减至(SPECIAL)
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 券可使用开始时间：
1）绝对时间，格式为：yyyy-MM-dd HH:mm:ss
2）相对时间，格式为：N，如100，即相对于领取时间之后的分钟数
3）相对时间按天，格式为：N，如100，即相对于领取时间当日0点之后的分钟数
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
	 * 券核销范围信息
	 */
	@ApiField("use_scope_info")
	private VoucherUseScopeInfo useScopeInfo;

	/**
	 * 券描述
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 优惠券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券总张数
	 */
	@ApiField("voucher_quantity")
	private String voucherQuantity;

	/**
	 * 券类型： 1）商家全场优惠券(ALIPAY_BIZ_VOUCHER) 2）商家单品优惠券(ALIPAY_COMMON_ITEM_VOUCHER)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public List<VoucherTimeRule> getAvailableTimeRule() {
		return this.availableTimeRule;
	}
	public void setAvailableTimeRule(List<VoucherTimeRule> availableTimeRule) {
		this.availableTimeRule = availableTimeRule;
	}

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

	public VoucherUseScopeInfo getUseScopeInfo() {
		return this.useScopeInfo;
	}
	public void setUseScopeInfo(VoucherUseScopeInfo useScopeInfo) {
		this.useScopeInfo = useScopeInfo;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
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
