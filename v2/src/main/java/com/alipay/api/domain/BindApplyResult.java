package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备绑定申请结果信息
 *
 * @author auto create
 * @since 1.0, 2025-02-28 15:29:56
 */
public class BindApplyResult extends AlipayObject {

	private static final long serialVersionUID = 2396672186276875715L;

	/**
	 * 设备申请绑定的当前状态（白名单不带卖进方案）
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 本单对应的设备绑定状态
	 */
	@ApiField("device_bind_status")
	private String deviceBindStatus;

	/**
	 * 设备绑定完成时间
	 */
	@ApiField("device_bind_time")
	private Date deviceBindTime;

	/**
	 * 作业失败的时候告知具体失败情况
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 外部唯一单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 如果设备有参与卖进方案，则有
	 */
	@ApiField("sales_participate")
	private DeviceSalesParticipate salesParticipate;

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getDeviceBindStatus() {
		return this.deviceBindStatus;
	}
	public void setDeviceBindStatus(String deviceBindStatus) {
		this.deviceBindStatus = deviceBindStatus;
	}

	public Date getDeviceBindTime() {
		return this.deviceBindTime;
	}
	public void setDeviceBindTime(Date deviceBindTime) {
		this.deviceBindTime = deviceBindTime;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public DeviceSalesParticipate getSalesParticipate() {
		return this.salesParticipate;
	}
	public void setSalesParticipate(DeviceSalesParticipate salesParticipate) {
		this.salesParticipate = salesParticipate;
	}

}
