package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupervisionBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.bill.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:26:42
 */
public class AlipayEbppIndustrySupervisionBillBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4176395716739114713L;

	/** 
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("supervision_bill_info")
	private List<SupervisionBillInfo> billList;

	/** 
	 * 当前页面
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	public void setBillList(List<SupervisionBillInfo> billList) {
		this.billList = billList;
	}
	public List<SupervisionBillInfo> getBillList( ) {
		return this.billList;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

}
