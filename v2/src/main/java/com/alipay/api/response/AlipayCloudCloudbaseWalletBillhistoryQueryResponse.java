package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Bill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.billhistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:25
 */
public class AlipayCloudCloudbaseWalletBillhistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2328954988423941736L;

	/** 
	 * 账单详情列表
	 */
	@ApiListField("bills")
	@ApiField("bill")
	private List<Bill> bills;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询数据的总条数
	 */
	@ApiField("total")
	private Long total;

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}
	public List<Bill> getBills( ) {
		return this.bills;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
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
