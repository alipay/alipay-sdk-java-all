package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁店铺关闭
 *
 * @author auto create
 * @since 1.0, 2026-01-23 14:47:56
 */
public class AntMerchantExpandShopCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8479599289358783316L;

	/**
	 * 扩展信息列表。key值需要向对应行业的bd进行申请。
如果是针对神券团购门店的操作，该值必传，且无需向bd申请。
	 */
	@ApiListField("ext_infos")
	@ApiField("shop_ext_info")
	private List<ShopExtInfo> extInfos;

	/**
	 * 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。若未传入shop_id 则本参数与store_id均必填。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 支付宝侧蚂蚁门店 id。传入本参数后可不填 store_id 及 ip_role_id。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商户侧门店编号。表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号。若未传入 shop_id 则本参数与与ip_role_id均必填。
	 */
	@ApiField("store_id")
	private String storeId;

	public List<ShopExtInfo> getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(List<ShopExtInfo> extInfos) {
		this.extInfos = extInfos;
	}

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
