package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消行业口碑码绑定信息
 *
 * @author auto create
 * @since 1.0, 2017-09-13 10:34:00
 */
public class RetailKbcodeCreateVo extends AlipayObject {

	private static final long serialVersionUID = 8628115559864898198L;

	/**
	 * 指定码图片上显示的名称，建议使用商户名称
	 */
	@ApiField("code_tip")
	private String codeTip;

	/**
	 * 销售员信息（只允许数字和字母），建议使用促销员手机号
	 */
	@ApiField("salesman")
	private String salesman;

	public String getCodeTip() {
		return this.codeTip;
	}
	public void setCodeTip(String codeTip) {
		this.codeTip = codeTip;
	}

	public String getSalesman() {
		return this.salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

}
