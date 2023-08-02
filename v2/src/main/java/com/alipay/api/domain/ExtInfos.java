package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2019-11-26 18:03:34
 */
public class ExtInfos extends AlipayObject {

	private static final long serialVersionUID = 5422868132934941172L;

	/**
	 * 唤起鉴权的页面类型；DETAIL表示商详页
	 */
	@ApiField("req_from_page")
	private String reqFromPage;

	public String getReqFromPage() {
		return this.reqFromPage;
	}
	public void setReqFromPage(String reqFromPage) {
		this.reqFromPage = reqFromPage;
	}

}
