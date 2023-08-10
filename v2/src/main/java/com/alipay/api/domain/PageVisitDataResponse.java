package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 页面访问数据结果集
 *
 * @author auto create
 * @since 1.0, 2019-06-20 16:57:35
 */
public class PageVisitDataResponse extends AlipayObject {

	private static final long serialVersionUID = 2355242579629328836L;

	/**
	 * 页面的访问次数
	 */
	@ApiField("page_pv")
	private Long pagePv;

	/**
	 * 页面的访问人数
	 */
	@ApiField("page_uv")
	private Long pageUv;

	/**
	 * 小程序的页面地址
	 */
	@ApiField("url")
	private String url;

	public Long getPagePv() {
		return this.pagePv;
	}
	public void setPagePv(Long pagePv) {
		this.pagePv = pagePv;
	}

	public Long getPageUv() {
		return this.pageUv;
	}
	public void setPageUv(Long pageUv) {
		this.pageUv = pageUv;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
