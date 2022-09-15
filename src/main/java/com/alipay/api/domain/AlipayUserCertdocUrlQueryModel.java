package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员电子证件链接查询
 *
 * @author auto create
 * @since 1.0, 2020-05-07 10:09:02
 */
public class AlipayUserCertdocUrlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5539691325849776358L;

	/**
	 * 业务类型。向支付宝证件夹PD申请。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 证件类型。支持传泛电子证件类型，或某地方具体的电子证件类型。传电子证件类型包括：E_IDENTITY_CARD 代表电子身份证。
	 */
	@ApiField("cert_doc_type")
	private String certDocType;

	/**
	 * 中文城市名字。当url_type为SHOW时，cert_doc_type为泛电子证件类型时，必传。
	 */
	@ApiField("city")
	private String city;

	/**
	 * 链接类型。目前支持：SHOW 代表证件卡面页.
	 */
	@ApiField("url_type")
	private String urlType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCertDocType() {
		return this.certDocType;
	}
	public void setCertDocType(String certDocType) {
		this.certDocType = certDocType;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getUrlType() {
		return this.urlType;
	}
	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

}
