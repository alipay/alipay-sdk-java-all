package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-修改
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:59:15
 */
public class AlipayIserviceCcmSwLibraryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4638818746323256748L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 知识库Id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 知识库名称
	 */
	@ApiField("name")
	private String name;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
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
