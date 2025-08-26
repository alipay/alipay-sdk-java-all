package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医保码支付订单上传接口
 *
 * @author auto create
 * @since 1.0, 2025-04-28 20:33:55
 */
public class AlipayCommerceMedicalPaymentOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1765844693455876954L;

	/**
	 * 使用支付宝支付的金额
	 */
	@ApiField("alipay_amount")
	private String alipayAmount;

	/**
	 * 一码付自费部分的支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 医保核心的业务流水号
	 */
	@ApiListField("biz_trace_no")
	@ApiField("string")
	private List<String> bizTraceNo;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 医保单总金额；币种：人民币；单位：元；
	 */
	@ApiField("fee_sumamt")
	private String feeSumamt;

	/**
	 * 医保统筹基金支付金额；币种：人民币；单位：元；
	 */
	@ApiField("fund_pay")
	private String fundPay;

	/**
	 * 支付完成时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_paid")
	private Date gmtPaid;

	/**
	 * 定点医药机构编码名称，请勿传入空格、换行等特殊符号；请注意字符编码以防止中文乱码
	 */
	@ApiField("medical_org_name")
	private String medicalOrgName;

	/**
	 * 国家医保局标准的定点医药机构编码；格式为1位字母+11位数字
	 */
	@ApiField("medical_org_no")
	private String medicalOrgNo;

	/**
	 * 支付
	 */
	@ApiField("opt_type")
	private String optType;

	/**
	 * 非支付宝支付的金额的信息
	 */
	@ApiListField("other_pay_channel")
	@ApiField("medical_order_pay_channel")
	private List<MedicalOrderPayChannel> otherPayChannel;

	/**
	 * 商户侧的唯一的业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 医保试算后，需用户自费现金支付的金额；币种：人民币；单位：元；
	 */
	@ApiField("own_pay_amt")
	private String ownPayAmt;

	/**
	 * 通过换码拿到的自费付款码
	 */
	@ApiField("pay_code")
	private String payCode;

	/**
	 * 就医所在地城市编码，需传入国家标准行政区划编码
	 */
	@ApiField("payment_city_code")
	private String paymentCityCode;

	/**
	 * 订单支付的场景标识
	 */
	@ApiField("payment_place")
	private String paymentPlace;

	/**
	 * 支付场景编号，如收费窗口的编号、自助机的设备号等
	 */
	@ApiField("payment_place_code")
	private String paymentPlaceCode;

	/**
	 * 医保个人账户支付金额；币种：人民币；单位：元；
	 */
	@ApiField("psn_acct_pay")
	private String psnAcctPay;

	/**
	 * 电子凭证码值或终端刷脸返回码值，28位长度，以424或ano开头
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 订单状态；
	 */
	@ApiField("status")
	private String status;

	/**
	 * 描述订单内容
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 系统服务商的PartnerId
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getAlipayAmount() {
		return this.alipayAmount;
	}
	public void setAlipayAmount(String alipayAmount) {
		this.alipayAmount = alipayAmount;
	}

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public List<String> getBizTraceNo() {
		return this.bizTraceNo;
	}
	public void setBizTraceNo(List<String> bizTraceNo) {
		this.bizTraceNo = bizTraceNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getFeeSumamt() {
		return this.feeSumamt;
	}
	public void setFeeSumamt(String feeSumamt) {
		this.feeSumamt = feeSumamt;
	}

	public String getFundPay() {
		return this.fundPay;
	}
	public void setFundPay(String fundPay) {
		this.fundPay = fundPay;
	}

	public Date getGmtPaid() {
		return this.gmtPaid;
	}
	public void setGmtPaid(Date gmtPaid) {
		this.gmtPaid = gmtPaid;
	}

	public String getMedicalOrgName() {
		return this.medicalOrgName;
	}
	public void setMedicalOrgName(String medicalOrgName) {
		this.medicalOrgName = medicalOrgName;
	}

	public String getMedicalOrgNo() {
		return this.medicalOrgNo;
	}
	public void setMedicalOrgNo(String medicalOrgNo) {
		this.medicalOrgNo = medicalOrgNo;
	}

	public String getOptType() {
		return this.optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}

	public List<MedicalOrderPayChannel> getOtherPayChannel() {
		return this.otherPayChannel;
	}
	public void setOtherPayChannel(List<MedicalOrderPayChannel> otherPayChannel) {
		this.otherPayChannel = otherPayChannel;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOwnPayAmt() {
		return this.ownPayAmt;
	}
	public void setOwnPayAmt(String ownPayAmt) {
		this.ownPayAmt = ownPayAmt;
	}

	public String getPayCode() {
		return this.payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getPaymentCityCode() {
		return this.paymentCityCode;
	}
	public void setPaymentCityCode(String paymentCityCode) {
		this.paymentCityCode = paymentCityCode;
	}

	public String getPaymentPlace() {
		return this.paymentPlace;
	}
	public void setPaymentPlace(String paymentPlace) {
		this.paymentPlace = paymentPlace;
	}

	public String getPaymentPlaceCode() {
		return this.paymentPlaceCode;
	}
	public void setPaymentPlaceCode(String paymentPlaceCode) {
		this.paymentPlaceCode = paymentPlaceCode;
	}

	public String getPsnAcctPay() {
		return this.psnAcctPay;
	}
	public void setPsnAcctPay(String psnAcctPay) {
		this.psnAcctPay = psnAcctPay;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
