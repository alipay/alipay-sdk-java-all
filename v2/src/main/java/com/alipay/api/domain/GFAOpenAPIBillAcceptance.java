package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财账单受理模型
 *
 * @author auto create
 * @since 1.0, 2023-07-09 19:30:10
 */
public class GFAOpenAPIBillAcceptance extends AlipayObject {

	private static final long serialVersionUID = 3651797888754692619L;

	/**
	 * 受理幂等字段，唯一标识一笔报帐单据。当收到两笔相同的acceptUniqueNo时，第二笔会被当作是重复报送不作处理。因此对于同一笔交易在不同阶段（比如订单创建、确认收货、退款等）触发的不同财务事件，也应该采用不同的acceptUniqueNo
	 */
	@ApiField("accept_uniq_no")
	private String acceptUniqNo;

	/**
	 * 摊销扩展信息
	 */
	@ApiField("amortize_ext_info")
	private GFAOpenAPIAmortizeExtInfo amortizeExtInfo;

	/**
	 * 签约合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 业务账单金额。（单位：各币种的“元”单位，精确到小数点后两位）
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 业务事件码（8位数字）
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 端事件码（8位数字）
	 */
	@ApiField("cnl_ev_code")
	private String cnlEvCode;

	/**
	 * 端产品码
	 */
	@ApiField("cnl_pd_code")
	private String cnlPdCode;

	/**
	 * ISO 4217货币币种数值
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 收费事件码（8位数字）
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 业务系统已收付款完成时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 指定收付款时间
	 */
	@ApiField("gmt_receive")
	private Date gmtReceive;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private Date gmtService;

	/**
	 * 高精度账单金额（单位：各币种的“元”单位）
	 */
	@ApiField("high_precision_bill_amount")
	private String highPrecisionBillAmount;

	/**
	 * 业务系统未收付金额（单位：各币种的“元”单位，精确到小数点后两位）
	 */
	@ApiField("nonpayment_amount")
	private String nonpaymentAmount;

	/**
	 * 业务流水号（受理幂等字段之一）
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 外部计税来源标识，当前只有 ibiztaxcore国际标识
	 */
	@ApiField("outer_tax_source")
	private String outerTaxSource;

	/**
	 * 业务系统收付款状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 收款参与者信息
	 */
	@ApiField("payee_participant")
	private GFAOpenAPIParticipantInfo payeeParticipant;

	/**
	 * 付款参与者信息
	 */
	@ApiField("payer_participant")
	private GFAOpenAPIParticipantInfo payerParticipant;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业财受理账单扩展信息。Map<String, String> 类型JSON字符串。
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 业务系统已收付金额（单位：各币种的“元”单位，精确到小数点后两位）
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 外部业务关联单据号
	 */
	@ApiField("rel_out_business_no")
	private String relOutBusinessNo;

	/**
	 * 业务发生量/业务发生金额。如果是金额，则为各币种的“元”单位，精确到小数点后两位。
	 */
	@ApiField("service_amount")
	private Long serviceAmount;

	/**
	 * 业务唯一标识（受理幂等字段之一）
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 指定结算参与者信息
	 */
	@ApiField("settle_participant")
	private GFAOpenAPIParticipantInfo settleParticipant;

	/**
	 * 签约参与者信息
	 */
	@ApiField("sign_participant")
	private GFAOpenAPIParticipantInfo signParticipant;

	/**
	 * 业务流水子单号（受理幂等字段之一）
	 */
	@ApiField("sub_out_business_no")
	private String subOutBusinessNo;

	/**
	 * 来源系统
	 */
	@ApiField("system_origin")
	private String systemOrigin;

	/**
	 * 外部计税信息。在外部计税时传入
	 */
	@ApiField("tax_info")
	private GFAOpenAPIOuterTaxInfo taxInfo;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAcceptUniqNo() {
		return this.acceptUniqNo;
	}
	public void setAcceptUniqNo(String acceptUniqNo) {
		this.acceptUniqNo = acceptUniqNo;
	}

	public GFAOpenAPIAmortizeExtInfo getAmortizeExtInfo() {
		return this.amortizeExtInfo;
	}
	public void setAmortizeExtInfo(GFAOpenAPIAmortizeExtInfo amortizeExtInfo) {
		this.amortizeExtInfo = amortizeExtInfo;
	}

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBizEvCode() {
		return this.bizEvCode;
	}
	public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public String getCnlEvCode() {
		return this.cnlEvCode;
	}
	public void setCnlEvCode(String cnlEvCode) {
		this.cnlEvCode = cnlEvCode;
	}

	public String getCnlPdCode() {
		return this.cnlPdCode;
	}
	public void setCnlPdCode(String cnlPdCode) {
		this.cnlPdCode = cnlPdCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public Date getGmtReceive() {
		return this.gmtReceive;
	}
	public void setGmtReceive(Date gmtReceive) {
		this.gmtReceive = gmtReceive;
	}

	public Date getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(Date gmtService) {
		this.gmtService = gmtService;
	}

	public String getHighPrecisionBillAmount() {
		return this.highPrecisionBillAmount;
	}
	public void setHighPrecisionBillAmount(String highPrecisionBillAmount) {
		this.highPrecisionBillAmount = highPrecisionBillAmount;
	}

	public String getNonpaymentAmount() {
		return this.nonpaymentAmount;
	}
	public void setNonpaymentAmount(String nonpaymentAmount) {
		this.nonpaymentAmount = nonpaymentAmount;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getOuterTaxSource() {
		return this.outerTaxSource;
	}
	public void setOuterTaxSource(String outerTaxSource) {
		this.outerTaxSource = outerTaxSource;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public GFAOpenAPIParticipantInfo getPayeeParticipant() {
		return this.payeeParticipant;
	}
	public void setPayeeParticipant(GFAOpenAPIParticipantInfo payeeParticipant) {
		this.payeeParticipant = payeeParticipant;
	}

	public GFAOpenAPIParticipantInfo getPayerParticipant() {
		return this.payerParticipant;
	}
	public void setPayerParticipant(GFAOpenAPIParticipantInfo payerParticipant) {
		this.payerParticipant = payerParticipant;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getRelOutBusinessNo() {
		return this.relOutBusinessNo;
	}
	public void setRelOutBusinessNo(String relOutBusinessNo) {
		this.relOutBusinessNo = relOutBusinessNo;
	}

	public Long getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(Long serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public GFAOpenAPIParticipantInfo getSettleParticipant() {
		return this.settleParticipant;
	}
	public void setSettleParticipant(GFAOpenAPIParticipantInfo settleParticipant) {
		this.settleParticipant = settleParticipant;
	}

	public GFAOpenAPIParticipantInfo getSignParticipant() {
		return this.signParticipant;
	}
	public void setSignParticipant(GFAOpenAPIParticipantInfo signParticipant) {
		this.signParticipant = signParticipant;
	}

	public String getSubOutBusinessNo() {
		return this.subOutBusinessNo;
	}
	public void setSubOutBusinessNo(String subOutBusinessNo) {
		this.subOutBusinessNo = subOutBusinessNo;
	}

	public String getSystemOrigin() {
		return this.systemOrigin;
	}
	public void setSystemOrigin(String systemOrigin) {
		this.systemOrigin = systemOrigin;
	}

	public GFAOpenAPIOuterTaxInfo getTaxInfo() {
		return this.taxInfo;
	}
	public void setTaxInfo(GFAOpenAPIOuterTaxInfo taxInfo) {
		this.taxInfo = taxInfo;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
