package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TrusteeshipAccountBillQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-31 17:59:20
 */
public class AlipayFundAccountBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7679165685222266862L;

	/** 
	 * 账单详情
	 */
	@ApiListField("acc_detail_list")
	@ApiField("trusteeship_account_bill_query_response")
	private List<TrusteeshipAccountBillQueryResponse> accDetailList;

	/** 
	 * 结果页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 结果页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 每页元素数
	 */
	@ApiField("total_item_count")
	private String totalItemCount;

	public void setAccDetailList(List<TrusteeshipAccountBillQueryResponse> accDetailList) {
		this.accDetailList = accDetailList;
	}
	public List<TrusteeshipAccountBillQueryResponse> getAccDetailList( ) {
		return this.accDetailList;
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

	public void setTotalItemCount(String totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	public String getTotalItemCount( ) {
		return this.totalItemCount;
	}

}
