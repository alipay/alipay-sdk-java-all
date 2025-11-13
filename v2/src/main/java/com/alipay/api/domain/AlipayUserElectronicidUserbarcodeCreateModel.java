package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子身份证生成用户码
 *
 * @author auto create
 * @since 1.0, 2024-01-03 14:40:36
 */
public class AlipayUserElectronicidUserbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8467194272819499183L;

	/**
	 * 机构方根据cert_id查到机构内部用户信息的唯一字符串。比如：身份证号+姓名 AES加密后的值；
	 */
	@ApiField("cert_id")
	private String certId;

	/**
	 * 二维码超时时间，单位秒
	 */
	@ApiField("expire_time")
	private Long expireTime;

	public String getCertId() {
		return this.certId;
	}
	public void setCertId(String certId) {
		this.certId = certId;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

}
