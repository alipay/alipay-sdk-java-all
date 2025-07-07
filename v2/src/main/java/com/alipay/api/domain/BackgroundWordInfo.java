package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达底纹词
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:59:03
 */
public class BackgroundWordInfo extends AlipayObject {

	private static final long serialVersionUID = 3242611345547129874L;

	/**
	 * 底纹词
	 */
	@ApiField("background_word")
	private String backgroundWord;

	/**
	 * 审核失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 底纹词状态
	 */
	@ApiField("status")
	private String status;

	public String getBackgroundWord() {
		return this.backgroundWord;
	}
	public void setBackgroundWord(String backgroundWord) {
		this.backgroundWord = backgroundWord;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
