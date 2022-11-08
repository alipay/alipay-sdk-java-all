package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绿色小票退换货
 *
 * @author auto create
 * @since 1.0, 2022-10-10 16:28:16
 */
public class AlipayCommerceReceiptInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 6211978655799626743L;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 失效(退换货)时间，必填; 时间格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("invalid_date")
	private Date invalidDate;

	/**
	 * 外部商户订单号;out_biz_no唯一对应一笔订单，相同的订单需传入相同的out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单所对应的支付宝交易号，酒店6小件场景时,传入履约号; 支付宝支付时，必填; 特殊情况: 0元订单, 可不填; 无支付场景时，可不填;
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public Date getInvalidDate() {
		return this.invalidDate;
	}
	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
