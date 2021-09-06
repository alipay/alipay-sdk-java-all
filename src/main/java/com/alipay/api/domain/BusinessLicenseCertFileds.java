package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:30:36
 */
public class BusinessLicenseCertFileds extends AlipayObject {

	private static final long serialVersionUID = 5333385389143144145L;

	/**
	 * 社会信用代码
	 */
	@ApiField("creditcode")
	private String creditcode;

	/**
	 * 公司名字
	 */
	@ApiField("entname")
	private String entname;

	public String getCreditcode() {
		return this.creditcode;
	}
	public void setCreditcode(String creditcode) {
		this.creditcode = creditcode;
	}

	public String getEntname() {
		return this.entname;
	}
	public void setEntname(String entname) {
		this.entname = entname;
	}

}
