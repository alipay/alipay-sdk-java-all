package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国家医保局线上业务下单支付接口
 *
 * @author auto create
 * @since 1.0, 2022-06-29 15:54:09
 */
public class AlipayCommerceMedicalPaymentCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 4871824931489646548L;

	/**
	 * 个人账户支付金额
	 */
	@ApiField("account_amount")
	private String accountAmount;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付回调地址
	 */
	@ApiField("call_url")
	private String callUrl;

	/**
	 * 国标移动支付间连下单扩展字段
	 */
	@ApiField("extend_params")
	private TradeExtendParams extendParams;

	/**
	 * 医疗机构下单时间
	 */
	@ApiField("gmt_out_create")
	private Date gmtOutCreate;

	/**
	 * 医保基金支付金额
	 */
	@ApiField("gov_amount")
	private String govAmount;

	/**
	 * 医院订单号(商户需保证appId维度唯一)
	 */
	@ApiField("med_org_ord")
	private String medOrgOrd;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 定点医疗机构编码
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 第三方平台商单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付授权码（用户授权给定点医药机构线上业务时取得）
	 */
	@ApiField("pay_auth_no")
	private String payAuthNo;

	/**
	 * 支付订单号（处方上传的出参订单号）
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 医保结算地国标城市编码
	 */
	@ApiField("payment_city_code")
	private String paymentCityCode;

	/**
	 * 现金支付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝侧交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAccountAmount() {
		return this.accountAmount;
	}
	public void setAccountAmount(String accountAmount) {
		this.accountAmount = accountAmount;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCallUrl() {
		return this.callUrl;
	}
	public void setCallUrl(String callUrl) {
		this.callUrl = callUrl;
	}

	public TradeExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(TradeExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public Date getGmtOutCreate() {
		return this.gmtOutCreate;
	}
	public void setGmtOutCreate(Date gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}

	public String getGovAmount() {
		return this.govAmount;
	}
	public void setGovAmount(String govAmount) {
		this.govAmount = govAmount;
	}

	public String getMedOrgOrd() {
		return this.medOrgOrd;
	}
	public void setMedOrgOrd(String medOrgOrd) {
		this.medOrgOrd = medOrgOrd;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOrgNo() {
		return this.orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayAuthNo() {
		return this.payAuthNo;
	}
	public void setPayAuthNo(String payAuthNo) {
		this.payAuthNo = payAuthNo;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getPaymentCityCode() {
		return this.paymentCityCode;
	}
	public void setPaymentCityCode(String paymentCityCode) {
		this.paymentCityCode = paymentCityCode;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
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
