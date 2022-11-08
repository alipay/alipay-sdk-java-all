package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TimeCardItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:17:00
 */
public class AlipayCommerceOperationTimescardItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5693319177421984555L;

	/** 
	 * 商品数据列表
	 */
	@ApiField("datas")
	private TimeCardItemInfo datas;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 分页size
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setDatas(TimeCardItemInfo datas) {
		this.datas = datas;
	}
	public TimeCardItemInfo getDatas( ) {
		return this.datas;
	}

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

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
