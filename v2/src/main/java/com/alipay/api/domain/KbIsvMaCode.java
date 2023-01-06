package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证发码信息
 *
 * @author auto create
 * @since 1.0, 2018-04-27 22:31:57
 */
public class KbIsvMaCode extends AlipayObject {

	private static final long serialVersionUID = 5797149496791738915L;

	/**
	 * 凭证码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 码的可核销份数
	 */
	@ApiField("num")
	private String num;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getNum() {
		return this.num;
	}
	public void setNum(String num) {
		this.num = num;
	}

}
