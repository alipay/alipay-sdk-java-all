package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * poi搜索接口
 *
 * @author auto create
 * @since 1.0, 2024-06-12 09:48:02
 */
public class AntMerchantExpandAddresssearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8329152381994956149L;

	/**
	 * 城市编码。
蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a> 表格中填写。
直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx " target="_blank">直付通商户地区码</a> 表格中内容填写。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区县编码。
蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a> 表格中填写。
直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx " target="_blank">直付通商户地区码</a> 表格中内容填写。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 商家地址库名称搜索字段
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 省份编码。
蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a> 表格中填写。
直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx " target="_blank">直付通商户地区码</a> 表格中内容填写。
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
