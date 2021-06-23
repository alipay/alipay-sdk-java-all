package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐区信息
 *
 * @author auto create
 * @since 1.0, 2018-10-24 22:43:34
 */
public class DeskAreaEntity extends AlipayObject {

	private static final long serialVersionUID = 1512986316461774572L;

	/**
	 * 区域Id（新增时无需设值）
	 */
	@ApiField("id")
	private String id;

	/**
	 * 餐区名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 餐区排序
	 */
	@ApiField("sort")
	private Long sort;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
