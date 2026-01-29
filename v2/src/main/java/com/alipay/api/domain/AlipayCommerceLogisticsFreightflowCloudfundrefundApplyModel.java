package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运企付_云资金收银台退款申请
 *
 * @author auto create
 * @since 1.0, 2025-12-22 10:27:42
 */
public class AlipayCommerceLogisticsFreightflowCloudfundrefundApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5685475693796278412L;

	/**
	 * 退款业务流水号(根据业务流水号进行幂等处理)
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 收银台创单时的业务流水号
	 */
	@ApiField("cloud_fund_biz_no")
	private String cloudFundBizNo;

	/**
	 * mode为网商银行时：
收银台创单完成后响应参数中的order_no参数值
	 */
	@ApiField("cloud_fund_order_no")
	private String cloudFundOrderNo;

	/**
	 * 币种，必须同原交易
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 与运企付约定的物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行提供给商户的appId
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 退款付方id，即原支付单收方 
如果是商户，则填入merchantId；
如果是平台，则填入isvOrgId；
如果是子户，则填入子户外标(子户号)
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 退款付方类型，即原支付单收方
	 */
	@ApiField("participant_type")
	private String participantType;

	/**
	 * 如果mode为网商银行代表网商银行分配的合作方机构号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 退款金额,单位：分
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCloudFundBizNo() {
		return this.cloudFundBizNo;
	}
	public void setCloudFundBizNo(String cloudFundBizNo) {
		this.cloudFundBizNo = cloudFundBizNo;
	}

	public String getCloudFundOrderNo() {
		return this.cloudFundOrderNo;
	}
	public void setCloudFundOrderNo(String cloudFundOrderNo) {
		this.cloudFundOrderNo = cloudFundOrderNo;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMybankAppId() {
		return this.mybankAppId;
	}
	public void setMybankAppId(String mybankAppId) {
		this.mybankAppId = mybankAppId;
	}

	public String getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getParticipantType() {
		return this.participantType;
	}
	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}
