package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-16 16:01:20
 */
public class RentPayQueryUserSignInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 3392937294754121749L;

	/**
	 * 申请人id
	 */
	@ApiField("applicant_id")
	private String applicantId;

	/**
	 * 完成
	 */
	@ApiField("approval_status")
	private String approvalStatus;

	/**
	 * 剩余提取额度，单位：元
	 */
	@ApiField("balance_amount")
	private String balanceAmount;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用户提取金额，单位：元
	 */
	@ApiField("draw_amount")
	private String drawAmount;

	/**
	 * 提取利息，单位：元
	 */
	@ApiField("draw_interest")
	private String drawInterest;

	/**
	 * 默认响应zf
	 */
	@ApiField("draw_item")
	private String drawItem;

	/**
	 * 提取事项明细id
	 */
	@ApiField("draw_item_detail_id")
	private String drawItemDetailId;

	/**
	 * 10-是
	 */
	@ApiField("is_coextract")
	private String isCoextract;

	/**
	 * 事项创建时间，格式yyyyMMddHHmmss
	 */
	@ApiField("item_creation_time")
	private String itemCreationTime;

	/**
	 * 事项id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 启用
	 */
	@ApiField("item_state")
	private String itemState;

	/**
	 * 操作平台
	 */
	@ApiField("operating_deck")
	private String operatingDeck;

	/**
	 * 操作时间
	 */
	@ApiField("operating_time")
	private String operatingTime;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 发票租房，保租房，公租房，多子女租房提，默认是空，不为空时代表本月租金剩余额度，单位：元
	 */
	@ApiField("rent_monthly_balance")
	private String rentMonthlyBalance;

	/**
	 * 30-租住商品住房；
	 */
	@ApiField("rental_type")
	private String rentalType;

	/**
	 * 是-10
	 */
	@ApiField("trans_provincial_label")
	private String transProvincialLabel;

	/**
	 * 签约用户在公积金侧的备案编号
	 */
	@ApiField("user_record_no")
	private String userRecordNo;

	public String getApplicantId() {
		return this.applicantId;
	}
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getApprovalStatus() {
		return this.approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getBalanceAmount() {
		return this.balanceAmount;
	}
	public void setBalanceAmount(String balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getDrawAmount() {
		return this.drawAmount;
	}
	public void setDrawAmount(String drawAmount) {
		this.drawAmount = drawAmount;
	}

	public String getDrawInterest() {
		return this.drawInterest;
	}
	public void setDrawInterest(String drawInterest) {
		this.drawInterest = drawInterest;
	}

	public String getDrawItem() {
		return this.drawItem;
	}
	public void setDrawItem(String drawItem) {
		this.drawItem = drawItem;
	}

	public String getDrawItemDetailId() {
		return this.drawItemDetailId;
	}
	public void setDrawItemDetailId(String drawItemDetailId) {
		this.drawItemDetailId = drawItemDetailId;
	}

	public String getIsCoextract() {
		return this.isCoextract;
	}
	public void setIsCoextract(String isCoextract) {
		this.isCoextract = isCoextract;
	}

	public String getItemCreationTime() {
		return this.itemCreationTime;
	}
	public void setItemCreationTime(String itemCreationTime) {
		this.itemCreationTime = itemCreationTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemState() {
		return this.itemState;
	}
	public void setItemState(String itemState) {
		this.itemState = itemState;
	}

	public String getOperatingDeck() {
		return this.operatingDeck;
	}
	public void setOperatingDeck(String operatingDeck) {
		this.operatingDeck = operatingDeck;
	}

	public String getOperatingTime() {
		return this.operatingTime;
	}
	public void setOperatingTime(String operatingTime) {
		this.operatingTime = operatingTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRentMonthlyBalance() {
		return this.rentMonthlyBalance;
	}
	public void setRentMonthlyBalance(String rentMonthlyBalance) {
		this.rentMonthlyBalance = rentMonthlyBalance;
	}

	public String getRentalType() {
		return this.rentalType;
	}
	public void setRentalType(String rentalType) {
		this.rentalType = rentalType;
	}

	public String getTransProvincialLabel() {
		return this.transProvincialLabel;
	}
	public void setTransProvincialLabel(String transProvincialLabel) {
		this.transProvincialLabel = transProvincialLabel;
	}

	public String getUserRecordNo() {
		return this.userRecordNo;
	}
	public void setUserRecordNo(String userRecordNo) {
		this.userRecordNo = userRecordNo;
	}

}
