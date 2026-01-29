package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资商通对账场景分账计划
 *
 * @author auto create
 * @since 1.0, 2025-11-07 14:04:33
 */
public class RentBillRoyaltyDto extends AlipayObject {

	private static final long serialVersionUID = 2897448684231627789L;

	/**
	 * 实际分账买断金利息，单位元
	 */
	@ApiField("actual_royalty_buyout_interest_price")
	private String actualRoyaltyBuyoutInterestPrice;

	/**
	 * 实际分账买断金，单位元
	 */
	@ApiField("actual_royalty_buyout_price")
	private String actualRoyaltyBuyoutPrice;

	/**
	 * 实际分账买断金本金，单位元
	 */
	@ApiField("actual_royalty_buyout_principal_price")
	private String actualRoyaltyBuyoutPrincipalPrice;

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
	 * 实际分账租金利息，单位元
	 */
	@ApiField("actual_royalty_rent_interest_price")
	private String actualRoyaltyRentInterestPrice;

	/**
	 * 实际分账租金，单位元
	 */
	@ApiField("actual_royalty_rent_price")
	private String actualRoyaltyRentPrice;

	/**
	 * 实际分账租金本金，单位元
	 */
	@ApiField("actual_royalty_rent_principal_price")
	private String actualRoyaltyRentPrincipalPrice;

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

	public String getActualRoyaltyBuyoutInterestPrice() {
		return this.actualRoyaltyBuyoutInterestPrice;
	}
	public void setActualRoyaltyBuyoutInterestPrice(String actualRoyaltyBuyoutInterestPrice) {
		this.actualRoyaltyBuyoutInterestPrice = actualRoyaltyBuyoutInterestPrice;
	}

	public String getActualRoyaltyBuyoutPrice() {
		return this.actualRoyaltyBuyoutPrice;
	}
	public void setActualRoyaltyBuyoutPrice(String actualRoyaltyBuyoutPrice) {
		this.actualRoyaltyBuyoutPrice = actualRoyaltyBuyoutPrice;
	}

	public String getActualRoyaltyBuyoutPrincipalPrice() {
		return this.actualRoyaltyBuyoutPrincipalPrice;
	}
	public void setActualRoyaltyBuyoutPrincipalPrice(String actualRoyaltyBuyoutPrincipalPrice) {
		this.actualRoyaltyBuyoutPrincipalPrice = actualRoyaltyBuyoutPrincipalPrice;
	}

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

	public String getActualRoyaltyRentInterestPrice() {
		return this.actualRoyaltyRentInterestPrice;
	}
	public void setActualRoyaltyRentInterestPrice(String actualRoyaltyRentInterestPrice) {
		this.actualRoyaltyRentInterestPrice = actualRoyaltyRentInterestPrice;
	}

	public String getActualRoyaltyRentPrice() {
		return this.actualRoyaltyRentPrice;
	}
	public void setActualRoyaltyRentPrice(String actualRoyaltyRentPrice) {
		this.actualRoyaltyRentPrice = actualRoyaltyRentPrice;
	}

	public String getActualRoyaltyRentPrincipalPrice() {
		return this.actualRoyaltyRentPrincipalPrice;
	}
	public void setActualRoyaltyRentPrincipalPrice(String actualRoyaltyRentPrincipalPrice) {
		this.actualRoyaltyRentPrincipalPrice = actualRoyaltyRentPrincipalPrice;
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
