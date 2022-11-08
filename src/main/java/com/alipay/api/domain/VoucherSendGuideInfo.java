package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券发放引导
 *
 * @author auto create
 * @since 1.0, 2022-08-24 16:26:27
 */
public class VoucherSendGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 8184331951341916622L;

	/**
	 * 小程序发放引导
	 */
	@ApiField("mini_app_send_guide_info")
	private VoucherMiniAppSendGuideInfo miniAppSendGuideInfo;

	/**
	 * 发放引导模式
	 */
	@ApiListField("send_guide_mode")
	@ApiField("string")
	private List<String> sendGuideMode;

	public VoucherMiniAppSendGuideInfo getMiniAppSendGuideInfo() {
		return this.miniAppSendGuideInfo;
	}
	public void setMiniAppSendGuideInfo(VoucherMiniAppSendGuideInfo miniAppSendGuideInfo) {
		this.miniAppSendGuideInfo = miniAppSendGuideInfo;
	}

	public List<String> getSendGuideMode() {
		return this.sendGuideMode;
	}
	public void setSendGuideMode(List<String> sendGuideMode) {
		this.sendGuideMode = sendGuideMode;
	}

}
