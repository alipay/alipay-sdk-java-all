package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 磋商协同人
 *
 * @author auto create
 * @since 1.0, 2023-11-06 16:34:11
 */
public class OpenApiContractCoordinatorDTO extends AlipayObject {

	private static final long serialVersionUID = 7553153228946821733L;

	/**
	 * 协同人
	 */
	@ApiField("people")
	private OpenApiPersonSaDTO people;

	/**
	 * 磋商成员角色
	 */
	@ApiField("role")
	private String role;

	public OpenApiPersonSaDTO getPeople() {
		return this.people;
	}
	public void setPeople(OpenApiPersonSaDTO people) {
		this.people = people;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
