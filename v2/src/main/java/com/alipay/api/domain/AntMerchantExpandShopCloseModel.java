package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁店铺关闭
 *
 * @author auto create
 * @since 1.0, 2023-05-24 20:43:22
 */
public class AntMerchantExpandShopCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4467572369399395194L;

	/**
	 * 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。若未传入shop_id 则本参数与store_id均必填。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 支付宝侧蚂蚁店铺 id。传入本参数后可不填 store_id 及 ip_role_id。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商户侧门店编号。表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号。若未传入 shop_id  则本参数与与ip_role_id均必填。
	 */
	@ApiField("store_id")
	private String storeId;

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
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
