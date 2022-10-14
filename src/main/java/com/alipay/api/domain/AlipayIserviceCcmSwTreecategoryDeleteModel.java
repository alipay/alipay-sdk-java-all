package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-节点-删除
 *
 * @author auto create
 * @since 1.0, 2022-10-10 12:33:14
 */
public class AlipayIserviceCcmSwTreecategoryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7448876261929611839L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 节点ID
	 */
	@ApiField("id")
	private Long id;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
