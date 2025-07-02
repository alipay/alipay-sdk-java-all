package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品类目对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:28
 */
public class MenuBean extends AlipayObject {

	private static final long serialVersionUID = 4498896768848731241L;

	/**
	 * 类目ID
	 */
	@ApiField("menu_id")
	private String menuId;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * true/false -- 当且仅当 true 时才是必选，false 或者字段不存在，都表示非必选商品
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 排序标识
	 */
	@ApiField("sort")
	private Long sort;

	public String getMenuId() {
		return this.menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
