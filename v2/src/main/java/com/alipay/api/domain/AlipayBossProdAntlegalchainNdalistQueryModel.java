package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MA上签分页查询已签约人员
 *
 * @author auto create
 * @since 1.0, 2023-05-15 11:08:38
 */
public class AlipayBossProdAntlegalchainNdalistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3144268445533773158L;

	/**
	 * 来源系统
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 协议编号
	 */
	@ApiField("instl_id")
	private Long instlId;

	/**
	 * 操作人的员工工号,请注意是对应协议发布人企业/组织/团队的员工工号
	 */
	@ApiField("opr_staff_id")
	private String oprStaffId;

	/**
	 * 当前页码，从1开始作为首页,如果不传，默认为1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 签约状态，精确查询，值有SIGNED：已签约；SENT：未签约；FAILED：初始化失败；INIT：初始化中
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 每页结果条数,如果不传，默认为10，注意最大不能超过500条
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 协议签约人员工号，模糊查询,注意是对应协议发布人企业/组织/团队的员工工号
	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * 协议签约人员名称，模糊查询
	 */
	@ApiField("staff_name")
	private String staffName;

	/**
	 * 租户信息
	 */
	@ApiField("tenant")
	private String tenant;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public Long getInstlId() {
		return this.instlId;
	}
	public void setInstlId(Long instlId) {
		this.instlId = instlId;
	}

	public String getOprStaffId() {
		return this.oprStaffId;
	}
	public void setOprStaffId(String oprStaffId) {
		this.oprStaffId = oprStaffId;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return this.staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
