package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-06-19 20:07:32
 */
public class StaffInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4863184584253836815L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * null
	 */
	@ApiListField("community_ids")
	@ApiField("string")
	private List<String> communityIds;

	/**
	 * null
	 */
	@ApiListField("department_jobs")
	@ApiField("department_job_create_v_o")
	private List<DepartmentJobCreateVO> departmentJobs;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 是否开通平台操作员
开通：true
不开通：false 默认
	 */
	@ApiField("open_saas")
	private Boolean openSaas;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 员工id,新增时非必填，更新是必填

	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * 工号
	 */
	@ApiField("staff_no")
	private String staffNo;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public List<String> getCommunityIds() {
		return this.communityIds;
	}
	public void setCommunityIds(List<String> communityIds) {
		this.communityIds = communityIds;
	}

	public List<DepartmentJobCreateVO> getDepartmentJobs() {
		return this.departmentJobs;
	}
	public void setDepartmentJobs(List<DepartmentJobCreateVO> departmentJobs) {
		this.departmentJobs = departmentJobs;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Boolean getOpenSaas() {
		return this.openSaas;
	}
	public void setOpenSaas(Boolean openSaas) {
		this.openSaas = openSaas;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffNo() {
		return this.staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
