package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序内容风险检测服务
 *
 * @author auto create
 * @since 1.0, 2023-10-30 11:52:35
 */
public class AlipaySecurityRiskContentDetectModel extends AlipayObject {

	private static final long serialVersionUID = 7783338768595191168L;

	/**
	 * 需要识别的文本。
注意：
* 请勿传入包含特殊字符及双引号等，可能引起 json 格式化错误问题的字符。
* 目前暂仅针对国家涉政风险文案进行拦截，拦截规则将逐步升级。
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
