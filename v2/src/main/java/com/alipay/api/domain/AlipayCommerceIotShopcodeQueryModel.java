package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放电子门店码查询
 *
 * @author auto create
 * @since 1.0, 2022-10-17 11:11:38
 */
public class AlipayCommerceIotShopcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2313247218393215133L;

	/**
	 * 设备绑定的商户pid，直连场景填写商户收单pid，间连场景填写smid绑定的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 设备绑定的门店shopid
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
