package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资商通分账明细模型
 *
 * @author auto create
 * @since 1.0, 2025-08-29 22:16:50
 */
public class RentBillRoyaltyDetailDto extends AlipayObject {

	private static final long serialVersionUID = 1666156911624824961L;

	/**
	 * 实际分账金额，单位元
	 */
	@ApiField("actual_royalty_amount")
	private String actualRoyaltyAmount;

	/**
	 * 交易组件订单id
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 分账资方pid
	 */
	@ApiField("invest_id")
	private String investId;

	/**
	 * 本次分账明细对应的租赁单期数，多条用英文逗号分隔
	 */
	@ApiField("period")
	private String period;

	/**
	 * 分账计划列表
	 */
	@ApiListField("rent_royalty_list")
	@ApiField("rent_bill_royalty_dto")
	private List<RentBillRoyaltyDto> rentRoyaltyList;

	/**
	 * 分账履约方式
	 */
	@ApiField("royalty_deliver_type")
	private String royaltyDeliverType;

	/**
	 * 本次分账明细关联的分账计划id，多条用英文逗号分隔
	 */
	@ApiField("royalty_id")
	private String royaltyId;

	/**
	 * 分账履约单号
	 */
	@ApiField("royalty_installment_no")
	private String royaltyInstallmentNo;

	/**
	 * 分账支付方式
	 */
	@ApiField("royalty_payment_method")
	private String royaltyPaymentMethod;

	/**
	 * 分账支付方式备注，履约单号+"-到卡"或者+"到户"
	 */
	@ApiField("royalty_payment_method_note")
	private String royaltyPaymentMethodNote;

	/**
	 * 分账完成时间
	 */
	@ApiField("royalty_time")
	private Date royaltyTime;

	/**
	 * 分账触发方式
	 */
	@ApiField("royalty_trigger_type")
	private String royaltyTriggerType;

	/**
	 * 分账商家pid
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 特殊分账标
	 */
	@ApiField("special_royalty_type")
	private String specialRoyaltyType;

	/**
	 * 本次分账明细对应的租赁单阶段，多条用英文逗号分隔
	 */
	@ApiField("stage")
	private String stage;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getActualRoyaltyAmount() {
		return this.actualRoyaltyAmount;
	}
	public void setActualRoyaltyAmount(String actualRoyaltyAmount) {
		this.actualRoyaltyAmount = actualRoyaltyAmount;
	}

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getInvestId() {
		return this.investId;
	}
	public void setInvestId(String investId) {
		this.investId = investId;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public List<RentBillRoyaltyDto> getRentRoyaltyList() {
		return this.rentRoyaltyList;
	}
	public void setRentRoyaltyList(List<RentBillRoyaltyDto> rentRoyaltyList) {
		this.rentRoyaltyList = rentRoyaltyList;
	}

	public String getRoyaltyDeliverType() {
		return this.royaltyDeliverType;
	}
	public void setRoyaltyDeliverType(String royaltyDeliverType) {
		this.royaltyDeliverType = royaltyDeliverType;
	}

	public String getRoyaltyId() {
		return this.royaltyId;
	}
	public void setRoyaltyId(String royaltyId) {
		this.royaltyId = royaltyId;
	}

	public String getRoyaltyInstallmentNo() {
		return this.royaltyInstallmentNo;
	}
	public void setRoyaltyInstallmentNo(String royaltyInstallmentNo) {
		this.royaltyInstallmentNo = royaltyInstallmentNo;
	}

	public String getRoyaltyPaymentMethod() {
		return this.royaltyPaymentMethod;
	}
	public void setRoyaltyPaymentMethod(String royaltyPaymentMethod) {
		this.royaltyPaymentMethod = royaltyPaymentMethod;
	}

	public String getRoyaltyPaymentMethodNote() {
		return this.royaltyPaymentMethodNote;
	}
	public void setRoyaltyPaymentMethodNote(String royaltyPaymentMethodNote) {
		this.royaltyPaymentMethodNote = royaltyPaymentMethodNote;
	}

	public Date getRoyaltyTime() {
		return this.royaltyTime;
	}
	public void setRoyaltyTime(Date royaltyTime) {
		this.royaltyTime = royaltyTime;
	}

	public String getRoyaltyTriggerType() {
		return this.royaltyTriggerType;
	}
	public void setRoyaltyTriggerType(String royaltyTriggerType) {
		this.royaltyTriggerType = royaltyTriggerType;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSpecialRoyaltyType() {
		return this.specialRoyaltyType;
	}
	public void setSpecialRoyaltyType(String specialRoyaltyType) {
		this.specialRoyaltyType = specialRoyaltyType;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
