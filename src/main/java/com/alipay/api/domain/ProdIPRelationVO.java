package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品参与者关联信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ProdIPRelationVO extends AlipayObject {

	private static final long serialVersionUID = 2815817291347271526L;

	/**
	 * 参与者别名
	 */
	@ApiField("ip_alias_name")
	private String ipAliasName;

	/**
	 * 参与者所属平台
	 */
	@ApiField("ip_belong_platform")
	private String ipBelongPlatform;

	/**
	 * 参与者编码
	 */
	@ApiField("ip_code")
	private String ipCode;

	/**
	 * 参与者名称
	 */
	@ApiField("ip_name")
	private String ipName;

	/**
	 * 参与者子类型
	 */
	@ApiField("ip_sub_type")
	private String ipSubType;

	/**
	 * 参与者类型
	 */
	@ApiField("ip_type")
	private String ipType;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 参与者平台Id
	 */
	@ApiField("role_id")
	private String roleId;

	public String getIpAliasName() {
		return this.ipAliasName;
	}
	public void setIpAliasName(String ipAliasName) {
		this.ipAliasName = ipAliasName;
	}

	public String getIpBelongPlatform() {
		return this.ipBelongPlatform;
	}
	public void setIpBelongPlatform(String ipBelongPlatform) {
		this.ipBelongPlatform = ipBelongPlatform;
	}

	public String getIpCode() {
		return this.ipCode;
	}
	public void setIpCode(String ipCode) {
		this.ipCode = ipCode;
	}

	public String getIpName() {
		return this.ipName;
	}
	public void setIpName(String ipName) {
		this.ipName = ipName;
	}

	public String getIpSubType() {
		return this.ipSubType;
	}
	public void setIpSubType(String ipSubType) {
		this.ipSubType = ipSubType;
	}

	public String getIpType() {
		return this.ipType;
	}
	public void setIpType(String ipType) {
		this.ipType = ipType;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
