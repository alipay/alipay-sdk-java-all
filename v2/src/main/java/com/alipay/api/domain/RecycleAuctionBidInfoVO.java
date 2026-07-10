package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 竞拍买家出价信息
 *
 * @author auto create
 * @since 1.0, 2026-03-27 10:50:56
 */
public class RecycleAuctionBidInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4414215893828661658L;

	/**
	 * 竞拍平台买家的唯一标识
	 */
	@ApiField("buyer_identify")
	private String buyerIdentify;

	/**
	 * 买家名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 买家出价信息，币种：人民币 单位：元
	 */
	@ApiField("buyer_price")
	private String buyerPrice;

	public String getBuyerIdentify() {
		return this.buyerIdentify;
	}
	public void setBuyerIdentify(String buyerIdentify) {
		this.buyerIdentify = buyerIdentify;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerPrice() {
		return this.buyerPrice;
	}
	public void setBuyerPrice(String buyerPrice) {
		this.buyerPrice = buyerPrice;
	}

}
