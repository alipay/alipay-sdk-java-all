package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗营销活动事件完成通知接口
 *
 * @author auto create
 * @since 1.0, 2025-10-17 19:34:35
 */
public class AlipayCommerceMedicalPromoEventNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7772479156589331381L;

	/**
	 * 营销返佣服务的事件编码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 营销返佣服务的事件中文名称
	 */
	@ApiField("event_name")
	private String eventName;

	/**
	 * 营销返佣服务完成的时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 营销返佣服务所在医院的名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 营销返佣服务所在医院的统一社会信用编码
	 */
	@ApiField("merchant_uscc")
	private String merchantUscc;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 营销返佣服务的服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantUscc() {
		return this.merchantUscc;
	}
	public void setMerchantUscc(String merchantUscc) {
		this.merchantUscc = merchantUscc;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
