package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成动态二维码
 *
 * @author auto create
 * @since 1.0, 2024-05-28 14:22:47
 */
public class AlipayOpenAppQrcodeTemporaryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6655756975766838495L;

	/**
	 * 圆形二维码颜色（十六进制颜色色值），仅圆形二维码支持颜色设置，方形二维码默认为黑色。
	 */
	@ApiField("color")
	private String color;

	/**
	 * 生成小程序动态码的类型
	 */
	@ApiField("qrcode_type")
	private String qrcodeType;

	/**
	 * 小程序的启动参数，打开小程序的query ，在小程序 onLaunch的方法中获取。可查看 <a href= "https://opendocs.alipay.com/support/01rb2a">如何获取各种场景的启动参数</a>。
	 */
	@ApiField("query_param")
	private String queryParam;

	/**
	 * 单位秒，最长为24*60*60（一天）
	 */
	@ApiField("timeout")
	private Long timeout;

	/**
	 * page/component/component-pages/view/view为小程序中能访问到的页面路径
	 */
	@ApiField("url_param")
	private String urlParam;

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getQrcodeType() {
		return this.qrcodeType;
	}
	public void setQrcodeType(String qrcodeType) {
		this.qrcodeType = qrcodeType;
	}

	public String getQueryParam() {
		return this.queryParam;
	}
	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

	public Long getTimeout() {
		return this.timeout;
	}
	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	public String getUrlParam() {
		return this.urlParam;
	}
	public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}

}
