package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版主体数据区块更多信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 15:17:13
 */
public class TemplateEInfoMoreDTO extends AlipayObject {

	private static final long serialVersionUID = 4279159371954837845L;

	/**
	 * 标题文案，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("title")
	private String title;

	/**
	 * 跳转链接，需要带上http、https、alipays等协议头，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("url")
	private String url;

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
