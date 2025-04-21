package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 技能组空闲人数查询
 *
 * @author auto create
 * @since 1.0, 2023-08-03 20:57:17
 */
public class AlipayIserviceSkillgroupFreenumberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1258732583536711417L;

	/**
	 * 实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 技能组的ID
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	/**
	 * 要查询坐席的状态
	 */
	@ApiField("state")
	private String state;

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}
	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
