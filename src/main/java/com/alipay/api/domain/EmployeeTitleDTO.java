package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包含员工和抬头关系的模型
 *
 * @author auto create
 * @since 1.0, 2022-11-03 23:08:23
 */
public class EmployeeTitleDTO extends AlipayObject {

	private static final long serialVersionUID = 6354712763136346891L;

	/**
	 * 共同账户id,与enterprise_id两者必填其一
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 创建人
	 */
	@ApiField("create_by")
	private String createBy;

	/**
	 * 企业域定义的员工id，与user_id两者必填其一
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业域定义的企业id，与account_id两者必填其一
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 修改人
	 */
	@ApiField("modify_by")
	private String modifyBy;

	/**
	 * 抬头id
	 */
	@ApiField("title_id")
	private String titleId;

	/**
	 * 关系标记
	 */
	@ApiField("title_tag")
	private String titleTag;

	/**
	 * 员工支付宝账号2088,与employee_id两者必填其一
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCreateBy() {
		return this.createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

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

	public String getModifyBy() {
		return this.modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
