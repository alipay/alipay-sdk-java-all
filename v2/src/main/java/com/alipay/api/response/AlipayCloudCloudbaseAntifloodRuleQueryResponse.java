package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntifloodRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:46:45
 */
public class AlipayCloudCloudbaseAntifloodRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8313649187366117942L;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 防刷规则列表
	 */
	@ApiListField("rules")
	@ApiField("antiflood_rule")
	private List<AntifloodRule> rules;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setRules(List<AntifloodRule> rules) {
		this.rules = rules;
	}
	public List<AntifloodRule> getRules( ) {
		return this.rules;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
