package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户绑定接口
 *
 * @author auto create
 * @since 1.0, 2025-03-31 09:33:05
 */
public class AlipayCommerceMedicalMedagentUserBindModel extends AlipayObject {

	private static final long serialVersionUID = 6516818459431991996L;

	/**
	 * 海心内部userId
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 蚂蚁侧医生id，线下提供映射即可。假设一个人绑定了3个医生则需要调用三次
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型：bind-绑定，unbind-解绑,deactivate-注销
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
