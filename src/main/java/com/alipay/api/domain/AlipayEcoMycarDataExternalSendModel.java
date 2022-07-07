package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业平台写请求
 *
 * @author auto create
 * @since 1.0, 2020-07-30 15:16:25
 */
public class AlipayEcoMycarDataExternalSendModel extends AlipayObject {

	private static final long serialVersionUID = 8727467836623133962L;

	/**
	 * external_system_name
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/**
	 * is_transfer_uid
	 */
	@ApiField("is_transfer_uid")
	private String isTransferUid;

	/**
	 * operate_type
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * send_data
	 */
	@ApiField("send_data")
	private String sendData;

	public String getExternalSystemName() {
		return this.externalSystemName;
	}
	public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}

	public String getIsTransferUid() {
		return this.isTransferUid;
	}
	public void setIsTransferUid(String isTransferUid) {
		this.isTransferUid = isTransferUid;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getSendData() {
		return this.sendData;
	}
	public void setSendData(String sendData) {
		this.sendData = sendData;
	}

}
