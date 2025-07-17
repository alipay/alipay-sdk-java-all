package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云静态站点自定义错误页面的配置
 *
 * @author auto create
 * @since 1.0, 2023-10-10 14:35:49
 */
public class ErrorPageSetting extends AlipayObject {

	private static final long serialVersionUID = 6237824497537441885L;

	/**
	 * 404错误页面在静态站点的文件路径，不能以 / 开头
	 */
	@ApiField("error_page_404")
	private String errorPage404;

	public String getErrorPage404() {
		return this.errorPage404;
	}
	public void setErrorPage404(String errorPage404) {
		this.errorPage404 = errorPage404;
	}

}
