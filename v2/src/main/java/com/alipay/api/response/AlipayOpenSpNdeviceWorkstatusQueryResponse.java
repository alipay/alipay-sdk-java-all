package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ndevice.workstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 16:47:29
 */
public class AlipayOpenSpNdeviceWorkstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1899592212574899681L;

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
	 * 操作人未脱敏支付宝登记的电话号码 - 绑定场景为作业人员电话号码 - 内部解绑场景为空 - 产品层解绑场景为解绑操作人员电话号码
	 */
	@ApiField("operator_contact_number")
	private String operatorContactNumber;

	/** 
	 * 操作人未脱敏名称 - 绑定场景为作业人员名称 - 内部解绑场景为SYSTEM - 产品层解绑场景为解绑操作人员名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/** 
	 * 外部门店编号，门店leads上报时的外部门店编号
	 */
	@ApiField("out_store_id")
	private String outStoreId;

	/** 
	 * 点位id
	 */
	@ApiField("position_id")
	private String positionId;

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

	public void setOperatorContactNumber(String operatorContactNumber) {
		this.operatorContactNumber = operatorContactNumber;
	}
	public String getOperatorContactNumber( ) {
		return this.operatorContactNumber;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOperatorName( ) {
		return this.operatorName;
	}

	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}
	public String getOutStoreId( ) {
		return this.outStoreId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getPositionId( ) {
		return this.positionId;
	}

	public void setRelatedDeviceSn(String relatedDeviceSn) {
		this.relatedDeviceSn = relatedDeviceSn;
	}
	public String getRelatedDeviceSn( ) {
		return this.relatedDeviceSn;
	}

}
