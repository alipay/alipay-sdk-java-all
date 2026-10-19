package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 事实核查服务
 *
 * @author auto create
 * @since 1.0, 2026-10-12 20:52:56
 */
public class GrandsecurityBizrisksFactCheckModel extends AlipayObject {

	private static final long serialVersionUID = 2363624488764295741L;

	/**
	 * 用户输入的谣言/疑问文本，必填，最大 5000 字符
	 */
	@ApiField("query")
	private String query;

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
