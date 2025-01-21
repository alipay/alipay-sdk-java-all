package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业分支机构明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:17:52
 */
public class EpBranchDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1323941615237838279L;

	/**
	 * 核准日期
	 */
	@ApiField("approval_date")
	private String approvalDate;

	/**
	 * 企业名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分支机构曾用名
	 */
	@ApiListField("old_name")
	@ApiField("string")
	private List<String> oldName;

	/**
	 * 企业分支机构登记机关
	 */
	@ApiField("register_organ")
	private String registerOrgan;

	/**
	 * 企业分支机构登记状态
	 */
	@ApiField("registration_state")
	private String registrationState;

	/**
	 * 企业工商注册号
	 */
	@ApiField("registry_id")
	private String registryId;

	/**
	 * 企业注册号或统一社会信用代码，一般为18位
	 */
	@ApiField("tyshxydm")
	private String tyshxydm;

	public String getApprovalDate() {
		return this.approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOldName() {
		return this.oldName;
	}
	public void setOldName(List<String> oldName) {
		this.oldName = oldName;
	}

	public String getRegisterOrgan() {
		return this.registerOrgan;
	}
	public void setRegisterOrgan(String registerOrgan) {
		this.registerOrgan = registerOrgan;
	}

	public String getRegistrationState() {
		return this.registrationState;
	}
	public void setRegistrationState(String registrationState) {
		this.registrationState = registrationState;
	}

	public String getRegistryId() {
		return this.registryId;
	}
	public void setRegistryId(String registryId) {
		this.registryId = registryId;
	}

	public String getTyshxydm() {
		return this.tyshxydm;
	}
	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}

}
