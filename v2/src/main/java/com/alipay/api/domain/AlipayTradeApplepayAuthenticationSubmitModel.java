package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ApplePay支付鉴权提交
 *
 * @author auto create
 * @since 1.0, 2020-07-15 16:40:53
 */
public class AlipayTradeApplepayAuthenticationSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6236613649527111817L;

	/**
	 * ApplePay核身鉴权结果，包括：支付密码、用户确认、数字签名
	 */
	@ApiListField("authentication_results")
	@ApiField("authentication_result")
	private List<AuthenticationResult> authenticationResults;

	/**
	 * Apple端的设备ID
	 */
	@ApiField("device_identifier")
	private String deviceIdentifier;

	/**
	 * Apple绑定的BundleId
	 */
	@ApiField("dpan_identifier")
	private String dpanIdentifier;

	/**
	 * 交易标识
	 */
	@ApiField("transaction_identifier")
	private String transactionIdentifier;

	public List<AuthenticationResult> getAuthenticationResults() {
		return this.authenticationResults;
	}
	public void setAuthenticationResults(List<AuthenticationResult> authenticationResults) {
		this.authenticationResults = authenticationResults;
	}

	public String getDeviceIdentifier() {
		return this.deviceIdentifier;
	}
	public void setDeviceIdentifier(String deviceIdentifier) {
		this.deviceIdentifier = deviceIdentifier;
	}

	public String getDpanIdentifier() {
		return this.dpanIdentifier;
	}
	public void setDpanIdentifier(String dpanIdentifier) {
		this.dpanIdentifier = dpanIdentifier;
	}

	public String getTransactionIdentifier() {
		return this.transactionIdentifier;
	}
	public void setTransactionIdentifier(String transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}

}
