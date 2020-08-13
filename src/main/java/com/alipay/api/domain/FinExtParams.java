package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 传递给金融网络业务扩展信息
 *
 * @author auto create
 * @since 1.0, 2020-07-14 14:00:17
 */
public class FinExtParams extends AlipayObject {

	private static final long serialVersionUID = 6589793686378966534L;

	/**
	 * 返回的url
	 */
	@ApiField("page_return_url")
	private String pageReturnUrl;

	/**
	 * 超时时间
	 */
	@ApiField("time_expire")
	private String timeExpire;

	public String getPageReturnUrl() {
		return this.pageReturnUrl;
	}
	public void setPageReturnUrl(String pageReturnUrl) {
		this.pageReturnUrl = pageReturnUrl;
	}

	public String getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

}
