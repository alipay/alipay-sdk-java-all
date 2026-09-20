package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.followupimg.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-17 10:37:54
 */
public class AlipayCommerceMedicalHdfFollowupimgCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6238462295856754467L;

	/** 
	 * 图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	/** 
	 * 智能体开通状态false-未开通、true-已开通
	 */
	@ApiField("open_agent_flag")
	private String openAgentFlag;

	/** 
	 * 图片链接
	 */
	@ApiField("qr_image_url")
	private String qrImageUrl;

	/** 
	 * 跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/** 
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

	public void setOpenAgentFlag(String openAgentFlag) {
		this.openAgentFlag = openAgentFlag;
	}
	public String getOpenAgentFlag( ) {
		return this.openAgentFlag;
	}

	public void setQrImageUrl(String qrImageUrl) {
		this.qrImageUrl = qrImageUrl;
	}
	public String getQrImageUrl( ) {
		return this.qrImageUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getSourceType( ) {
		return this.sourceType;
	}

}
