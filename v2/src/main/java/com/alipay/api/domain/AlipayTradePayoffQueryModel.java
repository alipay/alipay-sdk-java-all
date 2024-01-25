package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 迭代测试接口
 *
 * @author auto create
 * @since 1.0, 2023-11-29 17:46:32
 */
public class AlipayTradePayoffQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3611972277133423644L;

	/**
	 * bbb
	 */
	@ApiField("bbb")
	private String bbb;

	/**
	 * ccc
	 */
	@ApiField("ccc")
	private String ccc;

	public String getBbb() {
		return this.bbb;
	}
	public void setBbb(String bbb) {
		this.bbb = bbb;
	}

	public String getCcc() {
		return this.ccc;
	}
	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

}
