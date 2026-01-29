package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-14 16:32:42
 */
public class TrafficshareCrowdUserSync extends AlipayObject {

	private static final long serialVersionUID = 8133565843771259846L;

	/**
	 * 用于标识"增加"操作类型时，该数据是否是增量数据。true:增量数据；false:存量数据
	 */
	@ApiField("add_increment_flag")
	private Boolean addIncrementFlag;

	/**
	 * 设备号
	 */
	@ApiField("device_number")
	private String deviceNumber;

	/**
	 * 同步类型，枚举。目前支持：增加-add；删除-delete。如果是人群用户新增，传入"add"。如果是对已同步新增人群用户做删除，传入"delete"
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 中国大陆有效的11位手机号加密后的密文，必须加密传入。对应的解密方式由商户侧提供给支付宝出行侧，支付宝出行侧进行解密处理。
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public Boolean getAddIncrementFlag() {
		return this.addIncrementFlag;
	}
	public void setAddIncrementFlag(Boolean addIncrementFlag) {
		this.addIncrementFlag = addIncrementFlag;
	}

	public String getDeviceNumber() {
		return this.deviceNumber;
	}
	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
