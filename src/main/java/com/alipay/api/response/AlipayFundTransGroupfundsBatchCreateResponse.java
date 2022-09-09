package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupFundBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.groupfunds.batch.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-06 18:05:01
 */
public class AlipayFundTransGroupfundsBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8844257923348342214L;

	/** 
	 * 团体资金批次号,后续业务流水以及预付款业务透传
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 当前批次创建者所关联的资金单据
	 */
	@ApiField("current_fund_bill")
	private GroupFundBill currentFundBill;

	/** 
	 * 当前批次对应的所有资金单据
	 */
	@ApiListField("fund_bills")
	@ApiField("group_fund_bill")
	private List<GroupFundBill> fundBills;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setCurrentFundBill(GroupFundBill currentFundBill) {
		this.currentFundBill = currentFundBill;
	}
	public GroupFundBill getCurrentFundBill( ) {
		return this.currentFundBill;
	}

	public void setFundBills(List<GroupFundBill> fundBills) {
		this.fundBills = fundBills;
	}
	public List<GroupFundBill> getFundBills( ) {
		return this.fundBills;
	}

}
