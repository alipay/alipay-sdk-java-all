package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序生成推广二维码接口
 *
 * @author auto create
 * @since 1.0, 2021-03-23 19:10:24
 */
public class AlipayOpenAppQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2366646742267972857L;

	/**
	 * 对应的二维码描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 小程序的启动参数，打开小程序的query ，在小程序 onLaunch的方法中获取
	 */
	@ApiField("query_param")
	private String queryParam;

	/**
	 * page/component/component-pages/view/view为小程序中能访问到的页面路径
	 */
	@ApiField("url_param")
	private String urlParam;

	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getQueryParam() {
		return this.queryParam;
	}
	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

	public String getUrlParam() {
		return this.urlParam;
	}
	public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}

}
