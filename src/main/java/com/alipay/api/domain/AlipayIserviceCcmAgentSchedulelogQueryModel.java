package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询客服状态变更流水日志
 *
 * @author auto create
 * @since 1.0, 2020-12-15 11:29:53
 */
public class AlipayIserviceCcmAgentSchedulelogQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3439638852243289782L;

	/**
	 * 客服id集合,限制最多100个id,不传查询部门下所有客服的状态变更流水日志
	 */
	@ApiListField("agent_ids")
	@ApiField("string")
	private List<String> agentIds;

	/**
	 * 部门id（即租户实例ID、数据权限ID）
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 客服状态变更结束时间,开始时间与结束时间间隔不能超过1天,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 查询条数,最大100, 不传默认100
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 查询结果的页码，起始值为 1，默认值为 1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询时设置的每页记录数，最大值 100 行，默认为 100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 起始id,分页导出的起始客服状态变更流水id,第一页传0,翻页时传上一页结果的最大id
	 */
	@ApiField("start_id")
	private Long startId;

	/**
	 * 客服状态变更开始时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'
	 */
	@ApiField("start_time")
	private Date startTime;

	public List<String> getAgentIds() {
		return this.agentIds;
	}
	public void setAgentIds(List<String> agentIds) {
		this.agentIds = agentIds;
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getLimit() {
		return this.limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
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

	public Long getStartId() {
		return this.startId;
	}
	public void setStartId(Long startId) {
		this.startId = startId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
