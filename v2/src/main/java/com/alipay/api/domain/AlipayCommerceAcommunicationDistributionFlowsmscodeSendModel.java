package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量分销发送验证码
 *
 * @author auto create
 * @since 1.0, 2026-07-15 17:14:08
 */
public class AlipayCommerceAcommunicationDistributionFlowsmscodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 8455621632198964333L;

	/**
	 * 触达渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 一级投流平台
	 */
	@ApiField("first_channel")
	private String firstChannel;

	/**
	 * 分销商订单号
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

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
	 * 订购页URL
	 */
	@ApiField("proxy_order_url")
	private String proxyOrderUrl;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

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

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
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

	public String getProxyOrderUrl() {
		return this.proxyOrderUrl;
	}
	public void setProxyOrderUrl(String proxyOrderUrl) {
		this.proxyOrderUrl = proxyOrderUrl;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getUserAgent() {
		return this.userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

}
