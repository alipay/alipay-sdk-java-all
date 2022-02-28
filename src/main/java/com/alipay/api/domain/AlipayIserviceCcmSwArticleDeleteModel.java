package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库管理
 *
 * @author auto create
 * @since 1.0, 2021-01-26 15:21:32
 */
public class AlipayIserviceCcmSwArticleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4455836994133554547L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 要删除的问答ID
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
