package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.open.app.hmcode.create
 *
 * @author auto create
 * @since 1.0, 2021-07-22 15:38:11
 */
public class AlipayOpenMiniHmcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3699733769318315868L;

	/**
	 * 对应的异形码描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 异形码背景色（点阵颜色），ARGB格式，如#00FFFFFF，以#开头的8位16进制数，前两位是透明度，00-FF，后面6位是RGB颜色取值000000-FFFFFF
	 */
	@ApiField("hm_bg_color")
	private String hmBgColor;

	/**
	 * 异形码前景色（点阵颜色），ARGB格式，如#00FFFFFF，以#开头的8位16进制数，前两位是透明度，00-FF，后面6位是RGB颜色取值000000-FFFFFF
	 */
	@ApiField("hm_front_color")
	private String hmFrontColor;

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

	public String getHmBgColor() {
		return this.hmBgColor;
	}
	public void setHmBgColor(String hmBgColor) {
		this.hmBgColor = hmBgColor;
	}

	public String getHmFrontColor() {
		return this.hmFrontColor;
	}
	public void setHmFrontColor(String hmFrontColor) {
		this.hmFrontColor = hmFrontColor;
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
