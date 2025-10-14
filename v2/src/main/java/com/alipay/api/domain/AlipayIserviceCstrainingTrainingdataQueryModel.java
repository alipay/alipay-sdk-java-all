package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 训练数据查询
 *
 * @author auto create
 * @since 1.0, 2025-08-19 21:32:40
 */
public class AlipayIserviceCstrainingTrainingdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4742544483149426382L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 用户id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 路径id
	 */
	@ApiField("path_id")
	private String pathId;

	/**
	 * 路径名称
	 */
	@ApiField("path_name")
	private String pathName;

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
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * TEST_TENANT
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 台本类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 学员名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
