package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学员信息分页查询
 *
 * @author auto create
 * @since 1.0, 2025-10-29 19:57:40
 */
public class AlipayIserviceCstrainingUserdatapageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2198386126689779978L;

	/**
	 * 匹配id
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 训练结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 组织架构id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 是否通过
	 */
	@ApiField("is_passed")
	private String isPassed;

	/**
	 * 学员的标识id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量的条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 学习路径的id
	 */
	@ApiField("path_id")
	private String pathId;

	/**
	 * 学习路径名称
	 */
	@ApiField("path_name")
	private String pathName;

	/**
	 * 路径状态
	 */
	@ApiField("path_status")
	private String pathStatus;

	/**
	 * 台本id
	 */
	@ApiField("playscript_id")
	private String playscriptId;

	/**
	 * 台本名称
	 */
	@ApiField("playscript_name")
	private String playscriptName;

	/**
	 * 节点名称
	 */
	@ApiField("resource_name")
	private String resourceName;

	/**
	 * 资源类型
	 */
	@ApiField("resource_type")
	private String resourceType;

	/**
	 * 阶段名称
	 */
	@ApiField("stage_name")
	private String stageName;

	/**
	 * 训练开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 训练类型
	 */
	@ApiField("training_type")
	private String trainingType;

	/**
	 * 学员名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getIsPassed() {
		return this.isPassed;
	}
	public void setIsPassed(String isPassed) {
		this.isPassed = isPassed;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public String getPathId() {
		return this.pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public String getPathName() {
		return this.pathName;
	}
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public String getPathStatus() {
		return this.pathStatus;
	}
	public void setPathStatus(String pathStatus) {
		this.pathStatus = pathStatus;
	}

	public String getPlayscriptId() {
		return this.playscriptId;
	}
	public void setPlayscriptId(String playscriptId) {
		this.playscriptId = playscriptId;
	}

	public String getPlayscriptName() {
		return this.playscriptName;
	}
	public void setPlayscriptName(String playscriptName) {
		this.playscriptName = playscriptName;
	}

	public String getResourceName() {
		return this.resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getStageName() {
		return this.stageName;
	}
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTrainingType() {
		return this.trainingType;
	}
	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
