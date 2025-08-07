package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiSkillGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.skillgrouppagequery.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:41:44
 */
public class AlipayIserviceIsresourceSkillgrouppagequeryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2128292875563989388L;

	/** 
	 * 技能组列表
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_skill_group_info")
	private List<OpenApiSkillGroupInfo> bizData;

	/** 
	 * 分页总数
	 */
	@ApiField("page_count")
	private Long pageCount;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setBizData(List<OpenApiSkillGroupInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiSkillGroupInfo> getBizData( ) {
		return this.bizData;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}
	public Long getPageCount( ) {
		return this.pageCount;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
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

}
