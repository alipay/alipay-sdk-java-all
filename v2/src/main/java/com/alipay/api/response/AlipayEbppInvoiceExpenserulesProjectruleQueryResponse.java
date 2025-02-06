package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProjectRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectrule.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-19 18:08:59
 */
public class AlipayEbppInvoiceExpenserulesProjectruleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8381632125362235816L;

	/** 
	 * 当前页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 当前记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 项目规则列表
	 */
	@ApiListField("project_rule_info_list")
	@ApiField("project_rule_info")
	private List<ProjectRuleInfo> projectRuleInfoList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private String totalPageCount;

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setProjectRuleInfoList(List<ProjectRuleInfo> projectRuleInfoList) {
		this.projectRuleInfoList = projectRuleInfoList;
	}
	public List<ProjectRuleInfo> getProjectRuleInfoList( ) {
		return this.projectRuleInfoList;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public String getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
