package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 徐伟波测试用
 *
 * @author auto create
 * @since 1.0, 2018-08-09 19:45:02
 */
public class AlipaySecurityProdXwbtestprodQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2472248837681851812L;

	/**
	 * Stop
	 */
	@ApiField("in_a")
	private String inA;

	/**
	 * 省份编码，国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * wert
	 */
	@ApiField("qwe_dfgfd")
	private String qweDfgfd;

	public String getInA() {
		return this.inA;
	}
	public void setInA(String inA) {
		this.inA = inA;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getQweDfgfd() {
		return this.qweDfgfd;
	}
	public void setQweDfgfd(String qweDfgfd) {
		this.qweDfgfd = qweDfgfd;
	}

}
