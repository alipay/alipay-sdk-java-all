package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号绑定
 *
 * @author auto create
 * @since 1.0, 2024-05-08 16:20:52
 */
public class AlipayCloudCloudbaseExternalaccountBindInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 8326998894254637311L;

	/**
	 * 服务商账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 服务商用户账号名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 钱包ID
	 */
	@ApiField("wallet_id")
	private String walletId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
