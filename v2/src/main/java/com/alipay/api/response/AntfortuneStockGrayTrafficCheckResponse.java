package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.gray.traffic.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-24 11:07:54
 */
public class AntfortuneStockGrayTrafficCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5347493598499237764L;

	/** 
	 * 是否通过校验（发布前未配灰度流量=true）
	 */
	@ApiField("check_passed")
	private Boolean checkPassed;

	/** 
	 * 命中说明单条字符串（提供方组装好场景/模式/配置摘要，多点命中分号分隔），未命中或校验失败时为空
	 */
	@ApiField("hit_message")
	private String hitMessage;

	public void setCheckPassed(Boolean checkPassed) {
		this.checkPassed = checkPassed;
	}
	public Boolean getCheckPassed( ) {
		return this.checkPassed;
	}

	public void setHitMessage(String hitMessage) {
		this.hitMessage = hitMessage;
	}
	public String getHitMessage( ) {
		return this.hitMessage;
	}

}
