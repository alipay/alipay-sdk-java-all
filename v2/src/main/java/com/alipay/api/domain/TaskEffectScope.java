package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务生效范围
 *
 * @author auto create
 * @since 1.0, 2024-08-08 14:47:51
 */
public class TaskEffectScope extends AlipayObject {

	private static final long serialVersionUID = 3374726595222946499L;

	/**
	 * 生效域id
	 */
	@ApiField("scope_id")
	private String scopeId;

	/**
	 * 任务生效范围id列表
	 */
	@ApiListField("subject_list")
	@ApiField("string")
	private List<String> subjectList;

	/**
	 * 任务生效对象类型为：商户
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getScopeId() {
		return this.scopeId;
	}
	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	public List<String> getSubjectList() {
		return this.subjectList;
	}
	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
