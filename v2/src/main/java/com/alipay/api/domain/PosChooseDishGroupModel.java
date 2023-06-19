package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建盒子可选套餐的模型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:47
 */
public class PosChooseDishGroupModel extends AlipayObject {

	private static final long serialVersionUID = 8475189669811984986L;

	/**
	 * 组合菜的ID，如果套餐有组合菜，必传
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 菜品中项目组的排序号
	 */
	@ApiField("sort")
	private Long sort;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
