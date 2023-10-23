package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单分页返回
 *
 * @author auto create
 * @since 1.0, 2023-10-09 10:08:12
 */
public class DeductionOrderPageProcessorResponse extends AlipayObject {

	private static final long serialVersionUID = 8455958247373536589L;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 订单金额
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 下单时间
	 */
	@ApiField("deduction_order_date")
	private Date deductionOrderDate;

	/**
	 * 扣款单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 扣款状态
	 */
	@ApiField("deduction_status")
	private String deductionStatus;

	/**
	 * 实际扣款时间
	 */
	@ApiField("deduction_time")
	private Date deductionTime;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 分账状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public Date getDeductionOrderDate() {
		return this.deductionOrderDate;
	}
	public void setDeductionOrderDate(Date deductionOrderDate) {
		this.deductionOrderDate = deductionOrderDate;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public String getDeductionStatus() {
		return this.deductionStatus;
	}
	public void setDeductionStatus(String deductionStatus) {
		this.deductionStatus = deductionStatus;
	}

	public Date getDeductionTime() {
		return this.deductionTime;
	}
	public void setDeductionTime(Date deductionTime) {
		this.deductionTime = deductionTime;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

}
