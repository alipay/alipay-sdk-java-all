package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权协议
 *
 * @author auto create
 * @since 1.0, 2022-04-20 15:03:28
 */
public class UserAuthAgreement extends AlipayObject {

	private static final long serialVersionUID = 2174938918593316351L;

	/**
	 * 协议名称
	 */
	@ApiField("agreement_name")
	private String agreementName;

	/**
	 * 可下载协议地址
	 */
	@ApiField("download_link")
	private String downloadLink;

	/**
	 * 展示链接地址
	 */
	@ApiField("link")
	private String link;

	public String getAgreementName() {
		return this.agreementName;
	}
	public void setAgreementName(String agreementName) {
		this.agreementName = agreementName;
	}

	public String getDownloadLink() {
		return this.downloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
