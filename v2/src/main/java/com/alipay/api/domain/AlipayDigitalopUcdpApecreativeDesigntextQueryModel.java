package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据模版查询文字产出信息结果
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:36:30
 */
public class AlipayDigitalopUcdpApecreativeDesigntextQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7695897879556279784L;

	/**
	 * 布局id
	 */
	@ApiField("design_id")
	private String designId;

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

	public String getDesignId() {
		return this.designId;
	}
	public void setDesignId(String designId) {
		this.designId = designId;
	}

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
