package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 团体资金单据，包括收款资金单据以及付款资金单据
 *
 * @author auto create
 * @since 1.0, 2019-05-13 16:48:58
 */
public class GroupFundBill extends AlipayObject {

	private static final long serialVersionUID = 2412922434248885521L;

	/**
	 * 实际待收待付金额，两位小数点的整数，单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 待收或待付金额，两位小数点的正数，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资金单据号，唯一标识一次资金流入/流出
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 单据类型, "R"为收款单，"P"为付款单
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 当前流水单据对应的资金明细，仅当前用户会返回全部明细
	 */
	@ApiListField("fund_details")
	@ApiField("group_fund_detail")
	private List<GroupFundDetail> fundDetails;

	/**
	 * 单据状态，包括"INIT": 初始化(发起预结算尚未预付款)，"PRE_PAY": 预付款阶段，"PAY_SUC"：预付款成功，"CLOSE"：已关闭，"REFUND"：已退款
	 */
	@ApiField("status")
	private String status;

	/**
	 * 关联的转账单据号，唤起收银台时使用，发起预付款请求后才会返回
	 */
	@ApiField("transfer_no")
	private String transferNo;

	/**
	 * 单据所属的支付宝账户ID，对于收款单表示待付款用户ID，对于付款单标识待收款用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public List<GroupFundDetail> getFundDetails() {
		return this.fundDetails;
	}
	public void setFundDetails(List<GroupFundDetail> fundDetails) {
		this.fundDetails = fundDetails;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransferNo() {
		return this.transferNo;
	}
	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
