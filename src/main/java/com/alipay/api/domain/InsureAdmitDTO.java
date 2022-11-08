package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商商品准入模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:41:53
 */
public class InsureAdmitDTO extends AlipayObject {

	private static final long serialVersionUID = 6597454829958661911L;

	/**
	 * 买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 关键key，识别批量请求准入接口对应的数据
	 */
	@ApiField("echo_key")
	private String echoKey;

	/**
	 * 商品
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public String getEchoKey() {
		return this.echoKey;
	}
	public void setEchoKey(String echoKey) {
		this.echoKey = echoKey;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

}
