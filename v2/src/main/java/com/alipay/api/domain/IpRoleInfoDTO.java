package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过手机号查询用户信息的返回结果DTO
 *
 * @author auto create
 * @since 1.0, 2023-03-21 19:12:01
 */
public class IpRoleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2814312158367732699L;

	/**
	 * gmt_create 不唯一 代表创建时间 无枚举 被调用方提供 无特殊说明
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * ip_role_id 唯一 代表操作员唯一ID 无枚举 被调方提供 无特殊说明
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * job 不唯一 代表用户岗位 无枚举 被调用方提供 无特殊说明
	 */
	@ApiField("job")
	private String job;

	/**
	 * phone 唯一 代表用户手机号 无枚举 被调用方提供 无特殊说明
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * real_name 真实姓名 不唯一 用于代表用户真实姓名  无枚举 被调方提供 无特殊说明
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * reg_from 不唯一 代表注册来源  ALIPAY 被调方提供 无特殊说明
	 */
	@ApiField("reg_from")
	private String regFrom;

	/**
	 * remark 不唯一 用于存储其他拓展信息  无枚举  被调方提供 无特殊说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * work_no 唯一 代表用户工号 无枚举 被调用方提供 无特殊说明
	 */
	@ApiField("work_no")
	private String workNo;

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRegFrom() {
		return this.regFrom;
	}
	public void setRegFrom(String regFrom) {
		this.regFrom = regFrom;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
