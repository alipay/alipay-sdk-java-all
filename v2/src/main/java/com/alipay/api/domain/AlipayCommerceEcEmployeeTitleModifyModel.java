package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改员工抬头信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 16:13:32
 */
public class AlipayCommerceEcEmployeeTitleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8585592293781851231L;

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
	 * 绑定的抬头ID列表
	 */
	@ApiListField("multi_title_list")
	@ApiField("ec_employee_title_modify_tax_no_and_title_id")
	private List<EcEmployeeTitleModifyTaxNoAndTitleId> multiTitleList;

	/**
	 * 修改后的抬头id
	 */
	@ApiField("new_title_id")
	private String newTitleId;

	/**
	 * 修改前的抬头id 当前字段已废弃(数据库自行查询是否有有效抬头)
	 */
	@ApiField("old_title_id")
	@Deprecated
	private String oldTitleId;

	/**
	 * 支付宝open_id，与employee_id两者必填其一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 税号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

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

	public List<EcEmployeeTitleModifyTaxNoAndTitleId> getMultiTitleList() {
		return this.multiTitleList;
	}
	public void setMultiTitleList(List<EcEmployeeTitleModifyTaxNoAndTitleId> multiTitleList) {
		this.multiTitleList = multiTitleList;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTaxRegisterNo() {
		return this.taxRegisterNo;
	}
	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
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
