package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试测试支付宝
 *
 * @author auto create
 * @since 1.0, 2022-10-24 16:39:37
 */
public class DatadigitalAnttechQqqCccQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4693923134573438456L;

	/**
	 * dh
	 */
	@ApiField("babab")
	private String babab;

	/**
	 * dgbhr
	 */
	@ApiField("er_1_openid")
	private String er1Openid;

	/**
	 * 和金龟换酒那几个号结构化
	 */
	@ApiField("pppp")
	private String pppp;

	/**
	 * 省份
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * dgbhr
	 */
	@ApiField("re")
	private String re;

	public String getBabab() {
		return this.babab;
	}
	public void setBabab(String babab) {
		this.babab = babab;
	}

	public String getEr1Openid() {
		return this.er1Openid;
	}
	public void setEr1Openid(String er1Openid) {
		this.er1Openid = er1Openid;
	}

	public String getPppp() {
		return this.pppp;
	}
	public void setPppp(String pppp) {
		this.pppp = pppp;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRe() {
		return this.re;
	}
	public void setRe(String re) {
		this.re = re;
	}

}
