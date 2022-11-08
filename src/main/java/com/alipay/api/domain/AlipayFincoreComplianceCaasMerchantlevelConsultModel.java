package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合规caas商户等级咨询接口
 *
 * @author auto create
 * @since 1.0, 2022-01-06 20:51:14
 */
public class AlipayFincoreComplianceCaasMerchantlevelConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5691819137247865884L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 调用caas分配的appkey
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 用于调用的管控
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 业务分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 调用caas的事件code
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 企业名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 企业id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 订单笔数
	 */
	@ApiField("order_count")
	private Long orderCount;

	/**
	 * traceid
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 18位统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public Long getOrderCount() {
		return this.orderCount;
	}
	public void setOrderCount(Long orderCount) {
		this.orderCount = orderCount;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
