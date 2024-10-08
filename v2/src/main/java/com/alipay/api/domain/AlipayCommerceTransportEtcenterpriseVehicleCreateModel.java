package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业ETC车辆入驻
 *
 * @author auto create
 * @since 1.0, 2023-12-20 11:12:48
 */
public class AlipayCommerceTransportEtcenterpriseVehicleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2542737195286764575L;

	/**
	 * 经办人证件号
	 */
	@ApiField("agent_cert_no")
	private String agentCertNo;

	/**
	 * 经办人证件类型 101-身份证
	 */
	@ApiField("agent_cert_type")
	private String agentCertType;

	/**
	 * 经办人姓名
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 支付宝企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 企业侧车辆编号
	 */
	@ApiField("corp_vehicle_id")
	private String corpVehicleId;

	/**
	 * ETC办理车辆信息
	 */
	@ApiField("vehicle_info")
	private EtcVehicleInfo vehicleInfo;

	/**
	 * ETC办理车主信息
	 */
	@ApiField("vehicle_owner_info")
	private EtcVehicleOwnerInfo vehicleOwnerInfo;

	public String getAgentCertNo() {
		return this.agentCertNo;
	}
	public void setAgentCertNo(String agentCertNo) {
		this.agentCertNo = agentCertNo;
	}

	public String getAgentCertType() {
		return this.agentCertType;
	}
	public void setAgentCertType(String agentCertType) {
		this.agentCertType = agentCertType;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpVehicleId() {
		return this.corpVehicleId;
	}
	public void setCorpVehicleId(String corpVehicleId) {
		this.corpVehicleId = corpVehicleId;
	}

	public EtcVehicleInfo getVehicleInfo() {
		return this.vehicleInfo;
	}
	public void setVehicleInfo(EtcVehicleInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	public EtcVehicleOwnerInfo getVehicleOwnerInfo() {
		return this.vehicleOwnerInfo;
	}
	public void setVehicleOwnerInfo(EtcVehicleOwnerInfo vehicleOwnerInfo) {
		this.vehicleOwnerInfo = vehicleOwnerInfo;
	}

}
