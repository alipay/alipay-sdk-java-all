package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromotePageDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.promotepage.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:10:58
 */
public class AlipayDataDataserviceAdPromotepageBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6875575776483912397L;

	/** 
	 * 自建推广页详情列表
	 */
	@ApiListField("list")
	@ApiField("promote_page_detail")
	private List<PromotePageDetail> list;

	/** 
	 * 分页参数之页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页参数之每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 分页参数之总数据量
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<PromotePageDetail> list) {
		this.list = list;
	}
	public List<PromotePageDetail> getList( ) {
		return this.list;
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
