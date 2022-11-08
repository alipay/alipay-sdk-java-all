package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改员工抬头信息
 *
 * @author auto create
 * @since 1.0, 2022-09-08 15:47:17
 */
public class AlipayCommerceEcEmployeeTitleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2168316333642895117L;

	/**
	 * 共同账号id，与enterprise_id两者必填其一
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
	 * 企业域定义下的企业id，与accountId两者必填其一
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 修改人
	 */
	@ApiField("modify_by")
	private String modifyBy;

	/**
	 * 修改后的抬头id
	 */
	@ApiField("new_title_id")
	private String newTitleId;

	/**
	 * 修改前的抬头id
	 */
	@ApiField("old_title_id")
	private String oldTitleId;

	/**
	 * 员工抬头关系标
	 */
	@ApiField("title_tag")
	private String titleTag;

	/**
	 * 支付宝id2088，与employee_id两者必填其一
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

	public String getNewTitleId() {
		return this.newTitleId;
	}
	public void setNewTitleId(String newTitleId) {
		this.newTitleId = newTitleId;
	}

	public String getOldTitleId() {
		return this.oldTitleId;
	}
	public void setOldTitleId(String oldTitleId) {
		this.oldTitleId = oldTitleId;
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
