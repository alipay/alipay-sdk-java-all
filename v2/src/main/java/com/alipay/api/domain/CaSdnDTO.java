package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ca单位
 *
 * @author auto create
 * @since 1.0, 2024-08-14 18:14:56
 */
public class CaSdnDTO extends AlipayObject {

	private static final long serialVersionUID = 1395163718551295248L;

	/**
	 * 所在国家 (Country) 简称：C 字段，只能是国家字母缩写，如中国：CN。由于简称方式不定，不可枚举
	 */
	@ApiField("c")
	private String c;

	/**
	 * 公用名称 (Common Name) 简称：CN 字段，对于 SSL 证书，一般为网站域名；而对于代码签名证书则为申请单位名称；而对于客户端证书则为证书申请者的姓名
	 */
	@ApiField("cn")
	private String cn;

	/**
	 * 单位名称 (Organization Name) ：简称：O 字段，对于 SSL 证书，一般为网站域名；而对于代码签名证书则为申请单位名称；而对于客户端单位证书则为证书申请者所在单位名称；
	 */
	@ApiField("o")
	private String o;

	/**
	 * 显示其他内容 简称：OU 字段
	 */
	@ApiField("ou")
	private String ou;

	/**
	 * 电话号码：Phone 字段，格式要求 + 国家区号 城市区号 电话号码，如： +86 732 88888888
	 */
	@ApiField("telephone_number")
	private String telephoneNumber;

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public String getCn() {
		return this.cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getO() {
		return this.o;
	}
	public void setO(String o) {
		this.o = o;
	}

	public String getOu() {
		return this.ou;
	}
	public void setOu(String ou) {
		this.ou = ou;
	}

	public String getTelephoneNumber() {
		return this.telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

}
