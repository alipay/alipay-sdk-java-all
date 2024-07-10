package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 技能组查询空闲坐席返回体
 *
 * @author auto create
 * @since 1.0, 2023-08-03 20:57:17
 */
public class ListAgentAccountStatesFacadeResponse extends AlipayObject {

	private static final long serialVersionUID = 5525479932186633649L;

	/**
	 * 当前页
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 坐席列表
	 */
	@ApiListField("list")
	@ApiField("agent_account_states")
	private List<AgentAccountStates> list;

	/**
	 * 页数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public List<AgentAccountStates> getList() {
		return this.list;
	}
	public void setList(List<AgentAccountStates> list) {
		this.list = list;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getTotalPage() {
		return this.totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

}
