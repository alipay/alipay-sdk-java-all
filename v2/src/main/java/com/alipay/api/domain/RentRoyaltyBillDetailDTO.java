package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单分账详情
 *
 * @author auto create
 * @since 1.0, 2025-04-24 14:27:34
 */
public class RentRoyaltyBillDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 6866944245949771247L;

	/**
	 * 资金类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 资方企业支付宝账户类型
	 */
	@ApiField("invest_account_type")
	private String investAccountType;

	/**
	 * 资方银行卡号
	 */
	@ApiField("invest_card_no")
	private String investCardNo;

	/**
	 * 租赁期数，单位：月
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 分账账单id
	 */
	@ApiField("royalty_bill_id")
	private String royaltyBillId;

	/**
	 * 分账类型
	 */
	@ApiField("royalty_deliver_type")
	private String royaltyDeliverType;

	/**
	 * 分账完成时间
	 */
	@ApiField("royalty_finish_time")
	private Date royaltyFinishTime;

	/**
	 * 分账履约单号
	 */
	@ApiField("royalty_installment_no")
	private String royaltyInstallmentNo;

	/**
	 * 分账金额
	 */
	@ApiField("royalty_price")
	private String royaltyPrice;

	/**
	 * 租赁阶段
	 */
	@ApiField("stage")
	private Long stage;

	/**
	 * 分账交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getInvestAccountType() {
		return this.investAccountType;
	}
	public void setInvestAccountType(String investAccountType) {
		this.investAccountType = investAccountType;
	}

	public String getInvestCardNo() {
		return this.investCardNo;
	}
	public void setInvestCardNo(String investCardNo) {
		this.investCardNo = investCardNo;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getRoyaltyBillId() {
		return this.royaltyBillId;
	}
	public void setRoyaltyBillId(String royaltyBillId) {
		this.royaltyBillId = royaltyBillId;
	}

	public String getRoyaltyDeliverType() {
		return this.royaltyDeliverType;
	}
	public void setRoyaltyDeliverType(String royaltyDeliverType) {
		this.royaltyDeliverType = royaltyDeliverType;
	}

	public Date getRoyaltyFinishTime() {
		return this.royaltyFinishTime;
	}
	public void setRoyaltyFinishTime(Date royaltyFinishTime) {
		this.royaltyFinishTime = royaltyFinishTime;
	}

	public String getRoyaltyInstallmentNo() {
		return this.royaltyInstallmentNo;
	}
	public void setRoyaltyInstallmentNo(String royaltyInstallmentNo) {
		this.royaltyInstallmentNo = royaltyInstallmentNo;
	}

	public String getRoyaltyPrice() {
		return this.royaltyPrice;
	}
	public void setRoyaltyPrice(String royaltyPrice) {
		this.royaltyPrice = royaltyPrice;
	}

	public Long getStage() {
		return this.stage;
	}
	public void setStage(Long stage) {
		this.stage = stage;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
