package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 陪护人员信息
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:01:05
 */
public class InpatientNursingStaffInfo extends AlipayObject {

	private static final long serialVersionUID = 7227941836494422335L;

	/**
	 * 安排人/护工姓名
	 */
	@ApiField("assignee_name")
	private String assigneeName;

	public String getAssigneeName() {
		return this.assigneeName;
	}
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

}
