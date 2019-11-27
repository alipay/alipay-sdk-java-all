package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证书安装
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:13
 */
public class AlipaySecurityProdCertInstallConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8138866826337718363L;

	/**
	 * 证书签名内容
	 */
	@ApiField("cert_context")
	private String certContext;

	/**
	 * 证书唯一编号
	 */
	@ApiField("cert_sn")
	private String certSn;

	/**
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token用于提供给业务方关联校验结果。
	 */
	@ApiField("cert_token")
	private String certToken;

	/**
	 * 已经生成的证书对应的一个唯一id，设备相关的，如果同一不存在设备不存在，则为1，否则在已存的最大keyid基础上进行累加
	 */
	@ApiField("keyid")
	private String keyid;

	/**
	 * 随机生成的biz_no,关联服务端与ta里一次指令的唯一业务ID
	 */
	@ApiField("refcode")
	private String refcode;

	public String getCertContext() {
		return this.certContext;
	}
	public void setCertContext(String certContext) {
		this.certContext = certContext;
	}

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

	public String getRefcode() {
		return this.refcode;
	}
	public void setRefcode(String refcode) {
		this.refcode = refcode;
	}

}
