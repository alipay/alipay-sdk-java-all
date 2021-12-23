package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版辅助核销区信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:07
 */
public class TemplateSecondaryOperationDTO extends AlipayObject {

	private static final long serialVersionUID = 7736228553848266363L;

	/**
	 * 是否进行核销。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("need_write_off")
	private Boolean needWriteOff;

	/**
	 * 辅助核销区标题文案，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("title")
	private String title;

	/**
	 * 辅助核销区跳转链接，需要带上http、https、alipays等协议头。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("url")
	private String url;

	public Boolean getNeedWriteOff() {
		return this.needWriteOff;
	}
	public void setNeedWriteOff(Boolean needWriteOff) {
		this.needWriteOff = needWriteOff;
	}

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
