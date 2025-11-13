package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjectData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.clue.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-08 15:02:25
 */
public class AlipayIserviceCcmCrmClueQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7355197351213187222L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 具体查询客户线索数据信息
	 */
	@ApiListField("value")
	@ApiField("object_data")
	private List<ObjectData> value;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setValue(List<ObjectData> value) {
		this.value = value;
	}
	public List<ObjectData> getValue( ) {
		return this.value;
	}

}
