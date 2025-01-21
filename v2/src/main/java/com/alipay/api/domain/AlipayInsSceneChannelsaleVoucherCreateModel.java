package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证发放
 *
 * @author auto create
 * @since 1.0, 2024-07-17 14:07:16
 */
public class AlipayInsSceneChannelsaleVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5843491959321197176L;

	/**
	 * 凭证业务扩展字段
	 */
	@ApiField("biz_data")
	private InsOpenVoucherBizDataDTO bizData;

	/**
	 * 渠道商户ID，由蚂蚁保统一分配
	 */
	@ApiField("channel_merchant_id")
	private String channelMerchantId;

	/**
	 * 渠道商户类型，由蚂蚁保分配
	 */
	@ApiField("channel_merchant_type")
	private String channelMerchantType;

	/**
	 * 操作人ID，实际操作凭证发放的人员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 外部业务单号，外部关联本次发放凭证的唯一单据
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作商ID，由蚂蚁保统一分配
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 产品方案ID，由蚂蚁保分配
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 订购商户ID，由蚂蚁保统一分配
	 */
	@ApiField("purchase_merchant_id")
	private String purchaseMerchantId;

	/**
	 * 同蚂蚁保约定确定
	 */
	@ApiField("registered_subject_id")
	private String registeredSubjectId;

	/**
	 * 发放类型
	 */
	@ApiField("send_type")
	private String sendType;

	public InsOpenVoucherBizDataDTO getBizData() {
		return this.bizData;
	}
	public void setBizData(InsOpenVoucherBizDataDTO bizData) {
		this.bizData = bizData;
	}

	public String getChannelMerchantId() {
		return this.channelMerchantId;
	}
	public void setChannelMerchantId(String channelMerchantId) {
		this.channelMerchantId = channelMerchantId;
	}

	public String getChannelMerchantType() {
		return this.channelMerchantType;
	}
	public void setChannelMerchantType(String channelMerchantType) {
		this.channelMerchantType = channelMerchantType;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

	public String getPurchaseMerchantId() {
		return this.purchaseMerchantId;
	}
	public void setPurchaseMerchantId(String purchaseMerchantId) {
		this.purchaseMerchantId = purchaseMerchantId;
	}

	public String getRegisteredSubjectId() {
		return this.registeredSubjectId;
	}
	public void setRegisteredSubjectId(String registeredSubjectId) {
		this.registeredSubjectId = registeredSubjectId;
	}

	public String getSendType() {
		return this.sendType;
	}
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

}
