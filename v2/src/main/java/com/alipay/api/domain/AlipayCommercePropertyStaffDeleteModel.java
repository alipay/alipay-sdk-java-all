package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工删除接口
 *
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:27
 */
public class AlipayCommercePropertyStaffDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6284344831786842317L;

	/**
	 * 员工id
	 */
	@ApiField("staff_id")
	private String staffId;

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

}
