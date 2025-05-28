package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单媒体资源信息
 *
 * @author auto create
 * @since 1.0, 2024-07-22 10:21:35
 */
public class OrderMediaInfo extends AlipayObject {

	private static final long serialVersionUID = 1177652112432864891L;

	/**
	 * 资源封面地址
	 */
	@ApiField("poster_url")
	private String posterUrl;

	/**
	 * 资源类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 资源访问链接地址
	 */
	@ApiField("url")
	private String url;

	public String getPosterUrl() {
		return this.posterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

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
