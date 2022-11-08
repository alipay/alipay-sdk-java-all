package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试接口中文名
 *
 * @author auto create
 * @since 1.0, 2022-08-16 17:26:27
 */
public class AlipayMarketingToolXuanyitestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7756729993461741844L;

	/**
	 * 测试测试测试
	 */
	@ApiField("ssss")
	private String ssss;

	/**
	 * sss
	 */
	@ApiField("xxx")
	private String xxx;

	public String getSsss() {
		return this.ssss;
	}
	public void setSsss(String ssss) {
		this.ssss = ssss;
	}

	public String getXxx() {
		return this.xxx;
	}
	public void setXxx(String xxx) {
		this.xxx = xxx;
	}

}
