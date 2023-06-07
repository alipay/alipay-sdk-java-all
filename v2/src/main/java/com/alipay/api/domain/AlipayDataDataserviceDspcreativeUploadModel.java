package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部DSP创意创建
 *
 * @author auto create
 * @since 1.0, 2023-05-22 20:39:51
 */
public class AlipayDataDataserviceDspcreativeUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1479275257956938692L;

	/**
	 * 验证码
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 创意列表
	 */
	@ApiListField("creatives")
	@ApiField("dsp_creative")
	private List<DspCreative> creatives;

	/**
	 * 外部dspId
	 */
	@ApiField("dsp_id")
	private String dspId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<DspCreative> getCreatives() {
		return this.creatives;
	}
	public void setCreatives(List<DspCreative> creatives) {
		this.creatives = creatives;
	}

	public String getDspId() {
		return this.dspId;
	}
	public void setDspId(String dspId) {
		this.dspId = dspId;
	}

}
