package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业基金申购
 *
 * @author auto create
 * @since 1.0, 2025-06-10 18:10:31
 */
public class AlipayFundIndustryPurchaseModel extends AlipayObject {

	private static final long serialVersionUID = 1697938916877494423L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号，调用签约接口成功时返回。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 基金申购时间，以此时间为准报送清算，必传，且不可跨日。
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 已废弃，勿用。请使用open_id字段
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 订单超时时间，格式：
3s: 3 seconds
3m: 3 minutes
3h: 3 hours
3d: 3 days
订单超时后不可操作基金撤销，如果不传默认超时时间365天
	 */
	@ApiField("order_timeout")
	private String orderTimeout;

	/**
	 * 平台外部请求号，用作幂等号，需要保证在该平台（pid）下唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getOrderTimeout() {
		return this.orderTimeout;
	}
	public void setOrderTimeout(String orderTimeout) {
		this.orderTimeout = orderTimeout;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
