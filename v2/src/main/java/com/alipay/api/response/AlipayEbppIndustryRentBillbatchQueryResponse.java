package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentPayQueryBillListResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.rent.billbatch.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-27 17:10:39
 */
public class AlipayEbppIndustryRentBillbatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6577614463661179134L;

	/** 
	 * 账单批次列表
	 */
	@ApiListField("batch_list")
	@ApiField("rent_pay_query_bill_list_response")
	private List<RentPayQueryBillListResponse> batchList;

	/** 
	 * 账单总金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setBatchList(List<RentPayQueryBillListResponse> batchList) {
		this.batchList = batchList;
	}
	public List<RentPayQueryBillListResponse> getBatchList( ) {
		return this.batchList;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
