package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易关单
 *
 * @author auto create
 * @since 1.0, 2026-06-29 15:52:57
 */
public class AlipayCommerceTransportTradeOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5888394814593489783L;

	/**
	 * 恒星平台订单号（代扣发起时返回），推荐使用 bill_no 定位订单。bill_no、trade_no、out_biz_no 三者至少传一个
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 区分业务类型字段
	 */
	@ApiField("merchant_biz_type")
	private String merchantBizType;

	/**
	 * 支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 恒星平台订单号（代扣发起时返回），推荐使用 bill_no 定位订单。bill_no、trade_no、out_biz_no 三者至少传一个
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 子订单号
	 */
	@ApiField("out_sub_biz_no")
	private String outSubBizNo;

	/**
	 * 恒星平台订单号（代扣发起时返回），推荐使用 bill_no 定位订单。bill_no、trade_no、out_biz_no 三者至少传一个
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getMerchantBizType() {
		return this.merchantBizType;
	}
	public void setMerchantBizType(String merchantBizType) {
		this.merchantBizType = merchantBizType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutSubBizNo() {
		return this.outSubBizNo;
	}
	public void setOutSubBizNo(String outSubBizNo) {
		this.outSubBizNo = outSubBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
