package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备公钥密钥查询服务
 *
 * @author auto create
 * @since 1.0, 2022-07-18 14:42:00
 */
public class AlipaySecurityProdIfaaDevicepubkeyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4681893281442685711L;

	/**
	 * 用于协商ECDH的publickey，base6编码
	 */
	@ApiField("ecdh_publickey")
	private String ecdhPublickey;

	/**
	 * 已返回记录的最大ID，初次请求输入0
	 */
	@ApiField("max_id")
	private String maxId;

	/**
	 * 安全设备的ID。
	 */
	@ApiField("security_device_id")
	private String securityDeviceId;

	/**
	 * 安全设备类型，SGX或者加密机
	 */
	@ApiField("security_schema")
	private String securitySchema;

	public String getEcdhPublickey() {
		return this.ecdhPublickey;
	}
	public void setEcdhPublickey(String ecdhPublickey) {
		this.ecdhPublickey = ecdhPublickey;
	}

	public String getMaxId() {
		return this.maxId;
	}
	public void setMaxId(String maxId) {
		this.maxId = maxId;
	}

	public String getSecurityDeviceId() {
		return this.securityDeviceId;
	}
	public void setSecurityDeviceId(String securityDeviceId) {
		this.securityDeviceId = securityDeviceId;
	}

	public String getSecuritySchema() {
		return this.securitySchema;
	}
	public void setSecuritySchema(String securitySchema) {
		this.securitySchema = securitySchema;
	}

}
