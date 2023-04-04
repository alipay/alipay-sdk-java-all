package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AgentVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.agent.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:59:50
 */
public class AlipayIserviceCcmAgentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4655999153348367111L;

	/** 
	 * 客服列表
	 */
	@ApiListField("agents")
	@ApiField("agent_v_o")
	private List<AgentVO> agents;

	/** 
	 * 查询结果的页码，起始值为 1，默认值为 1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询时设置的每页记录数，最大值 100 行，默认为 10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条目数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAgents(List<AgentVO> agents) {
		this.agents = agents;
	}
	public List<AgentVO> getAgents( ) {
		return this.agents;
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
