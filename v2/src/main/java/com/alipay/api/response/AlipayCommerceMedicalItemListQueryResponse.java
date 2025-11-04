package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemInfoDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 10:47:26
 */
public class AlipayCommerceMedicalItemListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1598281992783825566L;

	/** 
	 * 商品详情
	 */
	@ApiListField("item_info_list")
	@ApiField("item_info_detail")
	private List<ItemInfoDetail> itemInfoList;

	/** 
	 * 页面页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页面大小,单位条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 门店商品总数
	 */
	@ApiField("total")
	private Long total;

	public void setItemInfoList(List<ItemInfoDetail> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}
	public List<ItemInfoDetail> getItemInfoList( ) {
		return this.itemInfoList;
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
