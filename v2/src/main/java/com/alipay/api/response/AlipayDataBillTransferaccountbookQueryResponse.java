package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TransferAccountBookDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.transferaccountbook.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-10 10:45:13
 */
public class AlipayDataBillTransferaccountbookQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5432112433579229529L;

	/** 
	 * 充值、提现、转账明细记录
	 */
	@ApiListField("detail_list")
	@ApiField("transfer_account_book_detail_result")
	private List<TransferAccountBookDetailResult> detailList;

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
	 * 充值、提现、转账明细总数。返回满足查询条件的明细的数量
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setDetailList(List<TransferAccountBookDetailResult> detailList) {
		this.detailList = detailList;
	}
	public List<TransferAccountBookDetailResult> getDetailList( ) {
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
