package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 树节点
 *
 * @author auto create
 * @since 1.0, 2022-02-23 12:04:23
 */
public class OrgNodeDTO extends AlipayObject {

	private static final long serialVersionUID = 1843849646415573398L;

	/**
	 * 节点code,如部门code,业务线code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 节点类型
	 */
	@ApiField("type")
	private String type;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
