package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 硬件证书校验初始化
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:19
 */
public class AlipaySecurityProdCertVerifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1368951939275892161L;

	/**
	 * 证书唯一编号
	 */
	@ApiField("cert_sn")
	private String certSn;

	/**
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token为注册时保存的token，传入此token，用于生成服务端校验信息。
	 */
	@ApiField("cert_token")
	private String certToken;

	/**
	 * 已经生成的证书对应的一个唯一id，设备相关的，如果同一不存在设备不存在，则为1，否则在已存的最大keyid基础上进行累加
	 */
	@ApiField("keyid")
	private String keyid;

	/**
	 * 待签名原文数据
	 */
	@ApiField("sign_data")
	private String signData;

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

	public String getSignData() {
		return this.signData;
	}
	public void setSignData(String signData) {
		this.signData = signData;
	}

}
