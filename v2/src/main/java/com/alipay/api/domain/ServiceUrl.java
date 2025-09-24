package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务载体
 *
 * @author auto create
 * @since 1.0, 2021-01-29 15:17:14
 */
public class ServiceUrl extends AlipayObject {

	private static final long serialVersionUID = 5382635611519668834L;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 链接
示例：
alipays://platformapi/startapp?appId=2018052160106010&chInfo=ch_zhima&query=channelName%3Dmini_ji;（支付宝小程序地址）;
amapuri://applets/platformapi/startapp?appId=2019021863152020&&page=pages/home2311;(高德小程序地址);
uclink://www.uc.cn/cc77796ca7c25dff9607d31b29effc07?action=tinyapp&appid=2017071307737205&page=pages/home/test;(UC小程序地址);
qklink://www.quark.cn/b20b84fd735a8dd3f7541129bacc4e9a?action=tinyapp&appId=2017071307737205&page=pages/home/test;(夸克小程序地址)
	 */
	@ApiField("url")
	private String url;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
