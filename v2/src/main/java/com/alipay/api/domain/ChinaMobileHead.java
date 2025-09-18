package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 移动券核销接口入参Head
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:26:06
 */
public class ChinaMobileHead extends AlipayObject {

	private static final long serialVersionUID = 8848549648274513765L;

	/**
	 * 移动标志请求apiId
	 */
	@ApiField("api_id")
	private String apiId;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 移动签名字段sign为支付宝标准字段,改为使用china_mobile_sign传递
	 */
	@ApiField("china_mobile_sign")
	private String chinaMobileSign;

	/**
	 * 版本
	 */
	@ApiField("china_mobile_version")
	private String chinaMobileVersion;

	/**
	 * 请求时间
	 */
	@ApiField("req_time")
	private String reqTime;

	/**
	 * 流水号
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getApiId() {
		return this.apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChinaMobileSign() {
		return this.chinaMobileSign;
	}
	public void setChinaMobileSign(String chinaMobileSign) {
		this.chinaMobileSign = chinaMobileSign;
	}

	public String getChinaMobileVersion() {
		return this.chinaMobileVersion;
	}
	public void setChinaMobileVersion(String chinaMobileVersion) {
		this.chinaMobileVersion = chinaMobileVersion;
	}

	public String getReqTime() {
		return this.reqTime;
	}
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
