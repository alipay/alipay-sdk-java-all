package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权码authcode生成
 *
 * @author auto create
 * @since 1.0, 2026-05-27 10:17:50
 */
public class AlipayCommerceMedicalAuthcodeGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 4458845542281388718L;

	/**
	 * 客户系统控制幂等业务单号，由客户系统生成，支付宝侧做接口幂等限制
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 请求接口发生时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 固定枚举值，美世-MEI_SHI
OPPO-OPPO
荣耀-HONOR
小米-XIAOMI
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 客户系统中的用户id,每个用户唯一,由客户系统生成并传入
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 商户APPID
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 用于描述支付宝用户在开放平台下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户手机号，如有，可传
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 支付宝的用户UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
