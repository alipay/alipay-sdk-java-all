package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包订单信息查询
 *
 * @author auto create
 * @since 1.0, 2024-04-15 11:32:35
 */
public class AlipayCloudFundWalletOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3845835867116972945L;

	/**
	 * 单据号，支持充值、充退和提现的单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务类型【枚举值】
核销: PAYMENT
DEPOSIT — 充值；
DEPOSIT_BACK — 退款；
WITHDRAW — 提现；
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
