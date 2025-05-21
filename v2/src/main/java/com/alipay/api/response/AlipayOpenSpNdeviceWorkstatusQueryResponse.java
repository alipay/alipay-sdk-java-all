package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ndevice.workstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-30 11:57:25
 */
public class AlipayOpenSpNdeviceWorkstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3641358287918321498L;

	/** 
	 * 设备绑定状态，true表示当前设备已经绑定，false表示当前设备维未绑定
	 */
	@ApiField("bind_status")
	private Boolean bindStatus;

	/** 
	 * 碰一下设备SN标识
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/** 
	 * 设备类型，主要描述当前碰一下设备类型，如N6E
	 */
	@ApiField("device_type")
	private String deviceType;

	/** 
	 * 支付宝侧门店leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 外部门店编号，门店leads上报时的外部门店编号
	 */
	@ApiField("out_store_id")
	private String outStoreId;

	/** 
	 * 关联设备sn唯一标识
	 */
	@ApiField("related_device_sn")
	private String relatedDeviceSn;

	public void setBindStatus(Boolean bindStatus) {
		this.bindStatus = bindStatus;
	}
	public Boolean getBindStatus( ) {
		return this.bindStatus;
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

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}
	public String getOutStoreId( ) {
		return this.outStoreId;
	}

	public void setRelatedDeviceSn(String relatedDeviceSn) {
		this.relatedDeviceSn = relatedDeviceSn;
	}
	public String getRelatedDeviceSn( ) {
		return this.relatedDeviceSn;
	}

}
