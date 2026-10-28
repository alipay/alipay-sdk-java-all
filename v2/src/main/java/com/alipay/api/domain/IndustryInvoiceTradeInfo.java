package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单交易信息
 *
 * @author auto create
 * @since 1.0, 2026-10-20 11:42:02
 */
public class IndustryInvoiceTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 5144863655911378271L;

	/**
	 * 交易渠道
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 交易流水号： 销售管理系统或者相关业务系统中的业务订单号，需长期保存用以支持税务事后抽查。支付宝收单交易建议使用账单信息中的商家订单号
	 */
	@ApiField("trade_biz_no")
	private String tradeBizNo;

	/**
	 * 交易（支付）单号： 支付机构的支付流水号，支付宝交易请使用账单详情中的订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易产品
	 */
	@ApiField("trade_product")
	private String tradeProduct;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getTradeBizNo() {
		return this.tradeBizNo;
	}
	public void setTradeBizNo(String tradeBizNo) {
		this.tradeBizNo = tradeBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeProduct() {
		return this.tradeProduct;
	}
	public void setTradeProduct(String tradeProduct) {
		this.tradeProduct = tradeProduct;
	}

}
