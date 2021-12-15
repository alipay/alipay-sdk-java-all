package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组织部门标签
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:25:44
 */
public class DepartmentLabel extends AlipayObject {

	private static final long serialVersionUID = 8161546232246469514L;

	/**
	 * 部门标签码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 部门标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 部门标签名称
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
