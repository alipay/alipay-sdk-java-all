package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.JumpInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.prepay response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 12:27:04
 */
public class AlipayTradeOrderPrepayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7547166398481428216L;

	/** 
	 * 支付跳转信息。 用于打开支付方式 app 的 scheme URL，详细使用方式参考<a href="https://global.alipay.com/docs/ac/cashier_payment_cn/redirection#FH33G">链接</a>。
	 */
	@ApiField("jump_info")
	private JumpInfo jumpInfo;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 账户机构唤端需要的订单唯一标识
	 */
	@ApiField("tn")
	private String tn;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setJumpInfo(JumpInfo jumpInfo) {
		this.jumpInfo = jumpInfo;
	}
	public JumpInfo getJumpInfo( ) {
		return this.jumpInfo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTn(String tn) {
		this.tn = tn;
	}
	public String getTn( ) {
		return this.tn;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
