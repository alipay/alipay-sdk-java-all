package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包单据查询
 *
 * @author auto create
 * @since 1.0, 2024-07-31 10:21:45
 */
public class AlipayFundWalletOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4114116484999615142L;

	/**
	 * 单据号
支持充值、充退和提现的单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 查询单据类型：
 DEPOSIT  — 充值；
 DEPOSIT_BACK — 退款；
 WITHDRAW — 提现；
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户钱包Id
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

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
