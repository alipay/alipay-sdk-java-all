package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 已投放活动信息
 *
 * @author auto create
 * @since 1.0, 2022-07-25 10:25:51
 */
public class DeliveryActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 4214467293856322127L;

	/**
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 卡bin的列表
	 */
	@ApiListField("bank_card_bin_list")
	@ApiField("string")
	private List<String> bankCardBinList;

	/**
	 * 卡类型：
"CREDIT"--信用卡，
"DEBIT"--借记卡
	 */
	@ApiField("bank_card_type")
	private String bankCardType;

	/**
	 * 银行机构号
	 */
	@ApiField("bank_inst_id")
	private String bankInstId;

	/**
	 * 银行logo
	 */
	@ApiField("bank_logo")
	private String bankLogo;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 红包可能的最大金额，分
	 */
	@ApiField("discount_max_amount")
	private Long discountMaxAmount;

	/**
	 * 折扣率，8折80，7.7折 77
	 */
	@ApiField("discount_max_ratio")
	private Long discountMaxRatio;

	/**
	 * 优惠模式：
voucher--红包，
reduce--立减
	 */
	@ApiField("discount_model")
	private String discountModel;

	/**
	 * 红包门槛金额，分
	 */
	@ApiField("discount_threshold_amount")
	private Long discountThresholdAmount;

	/**
	 * 优惠类型，满立减（首绑、立减、渠道、多刷）、折扣（立减）
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 红包使用的场景列表
	 */
	@ApiListField("discount_use_scene_list")
	@ApiField("string")
	private List<String> discountUseSceneList;

	/**
	 * 活动开始时间
	 */
	@ApiField("gmt_begin")
	private Date gmtBegin;

	/**
	 * 活动结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 券模板id
	 */
	@ApiField("voucher_template_id")
	private String voucherTemplateId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public List<String> getBankCardBinList() {
		return this.bankCardBinList;
	}
	public void setBankCardBinList(List<String> bankCardBinList) {
		this.bankCardBinList = bankCardBinList;
	}

	public String getBankCardType() {
		return this.bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getBankInstId() {
		return this.bankInstId;
	}
	public void setBankInstId(String bankInstId) {
		this.bankInstId = bankInstId;
	}

	public String getBankLogo() {
		return this.bankLogo;
	}
	public void setBankLogo(String bankLogo) {
		this.bankLogo = bankLogo;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Long getDiscountMaxAmount() {
		return this.discountMaxAmount;
	}
	public void setDiscountMaxAmount(Long discountMaxAmount) {
		this.discountMaxAmount = discountMaxAmount;
	}

	public Long getDiscountMaxRatio() {
		return this.discountMaxRatio;
	}
	public void setDiscountMaxRatio(Long discountMaxRatio) {
		this.discountMaxRatio = discountMaxRatio;
	}

	public String getDiscountModel() {
		return this.discountModel;
	}
	public void setDiscountModel(String discountModel) {
		this.discountModel = discountModel;
	}

	public Long getDiscountThresholdAmount() {
		return this.discountThresholdAmount;
	}
	public void setDiscountThresholdAmount(Long discountThresholdAmount) {
		this.discountThresholdAmount = discountThresholdAmount;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public List<String> getDiscountUseSceneList() {
		return this.discountUseSceneList;
	}
	public void setDiscountUseSceneList(List<String> discountUseSceneList) {
		this.discountUseSceneList = discountUseSceneList;
	}

	public Date getGmtBegin() {
		return this.gmtBegin;
	}
	public void setGmtBegin(Date gmtBegin) {
		this.gmtBegin = gmtBegin;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getVoucherTemplateId() {
		return this.voucherTemplateId;
	}
	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}

}
