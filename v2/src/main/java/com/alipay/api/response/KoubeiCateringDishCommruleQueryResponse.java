package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishCommRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.commrule.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:52:50
 */
public class KoubeiCateringDishCommruleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4184429486217827886L;

	/** 
	 * 返回的数据集合
	 */
	@ApiField("kbdish_comm_rule_info_list")
	private KbdishCommRuleInfo kbdishCommRuleInfoList;

	/** 
	 * 表示当前页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 表示每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 数据总条数
	 */
	@ApiField("total_count")
	private String totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private String totalPage;

	public void setKbdishCommRuleInfoList(KbdishCommRuleInfo kbdishCommRuleInfoList) {
		this.kbdishCommRuleInfoList = kbdishCommRuleInfoList;
	}
	public KbdishCommRuleInfo getKbdishCommRuleInfoList( ) {
		return this.kbdishCommRuleInfoList;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}
	public String getTotalPage( ) {
		return this.totalPage;
	}

}
