package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店资质录入
 *
 * @author auto create
 * @since 1.0, 2023-11-16 13:42:08
 */
public class AntMerchantExpandShopLicenseModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5743565623656855494L;

	/**
	 * 门店资质信息
	 */
	@ApiListField("audit_license_list")
	@ApiField("shop_industry_license")
	private List<ShopIndustryLicense> auditLicenseList;

	/**
	 * 商户角色id，表示门店店归属的商户角色。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 蚂蚁店铺 id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商户自己系统里的门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	public List<ShopIndustryLicense> getAuditLicenseList() {
		return this.auditLicenseList;
	}
	public void setAuditLicenseList(List<ShopIndustryLicense> auditLicenseList) {
		this.auditLicenseList = auditLicenseList;
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
