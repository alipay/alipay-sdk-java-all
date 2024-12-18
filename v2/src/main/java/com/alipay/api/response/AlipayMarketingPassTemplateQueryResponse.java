package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassTemplateDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.pass.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayMarketingPassTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5376566764982737198L;

	/** 
	 * 当前查询的页码，页码从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前查询的每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 卡券模板总数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 按page_size分页的总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 卡券模板列表
	 */
	@ApiListField("tpl_list")
	@ApiField("pass_template_detail")
	private List<PassTemplateDetail> tplList;

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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTplList(List<PassTemplateDetail> tplList) {
		this.tplList = tplList;
	}
	public List<PassTemplateDetail> getTplList( ) {
		return this.tplList;
	}

}
