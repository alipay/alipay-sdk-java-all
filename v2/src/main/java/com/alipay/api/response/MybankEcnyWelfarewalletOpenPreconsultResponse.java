package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.welfarewallet.open.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-23 11:27:46
 */
public class MybankEcnyWelfarewalletOpenPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5683114242153934733L;

	/** 
	 * 预咨询通过返回true，反之false
	 */
	@ApiField("allow_show")
	private Boolean allowShow;

	/** 
	 * 用于判断预咨询的情形：母子钱包都未开立，母钱包已开立子钱包未开立，以及预咨询未通过时子钱包已开立
	 */
	@ApiField("has_wallet")
	private Boolean hasWallet;

	/** 
	 * 跳转到数币阵地开户的链接
	 */
	@ApiField("open_wallet_url")
	private String openWalletUrl;

	/** 
	 * 预咨询不通过结果
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	public void setAllowShow(Boolean allowShow) {
		this.allowShow = allowShow;
	}
	public Boolean getAllowShow( ) {
		return this.allowShow;
	}

	public void setHasWallet(Boolean hasWallet) {
		this.hasWallet = hasWallet;
	}
	public Boolean getHasWallet( ) {
		return this.hasWallet;
	}

	public void setOpenWalletUrl(String openWalletUrl) {
		this.openWalletUrl = openWalletUrl;
	}
	public String getOpenWalletUrl( ) {
		return this.openWalletUrl;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getRefuseReason( ) {
		return this.refuseReason;
	}

}
