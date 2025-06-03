package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文旅景区信息POI查询接口
 *
 * @author auto create
 * @since 1.0, 2025-03-04 20:06:17
 */
public class AlipayCommerceTransportTourPoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4672589335837634322L;

	/**
	 * 城市市区编码，用于查询匹配信息
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市区域编码，用于查询匹配信息
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 页码值，用于信息分页
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 页面大小，用于信息分页
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 点位名称，用于查询对应点位信息，支持模糊匹配
	 */
	@ApiField("poim_name")
	private String poimName;

	/**
	 * 城市省编码，用于查询匹配信息
	 */
	@ApiField("province_code")
	private String provinceCode;

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

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPoimName() {
		return this.poimName;
	}
	public void setPoimName(String poimName) {
		this.poimName = poimName;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
