package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动走路线-路线元数据模型
 *
 * @author auto create
 * @since 1.0, 2023-10-10 17:08:08
 */
public class WalkPathMetaData extends AlipayObject {

	private static final long serialVersionUID = 3868596434325797934L;

	/**
	 * 路线场景码
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 路线id
	 */
	@ApiField("path_id")
	private String pathId;

	/**
	 * 路线距离文案(公里)，不影响实际计算
	 */
	@ApiField("path_length")
	private Long pathLength;

	/**
	 * 路线总步数
	 */
	@ApiField("path_step_count")
	private Long pathStepCount;

	/**
	 * 路线名称
	 */
	@ApiField("title")
	private String title;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPathId() {
		return this.pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public Long getPathLength() {
		return this.pathLength;
	}
	public void setPathLength(Long pathLength) {
		this.pathLength = pathLength;
	}

	public Long getPathStepCount() {
		return this.pathStepCount;
	}
	public void setPathStepCount(Long pathStepCount) {
		this.pathStepCount = pathStepCount;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
