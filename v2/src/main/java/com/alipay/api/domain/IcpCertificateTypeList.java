package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询证件类型列表
 *
 * @author auto create
 * @since 1.0, 2024-01-19 17:03:00
 */
public class IcpCertificateTypeList extends AlipayObject {

	private static final long serialVersionUID = 7329517586747285361L;

	/**
	 * 证件类型中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 证件类型对应的单位性质编码
	 */
	@ApiField("subject_type")
	private String subjectType;

	/**
	 * 证件类型编码
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
