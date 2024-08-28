package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentPayQueryBillDetailListResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.rent.batchdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-27 17:10:19
 */
public class AlipayEbppIndustryRentBatchdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4785591265491118936L;

	/** 
	 * 对账单列表
	 */
	@ApiListField("bill_detail_list")
	@ApiField("rent_pay_query_bill_detail_list_response")
	private List<RentPayQueryBillDetailListResponse> billDetailList;

	public void setBillDetailList(List<RentPayQueryBillDetailListResponse> billDetailList) {
		this.billDetailList = billDetailList;
	}
	public List<RentPayQueryBillDetailListResponse> getBillDetailList( ) {
		return this.billDetailList;
	}

}
