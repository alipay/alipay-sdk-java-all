package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试文档更新
 *
 * @author auto create
 * @since 1.0, 2019-08-21 16:15:20
 */
public class AlipayOpenAppDfsfasDeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5889943916294256318L;

	/**
	 * 1
	 */
	@ApiField("desd")
	private String desd;

	public String getDesd() {
		return this.desd;
	}
	public void setDesd(String desd) {
		this.desd = desd;
	}

}
