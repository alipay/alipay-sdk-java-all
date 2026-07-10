package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量分销创单接口
 *
 * @author auto create
 * @since 1.0, 2026-06-02 10:10:52
 */
public class AlipayCommerceAcommunicationDistributionFloworderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4667876599555942316L;

	/**
	 * 触达渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 加密后手机号
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 一级投流平台
	 */
	@ApiField("first_channel")
	private String firstChannel;

	/**
	 * 机构订单id
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/**
	 * 分销商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * APP名称
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 应用包名（bundleId）
	 */
	@ApiField("package_route")
	private String packageRoute;

	/**
	 * 支付类型
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 订购价格，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 协议id
	 */
	@ApiField("protocol_sequence_id")
	private String protocolSequenceId;

	/**
	 * 订购页URL
	 */
	@ApiField("proxy_order_url")
	private String proxyOrderUrl;

	/**
	 * sdk凭证
	 */
	@ApiField("sdk_voucher")
	private String sdkVoucher;

	/**
	 * 二级投流平台
	 */
	@ApiField("second_channel")
	private String secondChannel;

	/**
	 * 短信验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	/**
	 * 目标账号
	 */
	@ApiField("target_account")
	private String targetAccount;

	/**
	 * 浏览器用户标识
	 */
	@ApiField("user_agent")
	private String userAgent;

	public String getAccessChannel() {
		return this.accessChannel;
	}
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getEncryptedMobile() {
		return this.encryptedMobile;
	}
	public void setEncryptedMobile(String encryptedMobile) {
		this.encryptedMobile = encryptedMobile;
	}

	public String getFirstChannel() {
		return this.firstChannel;
	}
	public void setFirstChannel(String firstChannel) {
		this.firstChannel = firstChannel;
	}

	public String getInstOrderId() {
		return this.instOrderId;
	}
	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageRoute() {
		return this.packageRoute;
	}
	public void setPackageRoute(String packageRoute) {
		this.packageRoute = packageRoute;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProtocolSequenceId() {
		return this.protocolSequenceId;
	}
	public void setProtocolSequenceId(String protocolSequenceId) {
		this.protocolSequenceId = protocolSequenceId;
	}

	public String getProxyOrderUrl() {
		return this.proxyOrderUrl;
	}
	public void setProxyOrderUrl(String proxyOrderUrl) {
		this.proxyOrderUrl = proxyOrderUrl;
	}

	public String getSdkVoucher() {
		return this.sdkVoucher;
	}
	public void setSdkVoucher(String sdkVoucher) {
		this.sdkVoucher = sdkVoucher;
	}

	public String getSecondChannel() {
		return this.secondChannel;
	}
	public void setSecondChannel(String secondChannel) {
		this.secondChannel = secondChannel;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getTargetAccount() {
		return this.targetAccount;
	}
	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}

	public String getUserAgent() {
		return this.userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

}
