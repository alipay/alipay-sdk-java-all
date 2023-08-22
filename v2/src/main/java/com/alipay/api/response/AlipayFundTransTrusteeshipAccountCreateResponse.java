package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.trusteeship.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:51:46
 */
public class AlipayFundTransTrusteeshipAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6256953977834566353L;

	/** 
	 * 开通的托管子户账号
	 */
	@ApiField("alipay_account_no")
	private String alipayAccountNo;

	/** 
	 * 开设的支付宝账号open_id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

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

	public void setAlipayAccountNo(String alipayAccountNo) {
		this.alipayAccountNo = alipayAccountNo;
	}
	public String getAlipayAccountNo( ) {
		return this.alipayAccountNo;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}
	public String getAlipayOpenId( ) {
		return this.alipayOpenId;
	}

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
