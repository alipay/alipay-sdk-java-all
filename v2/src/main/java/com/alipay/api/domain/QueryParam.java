package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询参数
 *
 * @author auto create
 * @since 1.0, 2023-09-06 10:02:50
 */
public class QueryParam extends AlipayObject {

	private static final long serialVersionUID = 3649598242598296224L;

	/**
	 * 刷脸ftoken
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 小程序页面文案信息
	 */
	@ApiField("show_text")
	private ShowText showText;

	/**
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public ShowText getShowText() {
		return this.showText;
	}
	public void setShowText(ShowText showText) {
		this.showText = showText;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
