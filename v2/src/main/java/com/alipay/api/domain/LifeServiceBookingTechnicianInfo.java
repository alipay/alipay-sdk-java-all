package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约的手艺人信息
 *
 * @author auto create
 * @since 1.0, 2026-10-14 20:19:46
 */
public class LifeServiceBookingTechnicianInfo extends AlipayObject {

	private static final long serialVersionUID = 1365351685237695228L;

	/**
	 * 手艺人名称
	 */
	@ApiField("technician_name")
	private String technicianName;

	public String getTechnicianName() {
		return this.technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}

}
