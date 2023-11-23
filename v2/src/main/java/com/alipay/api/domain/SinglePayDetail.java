package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小额支付单笔支付
 *
 * @author auto create
 * @since 1.0, 2022-10-13 16:07:11
 */
public class SinglePayDetail extends AlipayObject {

	private static final long serialVersionUID = 1249433153251235194L;

	/**
	 * 支付宝冻结订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 本次支付金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 本次支付url地址
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * 收款方OpenId
	 */
	@ApiField("receive_open_id")
	private String receiveOpenId;

	/**
	 * 收款人的userId
	 */
	@ApiField("receive_user_id")
	private String receiveUserId;

	/**
	 * 本次支付的支付宝流水号
	 */
	@ApiField("transfer_order_no")
	private String transferOrderNo;

	/**
	 * 本次支付的外部单据号
	 */
	@ApiField("transfer_out_order_no")
	private String transferOutOrderNo;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getPayUrl() {
		return this.payUrl;
	}
	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	public String getReceiveOpenId() {
		return this.receiveOpenId;
	}
	public void setReceiveOpenId(String receiveOpenId) {
		this.receiveOpenId = receiveOpenId;
	}

	public String getReceiveUserId() {
		return this.receiveUserId;
	}
	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

	public String getTransferOrderNo() {
		return this.transferOrderNo;
	}
	public void setTransferOrderNo(String transferOrderNo) {
		this.transferOrderNo = transferOrderNo;
	}

	public String getTransferOutOrderNo() {
		return this.transferOutOrderNo;
	}
	public void setTransferOutOrderNo(String transferOutOrderNo) {
		this.transferOutOrderNo = transferOutOrderNo;
	}

}
