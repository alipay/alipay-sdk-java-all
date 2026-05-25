package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-09 00:05:21
 */
public class ChannelShop extends AlipayObject {

	private static final long serialVersionUID = 4315687642385922154L;

	/**
	 * 蚂蚁门店进件所属阶段
	 */
	@ApiField("progress")
	private String progress;

	/**
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getProgress() {
		return this.progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
