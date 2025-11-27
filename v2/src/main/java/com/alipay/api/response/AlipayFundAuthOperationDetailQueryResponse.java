package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreditRiskInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.operation.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:44
 */
public class AlipayFundAuthOperationDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2113963568163376913L;

	/** 
	 * 该笔资金操作流水operation_id对应的操作金额，单位为：元（人民币）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 该笔资金操作流水operation_id对应的操作信用金额
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/** 
	 * 芝麻透出给商户的信息，具体内容由商户与芝麻约定后返回
	 */
	@ApiField("credit_merchant_ext")
	private String creditMerchantExt;

	/** 
	 * 信用风险信息，如租物场景风险等级、履约历史等级等
	 */
	@ApiField("credit_risk_info")
	private CreditRiskInfo creditRiskInfo;

	/** 
	 * 因公付业务信息
	 */
	@ApiField("enterprise_pay_info")
	private String enterprisePayInfo;

	/** 
	 * 商户请求创建预授权订单时传入的扩展参数，仅返回商户自定义的扩展信息（merchantExt）
	 */
	@ApiField("extra_param")
	private String extraParam;

	/** 
	 * 该笔资金操作流水operation_id对应的操作自有资金金额
	 */
	@ApiField("fund_amount")
	private String fundAmount;

	/** 
	 * 资金授权单据操作流水创建时间，
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 支付宝账务处理成功时间，
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝资金操作流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 支付宝资金操作类型，表示当前查询到的这笔明细的操作类型。
	 */
	@ApiField("operation_type")
	private String operationType;

	/** 
	 * 授权单状态：INIT（初始状态：已创建未授权）、AUTHORIZED（已授权状态：授权成功，可以进行转支付或解冻操作）、FINISH（完成状态：转支付完成且无剩余冻结资金）、CLOSED（关闭状态：授权未完成超时关闭或冻结资金全额解冻）
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 业务订单的简单描述，如商品名称等
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 付款方支付宝账号（Email或手机号），仅作展示使用，默认会加“*”号处理
	 */
	@ApiField("payer_logon_id")
	private String payerLogonId;

	/** 
	 * 支付宝openId，用户（userId）在应用（appId）下的唯一标识。
	 */
	@ApiField("payer_open_id")
	private String payerOpenId;

	/** 
	 * 付款方支付宝账号对应的支付宝唯一用户号，以2088开头的16位纯数字组成
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/** 
	 * 预授权类型，信用预授权情况下值为 CREDIT_AUTH，表示该笔预授权为信用预授权，实际没有冻结用户资金；其它情况均不返回该字段。
	 */
	@ApiField("pre_auth_type")
	private String preAuthType;

	/** 
	 * 商户对本次操作的附言描述，长度不超过100个字母或50个汉字
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 订单当前剩余冻结金额，单位为：元（人民币）。
	 */
	@ApiField("rest_amount")
	private String restAmount;

	/** 
	 * 剩余冻结信用金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("rest_credit_amount")
	private String restCreditAmount;

	/** 
	 * 剩余冻结自有资金金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("rest_fund_amount")
	private String restFundAmount;

	/** 
	 * 资金操作流水的状态，
目前支持： 
INIT：初始
SUCCESS：成功
CLOSED：关闭
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单累计的冻结金额，单位为：元（人民币）
	 */
	@ApiField("total_freeze_amount")
	private String totalFreezeAmount;

	/** 
	 * 累计冻结信用金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("total_freeze_credit_amount")
	private String totalFreezeCreditAmount;

	/** 
	 * 累计冻结自有资金金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("total_freeze_fund_amount")
	private String totalFreezeFundAmount;

	/** 
	 * 订单累计用于支付的金额，单位为：元（人民币）
	 */
	@ApiField("total_pay_amount")
	private String totalPayAmount;

	/** 
	 * 累计支付信用金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("total_pay_credit_amount")
	private String totalPayCreditAmount;

	/** 
	 * 累计支付自有资金金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("total_pay_fund_amount")
	private String totalPayFundAmount;

	/** 
	 * 标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCreditAmount( ) {
		return this.creditAmount;
	}

	public void setCreditMerchantExt(String creditMerchantExt) {
		this.creditMerchantExt = creditMerchantExt;
	}
	public String getCreditMerchantExt( ) {
		return this.creditMerchantExt;
	}

	public void setCreditRiskInfo(CreditRiskInfo creditRiskInfo) {
		this.creditRiskInfo = creditRiskInfo;
	}
	public CreditRiskInfo getCreditRiskInfo( ) {
		return this.creditRiskInfo;
	}

	public void setEnterprisePayInfo(String enterprisePayInfo) {
		this.enterprisePayInfo = enterprisePayInfo;
	}
	public String getEnterprisePayInfo( ) {
		return this.enterprisePayInfo;
	}

	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}
	public String getExtraParam( ) {
		return this.extraParam;
	}

	public void setFundAmount(String fundAmount) {
		this.fundAmount = fundAmount;
	}
	public String getFundAmount( ) {
		return this.fundAmount;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtTrans(Date gmtTrans) {
		this.gmtTrans = gmtTrans;
	}
	public Date getGmtTrans( ) {
		return this.gmtTrans;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getOperationId( ) {
		return this.operationId;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getOperationType( ) {
		return this.operationType;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public String getOrderTitle( ) {
		return this.orderTitle;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setPayerLogonId(String payerLogonId) {
		this.payerLogonId = payerLogonId;
	}
	public String getPayerLogonId( ) {
		return this.payerLogonId;
	}

	public void setPayerOpenId(String payerOpenId) {
		this.payerOpenId = payerOpenId;
	}
	public String getPayerOpenId( ) {
		return this.payerOpenId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	public String getPayerUserId( ) {
		return this.payerUserId;
	}

	public void setPreAuthType(String preAuthType) {
		this.preAuthType = preAuthType;
	}
	public String getPreAuthType( ) {
		return this.preAuthType;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setRestAmount(String restAmount) {
		this.restAmount = restAmount;
	}
	public String getRestAmount( ) {
		return this.restAmount;
	}

	public void setRestCreditAmount(String restCreditAmount) {
		this.restCreditAmount = restCreditAmount;
	}
	public String getRestCreditAmount( ) {
		return this.restCreditAmount;
	}

	public void setRestFundAmount(String restFundAmount) {
		this.restFundAmount = restFundAmount;
	}
	public String getRestFundAmount( ) {
		return this.restFundAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalFreezeAmount(String totalFreezeAmount) {
		this.totalFreezeAmount = totalFreezeAmount;
	}
	public String getTotalFreezeAmount( ) {
		return this.totalFreezeAmount;
	}

	public void setTotalFreezeCreditAmount(String totalFreezeCreditAmount) {
		this.totalFreezeCreditAmount = totalFreezeCreditAmount;
	}
	public String getTotalFreezeCreditAmount( ) {
		return this.totalFreezeCreditAmount;
	}

	public void setTotalFreezeFundAmount(String totalFreezeFundAmount) {
		this.totalFreezeFundAmount = totalFreezeFundAmount;
	}
	public String getTotalFreezeFundAmount( ) {
		return this.totalFreezeFundAmount;
	}

	public void setTotalPayAmount(String totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}
	public String getTotalPayAmount( ) {
		return this.totalPayAmount;
	}

	public void setTotalPayCreditAmount(String totalPayCreditAmount) {
		this.totalPayCreditAmount = totalPayCreditAmount;
	}
	public String getTotalPayCreditAmount( ) {
		return this.totalPayCreditAmount;
	}

	public void setTotalPayFundAmount(String totalPayFundAmount) {
		this.totalPayFundAmount = totalPayFundAmount;
	}
	public String getTotalPayFundAmount( ) {
		return this.totalPayFundAmount;
	}

	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}
	public String getTransCurrency( ) {
		return this.transCurrency;
	}

}
