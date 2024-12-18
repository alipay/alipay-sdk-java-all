package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniInstantiateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.instantiate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:22
 */
public class AlipayOpenMiniInstantiateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5353381458785349645L;

	/** 
	 * 实例化商家小程序列表
	 */
	@ApiListField("instantiate_list")
	@ApiField("mini_instantiate_info")
	private List<MiniInstantiateInfo> instantiateList;

	/** 
	 * 分页页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_items")
	private Long totalItems;

	public void setInstantiateList(List<MiniInstantiateInfo> instantiateList) {
		this.instantiateList = instantiateList;
	}
	public List<MiniInstantiateInfo> getInstantiateList( ) {
		return this.instantiateList;
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

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

}
