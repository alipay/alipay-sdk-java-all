package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证书解除
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:43:52
 */
public class AlipaySecurityProdCertCsrDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2762691886454247224L;

	/**
	 * 证书唯一编号
	 */
	@ApiField("cert_sn")
	private String certSn;

	/**
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token为注册时保存的token，传入此token，用于生成服务端去注册信息。
	 */
	@ApiField("cert_token")
	private String certToken;

	/**
	 * 已经生成的证书对应的一个唯一id，设备相关的，如果同一不存在设备不存在，则为1，否则在已存的最大keyid基础上进行累加
	 */
	@ApiField("keyid")
	private String keyid;

	public String getCertSn() {
		return this.certSn;
	}
	public void setCertSn(String certSn) {
		this.certSn = certSn;
	}

	public String getCertToken() {
		return this.certToken;
	}
	public void setCertToken(String certToken) {
		this.certToken = certToken;
	}

	public String getKeyid() {
		return this.keyid;
	}
	public void setKeyid(String keyid) {
		this.keyid = keyid;
	}

}
