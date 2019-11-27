package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AlipayDataStructureTestTestTest extends AlipayObject {

	private static final long serialVersionUID = 7375156165412149498L;

	/**
	 * 222
	 */
	@ApiField("acc")
	private String acc;

	/**
	 * asd
	 */
	@ApiField("testte")
	private AccountRecord testte;

	public String getAcc() {
		return this.acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}

	public AccountRecord getTestte() {
		return this.testte;
	}
	public void setTestte(AccountRecord testte) {
		this.testte = testte;
	}

}
