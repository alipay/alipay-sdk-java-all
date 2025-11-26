package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园支付设置
 *
 * @author auto create
 * @since 1.0, 2025-06-16 16:27:19
 */
public class PayConfig extends AlipayObject {

	private static final long serialVersionUID = 8539723724124522732L;

	/**
	 * 银行渠道模式。YES时必传，可选的字段枚举说明：{BANK:指定银行;BANK_CARD:指定银行卡；BIN:指定银行BIN}
	 */
	@ApiField("bank_channel_mode")
	private String bankChannelMode;

	/**
	 * 持卡人姓名
	 */
	@ApiField("card_holder_name")
	private String cardHolderName;

	/**
	 * BANK_CARD时必传银行卡号，BIN时必传银行识别码
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 开通资产角色，只针对银行模式（指定银行，指定银行卡，指定卡bin）；不传默认为 PARENT
	 */
	@ApiField("open_asset_role")
	private String openAssetRole;

	/**
	 * 是否单开户，默认为false。开通家长小荷包时必选
	 */
	@ApiField("open_single_account")
	private Boolean openSingleAccount;

	/**
	 * 使用银行渠道。可选的字段枚举说明：{YES:使用银行渠道;NO:使用支付宝默认扣款顺序}
注意：当指定使用银行渠道时，务必提前联系您的BD配置对应学校的银行
	 */
	@ApiField("use_bank_channel")
	private String useBankChannel;

	public String getBankChannelMode() {
		return this.bankChannelMode;
	}
	public void setBankChannelMode(String bankChannelMode) {
		this.bankChannelMode = bankChannelMode;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getOpenAssetRole() {
		return this.openAssetRole;
	}
	public void setOpenAssetRole(String openAssetRole) {
		this.openAssetRole = openAssetRole;
	}

	public Boolean getOpenSingleAccount() {
		return this.openSingleAccount;
	}
	public void setOpenSingleAccount(Boolean openSingleAccount) {
		this.openSingleAccount = openSingleAccount;
	}

	public String getUseBankChannel() {
		return this.useBankChannel;
	}
	public void setUseBankChannel(String useBankChannel) {
		this.useBankChannel = useBankChannel;
	}

}
