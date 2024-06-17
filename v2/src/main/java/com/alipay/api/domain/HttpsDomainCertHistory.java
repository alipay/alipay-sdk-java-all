package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Https证书历史
 *
 * @author auto create
 * @since 1.0, 2024-06-06 16:19:44
 */
public class HttpsDomainCertHistory extends AlipayObject {

	private static final long serialVersionUID = 5388455263186559615L;

	/**
	 * acme日志
	 */
	@ApiField("acme_log")
	private String acmeLog;

	/**
	 * 证书
	 */
	@ApiField("cert")
	private String cert;

	/**
	 * 证书链
	 */
	@ApiField("fullchain_cert")
	private String fullchainCert;

	/**
	 * 证书
	 */
	@ApiField("key")
	private String key;

	/**
	 * 签署状态
	 */
	@ApiField("status")
	private String status;

	public String getAcmeLog() {
		return this.acmeLog;
	}
	public void setAcmeLog(String acmeLog) {
		this.acmeLog = acmeLog;
	}

	public String getCert() {
		return this.cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
	}

	public String getFullchainCert() {
		return this.fullchainCert;
	}
	public void setFullchainCert(String fullchainCert) {
		this.fullchainCert = fullchainCert;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
