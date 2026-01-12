package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公司
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:17:36
 */
public class OuDTO extends AlipayObject {

	private static final long serialVersionUID = 8247179736251577988L;

	/**
	 * code
	 */
	@ApiField("code")
	private String code;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * name
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

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

}
