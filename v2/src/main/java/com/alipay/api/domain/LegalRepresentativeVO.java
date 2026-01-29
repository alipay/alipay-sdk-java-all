package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法定负责人信息
 *
 * @author auto create
 * @since 1.0, 2019-01-22 14:29:59
 */
public class LegalRepresentativeVO extends AlipayObject {

	private static final long serialVersionUID = 4377834987739258736L;

	/**
	 * 职务
	 */
	@ApiField("duty")
	private String duty;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getDuty() {
		return this.duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
