package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot酒店行业isv修改酒店信息
 *
 * @author auto create
 * @since 1.0, 2024-05-22 13:41:22
 */
public class AlipayOpenIotmbsIsvhotelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6239818297212417827L;

	/**
	 * 酒店项目所处的地址
	 */
	@ApiField("project_addr")
	private String projectAddr;

	/**
	 * project_flag+用于标记创建的酒店是否是线上真实项目
	 */
	@ApiField("project_flag")
	private String projectFlag;

	/**
	 * 需要编辑的酒店的酒店id(机构外标)
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 酒店对外展示名称
	 */
	@ApiField("project_nick_name")
	private String projectNickName;

	public String getProjectAddr() {
		return this.projectAddr;
	}
	public void setProjectAddr(String projectAddr) {
		this.projectAddr = projectAddr;
	}

	public String getProjectFlag() {
		return this.projectFlag;
	}
	public void setProjectFlag(String projectFlag) {
		this.projectFlag = projectFlag;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectNickName() {
		return this.projectNickName;
	}
	public void setProjectNickName(String projectNickName) {
		this.projectNickName = projectNickName;
	}

}
