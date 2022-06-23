package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天猫机具解绑接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:15
 */
public class AlipayOfflineProviderEquipmentAuthRemoveModel extends AlipayObject {

	private static final long serialVersionUID = 6242179483814763715L;

	/**
	 * 机具编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 机具类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 扩展信息，传json格式的字符串，包含auth_alipay_card_no =授权的商户支付宝卡号
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 机具厂商PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作人名称
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作人ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

}
