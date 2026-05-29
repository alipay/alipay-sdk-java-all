package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询绑定钱包
 *
 * @author auto create
 * @since 1.0, 2026-05-13 13:54:49
 */
public class MybankEcnyWalletBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8565843265578475239L;

	/**
	 * 绑定场景
	 */
	@ApiField("bind_scene")
	private String bindScene;

	/**
	 * 用户证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户在平台的角色
	 */
	@ApiField("role_type")
	private String roleType;

	public String getBindScene() {
		return this.bindScene;
	}
	public void setBindScene(String bindScene) {
		this.bindScene = bindScene;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
