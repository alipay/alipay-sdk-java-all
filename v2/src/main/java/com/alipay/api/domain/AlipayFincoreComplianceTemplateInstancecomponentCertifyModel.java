package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实例组件认证
 *
 * @author auto create
 * @since 1.0, 2024-05-13 15:00:04
 */
public class AlipayFincoreComplianceTemplateInstancecomponentCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5184474386418153359L;

	/**
	 * 组件编码
	 */
	@ApiField("component_code")
	private String componentCode;

	/**
	 * 域账号名称
	 */
	@ApiField("domain_name")
	private String domainName;

	/**
	 * 昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 业务系统分配的密令，找系统owner获取
	 */
	@ApiField("secret")
	private String secret;

	/**
	 * 来源系统id
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getComponentCode() {
		return this.componentCode;
	}
	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSecret() {
		return this.secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
