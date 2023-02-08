package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradeItemResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.sell.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-17 10:57:43
 */
public class AlipayDataBillSellQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8144997672793995154L;

	/** 
	 * 交易流水详情
	 */
	@ApiListField("detail_list")
	@ApiField("trade_item_result")
	private List<TradeItemResult> detailList;

	/** 
	 * 分页号，从1开始
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 分页大小1000-2000
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 账务明细总数。返回满足查询条件的明细的数量
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setDetailList(List<TradeItemResult> detailList) {
		this.detailList = detailList;
	}
	public List<TradeItemResult> getDetailList( ) {
		return this.detailList;
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

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
