package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序生成推广二维码接口
 *
 * @author auto create
 * @since 1.0, 2025-05-23 15:48:05
 */
public class AlipayOpenAppQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1884637534129764195L;

	/**
	 * 圆形二维码颜色（十六进制颜色色值），仅圆形二维码支持颜色设置，方形二维码默认为黑色。
	 */
	@ApiField("color")
	private String color;

	/**
	 * 对应的二维码描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 小程序启动参数，内容按照格式为参数名=参数值&参数名=参数值。打开小程序的query ，在小程序 onLaunch的方法中获取。可查看 <a href="https://opendocs.alipay.com/support/01rb2a">如何获取各种场景的启动参数</a>。
	 */
	@ApiField("query_param")
	private String queryParam;

	/**
	 * 合成后图片的大小规格，有s、m、l三档可选。
	 */
	@ApiField("size")
	private String size;

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

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getUrlParam() {
		return this.urlParam;
	}
	public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}

}
