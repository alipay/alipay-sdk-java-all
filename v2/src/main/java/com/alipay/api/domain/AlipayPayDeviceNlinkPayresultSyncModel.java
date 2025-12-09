package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付结果同步设备
 *
 * @author auto create
 * @since 1.0, 2025-08-27 14:43:59
 */
public class AlipayPayDeviceNlinkPayresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2718827393499833291L;

	/**
	 * 动态码token
	 */
	@ApiField("ntoken")
	private String ntoken;

	/**
	 * 返回业务数据
	 */
	@ApiField("open_pay_result")
	private OpenPayResult openPayResult;

	/**
	 * 付款码
	 */
	@ApiField("paycode")
	private String paycode;

	/**
	 * 订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getNtoken() {
		return this.ntoken;
	}
	public void setNtoken(String ntoken) {
		this.ntoken = ntoken;
	}

	public OpenPayResult getOpenPayResult() {
		return this.openPayResult;
	}
	public void setOpenPayResult(OpenPayResult openPayResult) {
		this.openPayResult = openPayResult;
	}

	public String getPaycode() {
		return this.paycode;
	}
	public void setPaycode(String paycode) {
		this.paycode = paycode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
