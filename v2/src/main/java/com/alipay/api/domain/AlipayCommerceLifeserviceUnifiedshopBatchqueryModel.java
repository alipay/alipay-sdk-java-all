package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店正本列表查询
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:27:53
 */
public class AlipayCommerceLifeserviceUnifiedshopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3665841592731941534L;

	/**
	 * null
	 */
	@ApiListField("city_codes")
	@ApiField("string")
	private List<String> cityCodes;

	/**
	 * null
	 */
	@ApiListField("district_codes")
	@ApiField("string")
	private List<String> districtCodes;

	/**
	 * 是否有营业执照
	 */
	@ApiField("has_business_license")
	private Boolean hasBusinessLicense;

	/**
	 * 页码（必填，大于0）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数（必填，范围1~100）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * null
	 */
	@ApiListField("province_codes")
	@ApiField("string")
	private List<String> provinceCodes;

	/**
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称（模糊搜索）
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店类型: PHYSICAL_STORE-线下门店 / CLOUD_STORE-线上云店
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * null
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

	/**
	 * 统一门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	public List<String> getCityCodes() {
		return this.cityCodes;
	}
	public void setCityCodes(List<String> cityCodes) {
		this.cityCodes = cityCodes;
	}

	public List<String> getDistrictCodes() {
		return this.districtCodes;
	}
	public void setDistrictCodes(List<String> districtCodes) {
		this.districtCodes = districtCodes;
	}

	public Boolean getHasBusinessLicense() {
		return this.hasBusinessLicense;
	}
	public void setHasBusinessLicense(Boolean hasBusinessLicense) {
		this.hasBusinessLicense = hasBusinessLicense;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getProvinceCodes() {
		return this.provinceCodes;
	}
	public void setProvinceCodes(List<String> provinceCodes) {
		this.provinceCodes = provinceCodes;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public List<String> getStatus() {
		return this.status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
