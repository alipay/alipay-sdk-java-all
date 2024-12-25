package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建文件异步转换任务
 *
 * @author auto create
 * @since 1.0, 2024-10-28 13:50:21
 */
public class AlipaySecurityProdFileConvertCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3469117979435189922L;

	/**
	 * 操作人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 转换文件路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 转换文件目标类型
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
