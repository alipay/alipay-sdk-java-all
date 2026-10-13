package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店正本详情查询
 *
 * @author auto create
 * @since 1.0, 2026-09-28 15:52:55
 */
public class AlipayCommerceLifeserviceShopdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8745731561337545669L;

	/**
	 * 商户ID【查询非调用方门店详情必传】
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户ID【查询非调用方门店详情必传】
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店主键ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

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

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
