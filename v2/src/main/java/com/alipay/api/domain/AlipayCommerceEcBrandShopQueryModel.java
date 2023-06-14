package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌门店查询
 *
 * @author auto create
 * @since 1.0, 2023-06-06 10:52:37
 */
public class AlipayCommerceEcBrandShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5515153624154848595L;

	/**
	 * 品牌id列表
	 */
	@ApiListField("brand_id_list")
	@ApiField("string")
	private List<String> brandIdList;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店名称，支持模糊检索
	 */
	@ApiField("shop_name")
	private String shopName;

	public List<String> getBrandIdList() {
		return this.brandIdList;
	}
	public void setBrandIdList(List<String> brandIdList) {
		this.brandIdList = brandIdList;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
