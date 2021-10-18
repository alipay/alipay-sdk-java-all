package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车机支付
 *
 * @author auto create
 * @since 1.0, 2020-04-15 21:17:20
 */
public class AlipayPayAppCarPayModel extends AlipayObject {

	private static final long serialVersionUID = 4466527912244939384L;

	/**
	 * 商户订单号，需要保证不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 订单二维码码串，调用开放平台预下单接口alipay.trade.precreate生成
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
