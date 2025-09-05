package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class DepartmentJobVO extends AlipayObject {

	private static final long serialVersionUID = 6786988714324633678L;

	/**
	 * 部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 岗位id
保安：SECURITY
保洁：CLEANING
保绿：GREENERY
保修：REPAIR
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 类型
管理&属于：MANAGE_BELONG
管理：MANAGE
属于：BELONG
	 */
	@ApiField("type")
	private String type;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
