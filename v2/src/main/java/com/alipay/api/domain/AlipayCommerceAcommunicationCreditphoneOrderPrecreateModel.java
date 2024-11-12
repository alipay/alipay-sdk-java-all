package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购预创单
 *
 * @author auto create
 * @since 1.0, 2024-10-09 20:16:19
 */
public class AlipayCommerceAcommunicationCreditphoneOrderPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 4763661972883925329L;

	/**
	 * 支付宝用户ID（小程序授权获取）
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户ID（小程序授权获取）
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务发生时间，如2016-07-06 00:00:02 签约超时关单时间依赖这个时间 这个时间会做幂等校验，如果创单幂等，但时间不同会失败
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 信用购机商品信息
	 */
	@ApiField("credit_phone_info")
	private CreditPhoneInfo creditPhoneInfo;

	/**
	 * 用户在账单页通过该链接可以跳转到小程序的订单详情页
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 单元是元。即这笔订单的最大扣款金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 机构创单标识
	 */
	@ApiField("inst_sign_aisle_data")
	private String instSignAisleData;

	/**
	 * 外部业务订单号用于幂等返回预创单信息
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 风控参数
	 */
	@ApiField("risk_info")
	private CreditPhoneRiskInfo riskInfo;

	/**
	 * 交易组件串
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public CreditPhoneInfo getCreditPhoneInfo() {
		return this.creditPhoneInfo;
	}
	public void setCreditPhoneInfo(CreditPhoneInfo creditPhoneInfo) {
		this.creditPhoneInfo = creditPhoneInfo;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getInstSignAisleData() {
		return this.instSignAisleData;
	}
	public void setInstSignAisleData(String instSignAisleData) {
		this.instSignAisleData = instSignAisleData;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public CreditPhoneRiskInfo getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(CreditPhoneRiskInfo riskInfo) {
		this.riskInfo = riskInfo;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
