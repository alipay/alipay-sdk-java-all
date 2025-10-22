package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查找文字进度api
 *
 * @author auto create
 * @since 1.0, 2023-07-26 20:10:31
 */
public class AlipayDigitalopUcdpApecreativeTextprocessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6458282116139398215L;

	/**
	 * ape创意组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
