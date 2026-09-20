package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体创建
 *
 * @author auto create
 * @since 1.0, 2026-08-26 21:42:39
 */
public class AlipayTradeAgentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7552837557135511262L;

	/**
	 * 可解析的json字段，用于填写附加的参数
	 */
	@ApiField("attributes")
	private String attributes;

	/**
	 * 智能体载体，取值格式由platform决定。
	 */
	@ApiField("carrier")
	private String carrier;

	/**
	 * 智能体Icon，支持AFTS fileId或HTTPS地址。
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 智能体对外展示名称。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 千问平台侧请求唯一标识，用于创建请求幂等和后续查询。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户支付宝登录账号，用于解析商户PID；千问平台PID由OpenAPI调用上下文恢复。
	 */
	@ApiField("owner_alipay_account")
	private String ownerAlipayAccount;

	/**
	 * 智能体所在端，用于确定carrier的取值格式。
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 智能体简介或副标题，用于KYA展示。
	 */
	@ApiField("sub_name")
	private String subName;

	public String getAttributes() {
		return this.attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getCarrier() {
		return this.carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOwnerAlipayAccount() {
		return this.ownerAlipayAccount;
	}
	public void setOwnerAlipayAccount(String ownerAlipayAccount) {
		this.ownerAlipayAccount = ownerAlipayAccount;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getSubName() {
		return this.subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}

}
