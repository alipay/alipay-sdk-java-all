package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.cert.install.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdCertInstallConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2774555216715645697L;

	/** 
	 * 证书唯一编号
	 */
	@ApiField("cert_sn")
	private String certSn;

	/** 
	 * ifaf_data:服务端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含服务端的校验数据。
	 */
	@ApiField("ifaf_data")
	private String ifafData;

	/** 
	 * 已经生成的证书对应的一个唯一id，设备相关的，如果同一不存在设备不存在，则为1，否则在已存的最大keyid基础上进行累加
	 */
	@ApiField("keyid")
	private String keyid;

	/** 
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token用于提供给业务方关联校验结果。
	 */
	@ApiField("token")
	private String token;

	public void setCertSn(String certSn) {
		this.certSn = certSn;
	}
	public String getCertSn( ) {
		return this.certSn;
	}

	public void setIfafData(String ifafData) {
		this.ifafData = ifafData;
	}
	public String getIfafData( ) {
		return this.ifafData;
	}

	public void setKeyid(String keyid) {
		this.keyid = keyid;
	}
	public String getKeyid( ) {
		return this.keyid;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
