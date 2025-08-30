package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团长机构签约二维码获取
 *
 * @author auto create
 * @since 1.0, 2023-12-05 11:23:26
 */
public class AlipayCommerceCommonRelationcodeReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1759383654655383269L;

	/**
	 * alipay开头的scheme，团长机构设定的支心客关系绑定页面
	 */
	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
