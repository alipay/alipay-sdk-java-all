package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁庄园捐赠项目信息
 *
 * @author auto create
 * @since 1.0, 2021-07-01 14:23:26
 */
public class AntfarmProjectInfo extends AlipayObject {

	private static final long serialVersionUID = 5851544241928831491L;

	/**
	 * 捐赠项目 id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 捐赠项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 当前项目下标的物列表
	 */
	@ApiListField("target_list")
	@ApiField("antfarm_project_target_info")
	private List<AntfarmProjectTargetInfo> targetList;

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<AntfarmProjectTargetInfo> getTargetList() {
		return this.targetList;
	}
	public void setTargetList(List<AntfarmProjectTargetInfo> targetList) {
		this.targetList = targetList;
	}

}
