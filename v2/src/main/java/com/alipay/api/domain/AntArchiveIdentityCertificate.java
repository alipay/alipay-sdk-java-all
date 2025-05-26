package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁档案身份证明信息
 *
 * @author auto create
 * @since 1.0, 2019-03-05 10:36:34
 */
public class AntArchiveIdentityCertificate extends AlipayObject {

	private static final long serialVersionUID = 4456755444857123733L;

	/**
	 * 证件名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 蚂蚁档案证件类型

个人类型取值范围：
100 居民身份证
102 护照
105 港澳居民往来内地通行证
106 台湾居民往来内地通行证

企业和组织类型取值范围：
200 统一社会信用代码
201 全国法人营业执照
204 民办非企业登记证书
206 社会团体法人登记证书
218 事业单位法人证书
	 */
	@ApiField("cert_type")
	private String certType;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

}
