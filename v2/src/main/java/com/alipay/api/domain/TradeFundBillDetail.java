package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易单明细
 *
 * @author auto create
 * @since 1.0, 2022-12-01 16:25:50
 */
public class TradeFundBillDetail extends AlipayObject {

	private static final long serialVersionUID = 1893789561911362181L;

	/**
	 * 交易金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产类型编码
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 资产的属主
	 */
	@ApiField("asset_user_id")
	private String assetUserId;

	/**
	 * 资产的属主openid
	 */
	@ApiField("asset_user_open_id")
	private String assetUserOpenId;

	/**
	 * 支付业务类型

PAY-支付

REFUND-退款
	 */
	@ApiField("biz_pay_type")
	private String bizPayType;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 支付单据号
	 */
	@ApiField("payment_no")
	private String paymentNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getAssetUserId() {
		return this.assetUserId;
	}
	public void setAssetUserId(String assetUserId) {
		this.assetUserId = assetUserId;
	}

	public String getAssetUserOpenId() {
		return this.assetUserOpenId;
	}
	public void setAssetUserOpenId(String assetUserOpenId) {
		this.assetUserOpenId = assetUserOpenId;
	}

	public String getBizPayType() {
		return this.bizPayType;
	}
	public void setBizPayType(String bizPayType) {
		this.bizPayType = bizPayType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPaymentNo() {
		return this.paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

}
