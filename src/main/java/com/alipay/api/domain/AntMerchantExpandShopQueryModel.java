package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺查询接口
 *
 * @author auto create
 * @since 1.0, 2020-12-31 13:55:43
 */
public class AntMerchantExpandShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3163494524663746572L;

	/**
	 * 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。本接口中，如果没传shop_id，则本字段与store_id均必填
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 蚂蚁店铺id。填写本参数的话，store_id和ip_role_id可以不填
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号。关店接口中，如果没传shop_id，则本字段与ip_role_id均必填
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
