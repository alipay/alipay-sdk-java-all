package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 缴费账单模型
 *
 * @author auto create
 * @since 1.0, 2021-07-28 12:10:09
 */
public class TransferPaymentBill extends AlipayObject {

	private static final long serialVersionUID = 1198266641834489429L;

	/**
	 * 账单用户信息
	 */
	@ApiField("account_owner")
	private TransferUser accountOwner;

	/**
	 * 账单金额信息
	 */
	@ApiField("bill_amount")
	private TransferAmount billAmount;

	/**
	 * 渠道付款参考号
	 */
	@ApiField("channel_payment_ref")
	private String channelPaymentRef;

	/**
	 * 渠道代发日期
	 */
	@ApiField("channel_remit_time")
	private String channelRemitTime;

	/**
	 * 预计汇款到账日期
	 */
	@ApiField("expect_transfer_time")
	private String expectTransferTime;

	/**
	 * 缴费账号
	 */
	@ApiField("payment_account_no")
	private String paymentAccountNo;

	/**
	 * 缴费截止日期
	 */
	@ApiField("payment_expiry_time")
	private String paymentExpiryTime;

	/**
	 * 缴费项列表
	 */
	@ApiListField("payment_items")
	@ApiField("transfer_payment_item")
	private List<TransferPaymentItem> paymentItems;

	/**
	 * 商品参考会
	 */
	@ApiField("reference_goods_id")
	private String referenceGoodsId;

	/**
	 * 代发计算基准日期
	 */
	@ApiField("transfer_base_time")
	private String transferBaseTime;

	public TransferUser getAccountOwner() {
		return this.accountOwner;
	}
	public void setAccountOwner(TransferUser accountOwner) {
		this.accountOwner = accountOwner;
	}

	public TransferAmount getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(TransferAmount billAmount) {
		this.billAmount = billAmount;
	}

	public String getChannelPaymentRef() {
		return this.channelPaymentRef;
	}
	public void setChannelPaymentRef(String channelPaymentRef) {
		this.channelPaymentRef = channelPaymentRef;
	}

	public String getChannelRemitTime() {
		return this.channelRemitTime;
	}
	public void setChannelRemitTime(String channelRemitTime) {
		this.channelRemitTime = channelRemitTime;
	}

	public String getExpectTransferTime() {
		return this.expectTransferTime;
	}
	public void setExpectTransferTime(String expectTransferTime) {
		this.expectTransferTime = expectTransferTime;
	}

	public String getPaymentAccountNo() {
		return this.paymentAccountNo;
	}
	public void setPaymentAccountNo(String paymentAccountNo) {
		this.paymentAccountNo = paymentAccountNo;
	}

	public String getPaymentExpiryTime() {
		return this.paymentExpiryTime;
	}
	public void setPaymentExpiryTime(String paymentExpiryTime) {
		this.paymentExpiryTime = paymentExpiryTime;
	}

	public List<TransferPaymentItem> getPaymentItems() {
		return this.paymentItems;
	}
	public void setPaymentItems(List<TransferPaymentItem> paymentItems) {
		this.paymentItems = paymentItems;
	}

	public String getReferenceGoodsId() {
		return this.referenceGoodsId;
	}
	public void setReferenceGoodsId(String referenceGoodsId) {
		this.referenceGoodsId = referenceGoodsId;
	}

	public String getTransferBaseTime() {
		return this.transferBaseTime;
	}
	public void setTransferBaseTime(String transferBaseTime) {
		this.transferBaseTime = transferBaseTime;
	}

}
