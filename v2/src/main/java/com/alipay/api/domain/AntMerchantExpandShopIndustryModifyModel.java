package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店行业信息录入
 *
 * @author auto create
 * @since 1.0, 2024-05-23 21:02:58
 */
public class AntMerchantExpandShopIndustryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2331831424912885445L;

	/**
	 * 行业信息，例如所属集团、特殊标签
	 */
	@ApiListField("industry_info")
	@ApiField("merchant_shop_industry_info")
	private List<MerchantShopIndustryInfo> industryInfo;

	/**
	 * 商户角色id，表示门店归属的商户角色。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 蚂蚁店铺 id，通过ant.merchant.expand.shop.create/ant.merchant.expand.shop.modify获取
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	public List<MerchantShopIndustryInfo> getIndustryInfo() {
		return this.industryInfo;
	}
	public void setIndustryInfo(List<MerchantShopIndustryInfo> industryInfo) {
		this.industryInfo = industryInfo;
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
