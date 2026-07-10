package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店列表查询
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:30:27
 */
public class AlipayCommerceCityfacilitatorWifiShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5418357367488118613L;

	/**
	 * 市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 当前页
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
