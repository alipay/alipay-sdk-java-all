package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.wallet.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-19 10:41:43
 */
public class AntMerchantMemberwalletWalletQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7681322488785655956L;

	/** 
	 * 是否已开户
	 */
	@ApiField("open")
	private Boolean open;

	/** 
	 * 会员钱包开户时间
	 */
	@ApiField("open_time")
	private Date openTime;

	/** 
	 * 会员钱包开户url
	 */
	@ApiField("open_url")
	private String openUrl;

	/** 
	 * 会员钱包账户ID
	 */
	@ApiField("wallet_id")
	private String walletId;

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public Date getOpenTime( ) {
		return this.openTime;
	}

	public void setOpenUrl(String openUrl) {
		this.openUrl = openUrl;
	}
	public String getOpenUrl( ) {
		return this.openUrl;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getWalletId( ) {
		return this.walletId;
	}

}
