package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay商户授权token获取
 *
 * @author auto create
 * @since 1.0, 2020-05-26 15:16:31
 */
public class AlipayUserApplepayMerchantauthtokenGetModel extends AlipayObject {

	private static final long serialVersionUID = 1473679329353753117L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 支付宝合作伙伴id
	 */
	@ApiField("partner_owned_merchant_identifier")
	private String partnerOwnedMerchantIdentifier;

	/**
	 * 卡id(由固定前缀+32位数字构成)
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	/**
	 * applePay通用请求头
	 */
	@ApiField("request_header")
	private OpenApiAppleRequestHeader requestHeader;

	/**
	 * wagu公交交易完成后通知标识，由wagu指定，并在交易完成后通知wagu时携带此参数
	 */
	@ApiField("transaction_notification_identifier")
	private String transactionNotificationIdentifier;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getPartnerOwnedMerchantIdentifier() {
		return this.partnerOwnedMerchantIdentifier;
	}
	public void setPartnerOwnedMerchantIdentifier(String partnerOwnedMerchantIdentifier) {
		this.partnerOwnedMerchantIdentifier = partnerOwnedMerchantIdentifier;
	}

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

	public OpenApiAppleRequestHeader getRequestHeader() {
		return this.requestHeader;
	}
	public void setRequestHeader(OpenApiAppleRequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}

	public String getTransactionNotificationIdentifier() {
		return this.transactionNotificationIdentifier;
	}
	public void setTransactionNotificationIdentifier(String transactionNotificationIdentifier) {
		this.transactionNotificationIdentifier = transactionNotificationIdentifier;
	}

}
