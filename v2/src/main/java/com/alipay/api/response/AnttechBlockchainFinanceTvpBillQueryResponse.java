package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TrustFundOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-08 11:17:21
 */
public class AnttechBlockchainFinanceTvpBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6324967643714957363L;

	/** 
	 * 账单支付总金额，单位元
	 */
	@ApiField("actual_total_amount")
	private String actualTotalAmount;

	/** 
	 * 账单调整金额，单位元
	 */
	@ApiField("adjusted_amount")
	private String adjustedAmount;

	/** 
	 * 账单明细列表，可信账单场景下只有一条明细
	 */
	@ApiListField("bill_detail_list")
	@ApiField("trust_fund_order")
	private List<TrustFundOrder> billDetailList;

	/** 
	 * 账单名称
	 */
	@ApiField("bill_name")
	private String billName;

	/** 
	 * 账单id,数科唯一
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 账单产出时间
	 */
	@ApiField("billing_date")
	private Date billingDate;

	/** 
	 * 状态说明
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 账单核算截止时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/** 
	 * 账单过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 账单初始总金额, 单位元
	 */
	@ApiField("original_total_amount")
	private String originalTotalAmount;

	/** 
	 * 外部账单ID
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/** 
	 * 交易备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 账单核算起始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/** 
	 * 账单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 账单类型
	 */
	@ApiField("type")
	private String type;

	public void setActualTotalAmount(String actualTotalAmount) {
		this.actualTotalAmount = actualTotalAmount;
	}
	public String getActualTotalAmount( ) {
		return this.actualTotalAmount;
	}

	public void setAdjustedAmount(String adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}
	public String getAdjustedAmount( ) {
		return this.adjustedAmount;
	}

	public void setBillDetailList(List<TrustFundOrder> billDetailList) {
		this.billDetailList = billDetailList;
	}
	public List<TrustFundOrder> getBillDetailList( ) {
		return this.billDetailList;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillName( ) {
		return this.billName;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}
	public Date getBillingDate( ) {
		return this.billingDate;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate( ) {
		return this.endDate;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setOriginalTotalAmount(String originalTotalAmount) {
		this.originalTotalAmount = originalTotalAmount;
	}
	public String getOriginalTotalAmount( ) {
		return this.originalTotalAmount;
	}

	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}
	public String getOutBillNo( ) {
		return this.outBillNo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate( ) {
		return this.startDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
