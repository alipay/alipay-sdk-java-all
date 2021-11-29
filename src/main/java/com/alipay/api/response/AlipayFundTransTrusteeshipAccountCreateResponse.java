package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.trusteeship.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-02 10:31:47
 */
public class AlipayFundTransTrusteeshipAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7411461545781978129L;

	/** 
	 * 开设的支付宝账号user_id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 场景余额模式外标卡信息
	 */
	@ApiField("ext_card_info")
	private ExtCardInfo extCardInfo;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setExtCardInfo(ExtCardInfo extCardInfo) {
		this.extCardInfo = extCardInfo;
	}
	public ExtCardInfo getExtCardInfo( ) {
		return this.extCardInfo;
	}

}
