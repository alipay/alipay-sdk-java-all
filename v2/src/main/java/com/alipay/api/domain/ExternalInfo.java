package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部信息列表
 *
 * @author auto create
 * @since 1.0, 2023-12-07 18:01:33
 */
public class ExternalInfo extends AlipayObject {

	private static final long serialVersionUID = 3561164939288758444L;

	/**
	 * 渠道id号
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 扩展信息map的格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部id号
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 外部信息的名称
	 */
	@ApiField("external_name")
	private String externalName;

	/**
	 * 记录id
	 */
	@ApiField("id")
	private String id;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getExternalName() {
		return this.externalName;
	}
	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
