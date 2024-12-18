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
 * @since 1.0, 2024-06-28 10:17:03
 */
public class AlipayEbppIndustrySupervisionBillBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2645695199888943653L;

	/** 
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("supervision_bill_info")
	private List<SupervisionBillInfo> billList;

	/** 
	 * 当前页码 对应查询参数的「查询页码 page_index 」
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页记录数
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
