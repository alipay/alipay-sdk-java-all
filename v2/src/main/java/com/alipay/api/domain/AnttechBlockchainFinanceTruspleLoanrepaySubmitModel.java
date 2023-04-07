package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款通知
 *
 * @author auto create
 * @since 1.0, 2022-10-10 13:48:48
 */
public class AnttechBlockchainFinanceTruspleLoanrepaySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4621476478273754894L;

	/**
	 * 实还总金额，币种最小单位，如果是CNY，则单位分
	 */
	@ApiField("actual_repaid_amount")
	private Long actualRepaidAmount;

	/**
	 * 外部合作伙伴的贷款合同号
	 */
	@ApiField("external_loan_id")
	private String externalLoanId;

	/**
	 * 外部合作伙伴的还款请求号，用做业务幂等号
	 */
	@ApiField("external_repay_request_id")
	private String externalRepayRequestId;

	/**
	 * 外部用户唯一标识
	 */
	@ApiField("external_user_id")
	private String externalUserId;

	/**
	 * 还款资金来源：
ALIPAY - 支付宝，
UNIONPAY - 银联，
TRADE_COLLECTION - 外贸回款
	 */
	@ApiField("fund_channel")
	private String fundChannel;

	/**
	 * 转账附言：
1）支付宝渠道还款必有，
2）银联渠道还款没有，
3）外贸回款必有
	 */
	@ApiField("fund_message")
	private String fundMessage;

	/**
	 * 机构代码
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 分期明细列表
	 */
	@ApiListField("installment_details")
	@ApiField("installment_detail")
	private List<InstallmentDetail> installmentDetails;

	/**
	 * 还款金额币种
	 */
	@ApiField("repay_amount_currency")
	private String repayAmountCurrency;

	/**
	 * 还款成功时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("repay_time")
	private String repayTime;

	/**
	 * 还款类型：
PREPAY - 提前还款，
DUE_REPAY - 到期还款，
OVERDUE_REPAY - 逾期还款
	 */
	@ApiField("repay_type")
	private String repayType;

	public Long getActualRepaidAmount() {
		return this.actualRepaidAmount;
	}
	public void setActualRepaidAmount(Long actualRepaidAmount) {
		this.actualRepaidAmount = actualRepaidAmount;
	}

	public String getExternalLoanId() {
		return this.externalLoanId;
	}
	public void setExternalLoanId(String externalLoanId) {
		this.externalLoanId = externalLoanId;
	}

	public String getExternalRepayRequestId() {
		return this.externalRepayRequestId;
	}
	public void setExternalRepayRequestId(String externalRepayRequestId) {
		this.externalRepayRequestId = externalRepayRequestId;
	}

	public String getExternalUserId() {
		return this.externalUserId;
	}
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}

	public String getFundChannel() {
		return this.fundChannel;
	}
	public void setFundChannel(String fundChannel) {
		this.fundChannel = fundChannel;
	}

	public String getFundMessage() {
		return this.fundMessage;
	}
	public void setFundMessage(String fundMessage) {
		this.fundMessage = fundMessage;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public List<InstallmentDetail> getInstallmentDetails() {
		return this.installmentDetails;
	}
	public void setInstallmentDetails(List<InstallmentDetail> installmentDetails) {
		this.installmentDetails = installmentDetails;
	}

	public String getRepayAmountCurrency() {
		return this.repayAmountCurrency;
	}
	public void setRepayAmountCurrency(String repayAmountCurrency) {
		this.repayAmountCurrency = repayAmountCurrency;
	}

	public String getRepayTime() {
		return this.repayTime;
	}
	public void setRepayTime(String repayTime) {
		this.repayTime = repayTime;
	}

	public String getRepayType() {
		return this.repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

}
