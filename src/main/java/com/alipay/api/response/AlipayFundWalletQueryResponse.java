package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:58
 */
public class AlipayFundWalletQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1242978571513948292L;

	/** 
	 * 李x
	 */
	@ApiField("identity_name")
	private String identityName;

	/** 
	 * 身份证号
	 */
	@ApiField("identity_no")
	private String identityNo;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 用户钱包
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}
	public String getIdentityName( ) {
		return this.identityName;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}
	public String getIdentityNo( ) {
		return this.identityNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

}
