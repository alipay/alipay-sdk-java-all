package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * jianhui测试查询接口二
 *
 * @author auto create
 * @since 1.0, 2025-04-23 16:26:11
 */
public class AlipayOpenDataquerytwoJianhuiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7751253227724838395L;

	/**
	 * 复杂类型测试1
	 */
	@ApiField("fzcsone")
	private FDataJianTestOne fzcsone;

	/**
	 * 测试一
	 */
	@ApiField("testone")
	private String testone;

	public FDataJianTestOne getFzcsone() {
		return this.fzcsone;
	}
	public void setFzcsone(FDataJianTestOne fzcsone) {
		this.fzcsone = fzcsone;
	}

	public String getTestone() {
		return this.testone;
	}
	public void setTestone(String testone) {
		this.testone = testone;
	}

}
