package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询生成图片任务进度接口
 *
 * @author auto create
 * @since 1.0, 2023-07-27 21:20:53
 */
public class AlipayDigitalopUcdpApecreativePictaskresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2273848127679276362L;

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
