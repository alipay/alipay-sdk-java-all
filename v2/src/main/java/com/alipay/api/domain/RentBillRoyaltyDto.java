package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资商通对账场景分账计划
 *
 * @author auto create
 * @since 1.0, 2025-08-26 12:27:44
 */
public class RentBillRoyaltyDto extends AlipayObject {

	private static final long serialVersionUID = 3772982245599865559L;

	/**
	 * 分账利息，单位元
	 */
	@ApiField("actual_royalty_interest_price")
	private String actualRoyaltyInterestPrice;

	/**
	 * 分账金额，单位元
	 */
	@ApiField("actual_royalty_price")
	private String actualRoyaltyPrice;

	/**
	 * 分账本金，单位元
	 */
	@ApiField("actual_royalty_principal_price")
	private String actualRoyaltyPrincipalPrice;

	/**
	 * 当前期数对应的阶梯买断分账金，单位元
	 */
	@ApiField("current_buyout_price")
	private String currentBuyoutPrice;

	/**
	 * 关联分账履约单号
	 */
	@ApiField("key_royalty_installment_no")
	private String keyRoyaltyInstallmentNo;

	/**
	 * 还款期数
	 */
	@ApiField("period")
	private String period;

	/**
	 * 分账计划id
	 */
	@ApiField("royalty_id")
	private String royaltyId;

	/**
	 * 分账状态
	 */
	@ApiField("royalty_status")
	private String royaltyStatus;

	/**
	 * 还款阶段
	 */
	@ApiField("stage")
	private String stage;

	/**
	 * 还款资金类型
	 */
	@ApiField("type")
	private String type;

	public String getActualRoyaltyInterestPrice() {
		return this.actualRoyaltyInterestPrice;
	}
	public void setActualRoyaltyInterestPrice(String actualRoyaltyInterestPrice) {
		this.actualRoyaltyInterestPrice = actualRoyaltyInterestPrice;
	}

	public String getActualRoyaltyPrice() {
		return this.actualRoyaltyPrice;
	}
	public void setActualRoyaltyPrice(String actualRoyaltyPrice) {
		this.actualRoyaltyPrice = actualRoyaltyPrice;
	}

	public String getActualRoyaltyPrincipalPrice() {
		return this.actualRoyaltyPrincipalPrice;
	}
	public void setActualRoyaltyPrincipalPrice(String actualRoyaltyPrincipalPrice) {
		this.actualRoyaltyPrincipalPrice = actualRoyaltyPrincipalPrice;
	}

	public String getCurrentBuyoutPrice() {
		return this.currentBuyoutPrice;
	}
	public void setCurrentBuyoutPrice(String currentBuyoutPrice) {
		this.currentBuyoutPrice = currentBuyoutPrice;
	}

	public String getKeyRoyaltyInstallmentNo() {
		return this.keyRoyaltyInstallmentNo;
	}
	public void setKeyRoyaltyInstallmentNo(String keyRoyaltyInstallmentNo) {
		this.keyRoyaltyInstallmentNo = keyRoyaltyInstallmentNo;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRoyaltyId() {
		return this.royaltyId;
	}
	public void setRoyaltyId(String royaltyId) {
		this.royaltyId = royaltyId;
	}

	public String getRoyaltyStatus() {
		return this.royaltyStatus;
	}
	public void setRoyaltyStatus(String royaltyStatus) {
		this.royaltyStatus = royaltyStatus;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
