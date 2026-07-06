package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子科室
 *
 * @author auto create
 * @since 1.0, 2026-03-18 11:46:28
 */
public class SubDepartmentInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7651649718775172176L;

	/**
	 * 科室ID
	 */
	@ApiField("depart_id")
	private String departId;

	/**
	 * 科室名称
	 */
	@ApiField("depart_name")
	private String departName;

	public String getDepartId() {
		return this.departId;
	}
	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return this.departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}

}
