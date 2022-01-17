package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-类目-创建
 *
 * @author auto create
 * @since 1.0, 2021-01-26 15:20:57
 */
public class AlipayIserviceCcmSwTreeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2125178751258684883L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
