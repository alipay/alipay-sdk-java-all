package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付费外卡用户购买基本信息
 *
 * @author auto create
 * @since 1.0, 2021-10-15 11:16:20
 */
public class PaidOuterCardPurchaseInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8168162591565459962L;

	/**
	 * 用户购买、升级、降级、续费的操作时间。格式为：yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("action_date")
	private String actionDate;

	/**
	 * 支付宝交易号，由api: alipay.trade.create 返回
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 商户订单号。与创建订单api：alipay.trade.create保持一致
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 用户购买金额。当购买/升级/续费场景必填，单位元，精确到小数点后2位
	 */
	@ApiField("price")
	private String price;

	/**
	 * 用户操作来源。枚举如下：
ALIPAY_TINY_APP(支付宝小程序)
SELF_APP(商家APP)
OTHER(其他)
	 */
	@ApiField("source")
	private String source;

	public String getActionDate() {
		return this.actionDate;
	}
	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
