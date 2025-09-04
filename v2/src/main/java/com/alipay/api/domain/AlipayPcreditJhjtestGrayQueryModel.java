package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灰度迭代语法测试
 *
 * @author auto create
 * @since 1.0, 2023-11-24 15:18:20
 */
public class AlipayPcreditJhjtestGrayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5576254275682798365L;

	/**
	 * 11
	 */
	@ApiField("para")
	private String para;

	/**
	 * 1
	 */
	@ApiField("para_comp")
	private Apitestjhj paraComp;

	public String getPara() {
		return this.para;
	}
	public void setPara(String para) {
		this.para = para;
	}

	public Apitestjhj getParaComp() {
		return this.paraComp;
	}
	public void setParaComp(Apitestjhj paraComp) {
		this.paraComp = paraComp;
	}

}
