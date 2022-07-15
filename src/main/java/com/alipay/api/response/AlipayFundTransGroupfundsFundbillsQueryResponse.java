package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupFundBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.groupfunds.fundbills.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-17 17:45:01
 */
public class AlipayFundTransGroupfundsFundbillsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2268188179892982187L;

	/** 
	 * 批次状态,包括:  COLLECT:收款中, COLLECT_SUC: 全部收款完成, PAYMENT_SUC: 全部付款完成, CLOSE: 超时收款未完成已关闭，REFUND：付款部分未成功,部分退款
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 当前查询用户关联的资金单据
	 */
	@ApiField("current_fund_bill")
	private GroupFundBill currentFundBill;

	/** 
	 * 当前活动所关联的所有付款/收款单据
	 */
	@ApiListField("fund_bills")
	@ApiField("group_fund_bill")
	private List<GroupFundBill> fundBills;

	/** 
	 * 批次是否过期
	 */
	@ApiField("timeout")
	private Boolean timeout;

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public String getBatchStatus( ) {
		return this.batchStatus;
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

	public void setTimeout(Boolean timeout) {
		this.timeout = timeout;
	}
	public Boolean getTimeout( ) {
		return this.timeout;
	}

}
