package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ndevice.work.bind response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-30 12:02:27
 */
public class AlipayOpenSpNdeviceWorkBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3412685942789515476L;

	/** 
	 * 设备作业绑定结果,false失败可重试
	 */
	@ApiField("bind_result")
	private Boolean bindResult;

	/** 
	 * 碰一下设备SN标识
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/** 
	 * 设备类型，主要描述当前碰一下设备类型，如N6
	 */
	@ApiField("device_type")
	private String deviceType;

	/** 
	 * 外部业务主键ID，用来保证绑定操作重试操作下幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public void setBindResult(Boolean bindResult) {
		this.bindResult = bindResult;
	}
	public Boolean getBindResult( ) {
		return this.bindResult;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	public String getDeviceSn( ) {
		return this.deviceSn;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceType( ) {
		return this.deviceType;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

}
