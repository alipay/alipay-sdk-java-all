package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-21 19:37:45
 */
public class RentEcSignerDTO extends AlipayObject {

	private static final long serialVersionUID = 8318796519721712667L;

	/**
	 * 用户身份证号或者统一社会信用代码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户姓名或企业名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 签署方类型
	 */
	@ApiField("type")
	private String type;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
