package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.chargerbindinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-05 14:46:56
 */
public class AlipayCommerceTransportChargerChargerbindinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7217777915177318795L;

	/** 
	 * 商户同步的充电桩设备编码
	 */
	@ApiField("equip_id")
	private String equipId;

	/** 
	 * 绑定关系结果接收失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 0：成功
1：拒绝
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}
	public String getEquipId( ) {
		return this.equipId;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
