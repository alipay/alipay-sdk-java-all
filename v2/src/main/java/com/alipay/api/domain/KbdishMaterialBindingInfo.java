package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品加料绑定菜品信息
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:09
 */
public class KbdishMaterialBindingInfo extends AlipayObject {

	private static final long serialVersionUID = 5465495288875581772L;

	/**
	 * 加料id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 菜品加料排序字段，从1开始递增
	 */
	@ApiField("sort")
	private String sort;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
