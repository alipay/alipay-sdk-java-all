package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码员工抬头关系操作失败信息
 *
 * @author auto create
 * @since 1.0, 2025-04-01 15:52:19
 */
public class EcEmployeeTitleFailed extends AlipayObject {

	private static final long serialVersionUID = 6692476834269333524L;

	/**
	 * 员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 返回每一个抬头批量处理信息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 抬头ID
	 */
	@ApiField("title_id")
	private String titleId;

	/**
	 * 标识抬头是否默认DEFAULT/多抬头MULTI
	 */
	@ApiField("title_tag")
	private String titleTag;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitleId() {
		return this.titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getTitleTag() {
		return this.titleTag;
	}
	public void setTitleTag(String titleTag) {
		this.titleTag = titleTag;
	}

}
