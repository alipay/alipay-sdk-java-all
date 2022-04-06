package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分享代付申请
 *
 * @author auto create
 * @since 1.0, 2021-12-03 15:19:54
 */
public class AlipayPayPaysharingprodSharepeerpayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3587235343785994959L;

	/**
	 * 支付宝userId，表示代付订单申请人
	 */
	@ApiField("alipay_applyer_id")
	private String alipayApplyerId;

	/**
	 * 支付宝交易单号，合并支付订单号用;分隔
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 如果没有传入alipay_user_id，该external_user_token需要传入用于申请人用户发现
	 */
	@ApiField("external_user_token")
	private String externalUserToken;

	/**
	 * 分享代付安全参数信息
	 */
	@ApiField("security_info")
	private SharePeerPaySecurityInfo securityInfo;

	public String getAlipayApplyerId() {
		return this.alipayApplyerId;
	}
	public void setAlipayApplyerId(String alipayApplyerId) {
		this.alipayApplyerId = alipayApplyerId;
	}

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getExternalUserToken() {
		return this.externalUserToken;
	}
	public void setExternalUserToken(String externalUserToken) {
		this.externalUserToken = externalUserToken;
	}

	public SharePeerPaySecurityInfo getSecurityInfo() {
		return this.securityInfo;
	}
	public void setSecurityInfo(SharePeerPaySecurityInfo securityInfo) {
		this.securityInfo = securityInfo;
	}

}
