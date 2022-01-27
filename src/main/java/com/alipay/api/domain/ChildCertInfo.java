package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小宝账户信息
 *
 * @author auto create
 * @since 1.0, 2019-08-08 11:16:03
 */
public class ChildCertInfo extends AlipayObject {

	private static final long serialVersionUID = 3738847796286276826L;

	/**
	 * 儿童业务id
	 */
	@ApiField("child_id")
	private String childId;

	/**
	 * 小宝账户跳转链接
	 */
	@ApiField("url")
	private NextUrl url;

	public String getChildId() {
		return this.childId;
	}
	public void setChildId(String childId) {
		this.childId = childId;
	}

	public NextUrl getUrl() {
		return this.url;
	}
	public void setUrl(NextUrl url) {
		this.url = url;
	}

}
