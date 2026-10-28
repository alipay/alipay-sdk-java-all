package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 厂商指定设备生成设备身份凭证
 *
 * @author auto create
 * @since 1.0, 2026-10-21 16:37:54
 */
public class AlipayCommerceMedicalDeviceCredentialGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 4464441988244498196L;

	/**
	 * null
	 */
	@ApiListField("devices")
	@ApiField("device_identity_credential_open_api_device")
	private List<DeviceIdentityCredentialOpenApiDevice> devices;

	/**
	 * 分配的物料ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 厂商编码 当前字段已废弃(内部产品确认不需要这个参数来透传到服务端处理)
	 */
	@ApiField("role_source")
	@Deprecated
	private String roleSource;

	public List<DeviceIdentityCredentialOpenApiDevice> getDevices() {
		return this.devices;
	}
	public void setDevices(List<DeviceIdentityCredentialOpenApiDevice> devices) {
		this.devices = devices;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getRoleSource() {
		return this.roleSource;
	}
	public void setRoleSource(String roleSource) {
		this.roleSource = roleSource;
	}

}
