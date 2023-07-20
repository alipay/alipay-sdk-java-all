package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountLogItemResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.accountlog.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:58:10
 */
public class AlipayDataBillAccountlogQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1289575919995144495L;

	/** 
	 * 账务明细返回结果。
当查询为空的时候，不返回，有结果的时候才会返回。
	 */
	@ApiListField("detail_list")
	@ApiField("account_log_item_result")
	private List<AccountLogItemResult> detailList;

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

	public void setDetailList(List<AccountLogItemResult> detailList) {
		this.detailList = detailList;
	}
	public List<AccountLogItemResult> getDetailList( ) {
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
