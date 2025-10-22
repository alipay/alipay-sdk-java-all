package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信主体信息
 *
 * @author auto create
 * @since 1.0, 2024-10-23 17:07:22
 */
public class TrustEntityInfo extends AlipayObject {

	private static final long serialVersionUID = 2367678671999876472L;

	/**
	 * 主体证件号，企业社会信用编码等
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 主体证件类型，暂时只支持 企业社会信用编码 或 居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 主体名称，可以是企业名称或个人姓名
	 */
	@ApiField("name")
	private String name;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
