package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款方附属信息
 *
 * @author auto create
 * @since 1.0, 2026-10-19 19:42:55
 */
public class AdditionBeneficiary extends AlipayObject {

	private static final long serialVersionUID = 4643413367385492421L;

	/**
	 * 收款人信息
	 */
	@ApiField("beneficiary")
	private TransferUserBeneficiaryW beneficiary;

	/**
	 * 付款人信息
	 */
	@ApiField("payer")
	private TransferUserPayerW payer;

	/**
	 * 缴费账单信息
	 */
	@ApiField("payment_bill")
	private TransferPaymentBillw paymentBill;

	/**
	 * transfer_from_region info
	 */
	@ApiField("transfer_from_region")
	private String transferFromRegion;

	/**
	 * transfer_purpose info
	 */
	@ApiField("transfer_purpose")
	private String transferPurpose;

	/**
	 * transfer_reference
	 */
	@ApiField("transfer_reference")
	private String transferReference;

	/**
	 * transfer_to_Region
	 */
	@ApiField("transfer_to_region")
	private String transferToRegion;

	public TransferUserBeneficiaryW getBeneficiary() {
		return this.beneficiary;
	}
	public void setBeneficiary(TransferUserBeneficiaryW beneficiary) {
		this.beneficiary = beneficiary;
	}

	public TransferUserPayerW getPayer() {
		return this.payer;
	}
	public void setPayer(TransferUserPayerW payer) {
		this.payer = payer;
	}

	public TransferPaymentBillw getPaymentBill() {
		return this.paymentBill;
	}
	public void setPaymentBill(TransferPaymentBillw paymentBill) {
		this.paymentBill = paymentBill;
	}

	public String getTransferFromRegion() {
		return this.transferFromRegion;
	}
	public void setTransferFromRegion(String transferFromRegion) {
		this.transferFromRegion = transferFromRegion;
	}

	public String getTransferPurpose() {
		return this.transferPurpose;
	}
	public void setTransferPurpose(String transferPurpose) {
		this.transferPurpose = transferPurpose;
	}

	public String getTransferReference() {
		return this.transferReference;
	}
	public void setTransferReference(String transferReference) {
		this.transferReference = transferReference;
	}

	public String getTransferToRegion() {
		return this.transferToRegion;
	}
	public void setTransferToRegion(String transferToRegion) {
		this.transferToRegion = transferToRegion;
	}

}
