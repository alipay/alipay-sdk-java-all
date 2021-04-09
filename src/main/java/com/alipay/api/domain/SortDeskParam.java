package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 桌位排序参数
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:25:22
 */
public class SortDeskParam extends AlipayObject {

	private static final long serialVersionUID = 8418278124941338626L;

	/**
	 * 区域ID
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 桌位编码
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 桌位ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 排序顺序
	 */
	@ApiField("sort")
	private Long sort;

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
