package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-问答-查询
 *
 * @author auto create
 * @since 1.0, 2024-11-08 14:22:51
 */
public class AlipayIserviceCcmSwArticleGetModel extends AlipayObject {

	private static final long serialVersionUID = 1776188537267982388L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 文章ID
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
