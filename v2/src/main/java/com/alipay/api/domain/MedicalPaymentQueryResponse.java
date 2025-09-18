package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保支付订单查询接口返回值
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:11:01
 */
public class MedicalPaymentQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 3173588338155972442L;

	/**
	 * 医保个账支付金额
	 */
	@ApiField("account_amount")
	private String accountAmount;

	/**
	 * 下单接口返回的渠道订单流水号
	 */
	@ApiField("chnl_ord_sn")
	private String chnlOrdSn;

	/**
	 * 医保支付失败原因描述
	 */
	@ApiField("error_reason")
	private String errorReason;

	/**
	 * 医疗机构下单时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_out_create")
	private String gmtOutCreate;

	/**
	 * 支付完成时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_paid")
	private String gmtPaid;

	/**
	 * 医保统筹支付金额
	 */
	@ApiField("gov_amount")
	private String govAmount;

	/**
	 * 医保补充计算金额
	 */
	@ApiField("insurance_subsidy_amount")
	private String insuranceSubsidyAmount;

	/**
	 * 医保补充计算方式
	 */
	@ApiField("insurance_subsidy_mode")
	private String insuranceSubsidyMode;

	/**
	 * 医院订单号（商户需保证appId维度唯一）
	 */
	@ApiField("med_org_ord")
	private String medOrgOrd;

	/**
	 * 医保支付状态，详见医保退款状态查询接口返回结果
	 */
	@ApiField("medical_pay_status")
	private String medicalPayStatus;

	/**
	 * 医保退款金额
	 */
	@ApiField("medical_refund_amount")
	private String medicalRefundAmount;

	/**
	 * 支付宝小程序Id
	 */
	@ApiField("openapi_app_id")
	private String openapiAppId;

	/**
	 * 定点医疗机构编码,P/H+11位数字
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 医保支付其他金额
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/**
	 * 第三方平台商单号,取值为商户在下单接口中传入的out_trade_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝侧自费交易单状态
	 */
	@ApiField("own_pay_status")
	private String ownPayStatus;

	/**
	 * 支付订单号（处方上传的出参订单号）
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 订单使用的支付方式描述，MEDICAL_PAYMENT表示医保支付，MIXED_PAYMENT表示混合支付
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 用户自费支付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 自费退款金额
	 */
	@ApiField("real_refund_amount")
	private String realRefundAmount;

	/**
	 * 1:亲情支付,0:本人支付,为空默认0
	 */
	@ApiField("rels_pay_flag")
	private String relsPayFlag;

	/**
	 * 亲情支付代办人脱敏姓名，rels_pay_flag为1时不为空
	 */
	@ApiField("rels_pay_user_name")
	private String relsPayUserName;

	/**
	 * 补充字段描述
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 医疗机构透传体
	 */
	@ApiField("request_content")
	private String requestContent;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝侧自费交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAccountAmount() {
		return this.accountAmount;
	}
	public void setAccountAmount(String accountAmount) {
		this.accountAmount = accountAmount;
	}

	public String getChnlOrdSn() {
		return this.chnlOrdSn;
	}
	public void setChnlOrdSn(String chnlOrdSn) {
		this.chnlOrdSn = chnlOrdSn;
	}

	public String getErrorReason() {
		return this.errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public String getGmtOutCreate() {
		return this.gmtOutCreate;
	}
	public void setGmtOutCreate(String gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}

	public String getGmtPaid() {
		return this.gmtPaid;
	}
	public void setGmtPaid(String gmtPaid) {
		this.gmtPaid = gmtPaid;
	}

	public String getGovAmount() {
		return this.govAmount;
	}
	public void setGovAmount(String govAmount) {
		this.govAmount = govAmount;
	}

	public String getInsuranceSubsidyAmount() {
		return this.insuranceSubsidyAmount;
	}
	public void setInsuranceSubsidyAmount(String insuranceSubsidyAmount) {
		this.insuranceSubsidyAmount = insuranceSubsidyAmount;
	}

	public String getInsuranceSubsidyMode() {
		return this.insuranceSubsidyMode;
	}
	public void setInsuranceSubsidyMode(String insuranceSubsidyMode) {
		this.insuranceSubsidyMode = insuranceSubsidyMode;
	}

	public String getMedOrgOrd() {
		return this.medOrgOrd;
	}
	public void setMedOrgOrd(String medOrgOrd) {
		this.medOrgOrd = medOrgOrd;
	}

	public String getMedicalPayStatus() {
		return this.medicalPayStatus;
	}
	public void setMedicalPayStatus(String medicalPayStatus) {
		this.medicalPayStatus = medicalPayStatus;
	}

	public String getMedicalRefundAmount() {
		return this.medicalRefundAmount;
	}
	public void setMedicalRefundAmount(String medicalRefundAmount) {
		this.medicalRefundAmount = medicalRefundAmount;
	}

	public String getOpenapiAppId() {
		return this.openapiAppId;
	}
	public void setOpenapiAppId(String openapiAppId) {
		this.openapiAppId = openapiAppId;
	}

	public String getOrgNo() {
		return this.orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOtherAmount() {
		return this.otherAmount;
	}
	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getOwnPayStatus() {
		return this.ownPayStatus;
	}
	public void setOwnPayStatus(String ownPayStatus) {
		this.ownPayStatus = ownPayStatus;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getRealRefundAmount() {
		return this.realRefundAmount;
	}
	public void setRealRefundAmount(String realRefundAmount) {
		this.realRefundAmount = realRefundAmount;
	}

	public String getRelsPayFlag() {
		return this.relsPayFlag;
	}
	public void setRelsPayFlag(String relsPayFlag) {
		this.relsPayFlag = relsPayFlag;
	}

	public String getRelsPayUserName() {
		return this.relsPayUserName;
	}
	public void setRelsPayUserName(String relsPayUserName) {
		this.relsPayUserName = relsPayUserName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestContent() {
		return this.requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
