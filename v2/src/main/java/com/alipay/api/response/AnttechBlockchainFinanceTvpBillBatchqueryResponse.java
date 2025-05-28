package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TrustBillOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.bill.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-08 11:17:21
 */
public class AnttechBlockchainFinanceTvpBillBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8414213331126657894L;

	/** 
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("trust_bill_order")
	private List<TrustBillOrder> billList;

	/** 
	 * 资金单据总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setBillList(List<TrustBillOrder> billList) {
		this.billList = billList;
	}
	public List<TrustBillOrder> getBillList( ) {
		return this.billList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
