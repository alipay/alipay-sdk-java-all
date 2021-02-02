package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 盒子档口模型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:52
 */
public class PosStallModel extends AlipayObject {

	private static final long serialVersionUID = 2829475221666932158L;

	/**
	 * 菜品下档口的排序号
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 档口ID
	 */
	@ApiField("stall_id")
	private String stallId;

	/**
	 * 档口名字
	 */
	@ApiField("stall_name")
	private String stallName;

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getStallId() {
		return this.stallId;
	}
	public void setStallId(String stallId) {
		this.stallId = stallId;
	}

	public String getStallName() {
		return this.stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

}
