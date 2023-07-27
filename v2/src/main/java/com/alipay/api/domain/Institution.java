package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构
 *
 * @author auto create
 * @since 1.0, 2020-11-16 09:44:32
 */
public class Institution extends AlipayObject {

	private static final long serialVersionUID = 1656924228193493312L;

	/**
	 * 机构编码（如：人行联行号）
	 */
	@ApiField("code")
	private String code;

	/**
	 * 机构全称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父级机构编码
	 */
	@ApiField("root_code")
	private String rootCode;

	/**
	 * 父级机构全称
	 */
	@ApiField("root_name")
	private String rootName;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRootCode() {
		return this.rootCode;
	}
	public void setRootCode(String rootCode) {
		this.rootCode = rootCode;
	}

	public String getRootName() {
		return this.rootName;
	}
	public void setRootName(String rootName) {
		this.rootName = rootName;
	}

}
