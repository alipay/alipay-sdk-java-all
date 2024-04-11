package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AgentScheduleLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.agent.schedulelog.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:18:47
 */
public class AlipayIserviceCcmAgentSchedulelogQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7635821299977425656L;

	/** 
	 * 客服状态变更流水日志集合
	 */
	@ApiField("agent_schedule_logs")
	private AgentScheduleLog agentScheduleLogs;

	/** 
	 * 查询结果的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询时设置的每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条目数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAgentScheduleLogs(AgentScheduleLog agentScheduleLogs) {
		this.agentScheduleLogs = agentScheduleLogs;
	}
	public AgentScheduleLog getAgentScheduleLogs( ) {
		return this.agentScheduleLogs;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
