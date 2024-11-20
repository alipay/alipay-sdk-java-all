package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码收单身份信息
 *
 * @author auto create
 * @since 1.0, 2024-07-11 10:34:30
 */
public class EcTradeIdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 3682674542245376999L;

	/**
	 * 收单pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 一个收单身份下用来区分门店的id
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
