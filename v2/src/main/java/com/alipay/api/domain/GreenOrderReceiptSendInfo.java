package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单存在错误信息时，需要返回
 *
 * @author auto create
 * @since 1.0, 2024-08-15 17:06:18
 */
public class GreenOrderReceiptSendInfo extends AlipayObject {

	private static final long serialVersionUID = 3824143487455556827L;

	/**
	 * 订单回传失败字典值对应数值：DENGHUO_ORDER_NOT_SUPPORT、ORDER_HAS_SYNC
	 */
	@ApiField("failure_code")
	private String failureCode;

	/**
	 * 订单回传失败错误原因：不支持灯火订单同步、订单已同步
	 */
	@ApiField("failure_reason")
	private String failureReason;

	/**
	 * 外部商户订单号，out_biz_no唯—对应一笔订单。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单所对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getFailureCode() {
		return this.failureCode;
	}
	public void setFailureCode(String failureCode) {
		this.failureCode = failureCode;
	}

	public String getFailureReason() {
		return this.failureReason;
	}
	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
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
