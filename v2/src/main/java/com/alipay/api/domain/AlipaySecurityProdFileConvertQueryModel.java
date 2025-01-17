package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pdf异步转换任务结果查询
 *
 * @author auto create
 * @since 1.0, 2024-10-28 13:50:56
 */
public class AlipaySecurityProdFileConvertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6394183311155365965L;

	/**
	 * 阿里云文件异步转换任务id
	 */
	@ApiField("convert_task_id")
	private String convertTaskId;

	/**
	 * 操作人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 文件转换目标目录
	 */
	@ApiField("target_file_path")
	private String targetFilePath;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getConvertTaskId() {
		return this.convertTaskId;
	}
	public void setConvertTaskId(String convertTaskId) {
		this.convertTaskId = convertTaskId;
	}

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTargetFilePath() {
		return this.targetFilePath;
	}
	public void setTargetFilePath(String targetFilePath) {
		this.targetFilePath = targetFilePath;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
