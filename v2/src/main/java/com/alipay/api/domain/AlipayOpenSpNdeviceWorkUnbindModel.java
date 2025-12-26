package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备作业解绑操作
 *
 * @author auto create
 * @since 1.0, 2025-04-30 11:35:23
 */
public class AlipayOpenSpNdeviceWorkUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 6238887272863942414L;

	/**
	 * 碰一下设备sn标识
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备类型，主要描述当前碰一下设备类型，如N6E
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务主键ID，用来保证绑定操作重试操作下幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 关联设备sn唯一标识
	 */
	@ApiField("related_device_sn")
	private String relatedDeviceSn;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getRelatedDeviceSn() {
		return this.relatedDeviceSn;
	}
	public void setRelatedDeviceSn(String relatedDeviceSn) {
		this.relatedDeviceSn = relatedDeviceSn;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
