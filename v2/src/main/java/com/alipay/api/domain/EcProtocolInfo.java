package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码合约协议信息
 *
 * @author auto create
 * @since 1.0, 2023-03-15 11:21:28
 */
public class EcProtocolInfo extends AlipayObject {

	private static final long serialVersionUID = 4351118833139175357L;

	/**
	 * 法务协议id编号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 法务协议名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 法务协议链接
	 */
	@ApiField("url")
	private String url;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
