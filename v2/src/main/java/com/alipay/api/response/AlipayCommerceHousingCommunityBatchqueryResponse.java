package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommunityModelDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.community.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 15:12:27
 */
public class AlipayCommerceHousingCommunityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5695672894689816538L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("community_model_d_t_o")
	private List<CommunityModelDTO> list;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数据，单位：条
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<CommunityModelDTO> list) {
		this.list = list;
	}
	public List<CommunityModelDTO> getList( ) {
		return this.list;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
