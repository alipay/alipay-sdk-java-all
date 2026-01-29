package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取投保链接
 *
 * @author auto create
 * @since 1.0, 2025-11-17 11:11:55
 */
public class AlipayInsSceneInsureLinkAuthModel extends AlipayObject {

	private static final long serialVersionUID = 5252546181473214157L;

	/**
	 * 设备激活时间
	 */
	@ApiField("device_activation_time")
	private Date deviceActivationTime;

	/**
	 * 设备SN码
	 */
	@ApiField("device_serial_number")
	private String deviceSerialNumber;

	/**
	 * 设备型号
	 */
	@ApiField("equipment_model")
	private String equipmentModel;

	/**
	 * 登录用户id
	 */
	@ApiField("login_user_id")
	private String loginUserId;

	/**
	 * session过期时间（s）
	 */
	@ApiField("out_session_expiration")
	private Date outSessionExpiration;

	/**
	 * session_id
	 */
	@ApiField("out_session_id")
	private String outSessionId;

	/**
	 * 合作商编码
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 保险产品编码
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 客户端渠道
	 */
	@ApiField("user_client")
	private String userClient;

	public Date getDeviceActivationTime() {
		return this.deviceActivationTime;
	}
	public void setDeviceActivationTime(Date deviceActivationTime) {
		this.deviceActivationTime = deviceActivationTime;
	}

	public String getDeviceSerialNumber() {
		return this.deviceSerialNumber;
	}
	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}

	public String getEquipmentModel() {
		return this.equipmentModel;
	}
	public void setEquipmentModel(String equipmentModel) {
		this.equipmentModel = equipmentModel;
	}

	public String getLoginUserId() {
		return this.loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public Date getOutSessionExpiration() {
		return this.outSessionExpiration;
	}
	public void setOutSessionExpiration(Date outSessionExpiration) {
		this.outSessionExpiration = outSessionExpiration;
	}

	public String getOutSessionId() {
		return this.outSessionId;
	}
	public void setOutSessionId(String outSessionId) {
		this.outSessionId = outSessionId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
