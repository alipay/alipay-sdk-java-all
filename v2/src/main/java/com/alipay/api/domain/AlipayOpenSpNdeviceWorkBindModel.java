package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N设备作业绑定操作
 *
 * @author auto create
 * @since 1.0, 2025-04-30 11:35:55
 */
public class AlipayOpenSpNdeviceWorkBindModel extends AlipayObject {

	private static final long serialVersionUID = 4678654646372151384L;

	/**
	 * 碰一下设备SN标识
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 备类型，主要描述当前碰一下设备类型，如N6E
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备作业记录附件
	 */
	@ApiListField("device_work_attachment")
	@ApiField("n_device_work_attach")
	private List<NDeviceWorkAttach> deviceWorkAttachment;

	/**
	 * 设备作业位置信息
	 */
	@ApiField("device_work_position")
	private NDeviceWorkPosition deviceWorkPosition;

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

	public List<NDeviceWorkAttach> getDeviceWorkAttachment() {
		return this.deviceWorkAttachment;
	}
	public void setDeviceWorkAttachment(List<NDeviceWorkAttach> deviceWorkAttachment) {
		this.deviceWorkAttachment = deviceWorkAttachment;
	}

	public NDeviceWorkPosition getDeviceWorkPosition() {
		return this.deviceWorkPosition;
	}
	public void setDeviceWorkPosition(NDeviceWorkPosition deviceWorkPosition) {
		this.deviceWorkPosition = deviceWorkPosition;
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
