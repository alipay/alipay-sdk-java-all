package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.afts.car.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:33
 */
public class AlipayMsaasMediarecogAftsCarIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8625162588615385997L;

	/** 
	 * 浮点数； 欺诈概率，取值范围0-1，0表示非欺诈，1表示欺诈
	 */
	@ApiField("cheat_probability")
	private Long cheatProbability;

	/** 
	 * 欺诈类型
	 */
	@ApiField("cheat_type")
	private String cheatType;

	/** 
	 * 识别出的里程数
	 */
	@ApiField("ocr_kilometres")
	private Long ocrKilometres;

	/** 
	 * 浮点数;ocr识别出的里程数和用户输入的相似度，取值范围0-1，1表示一致，0表示完全不一样。
	 */
	@ApiField("ocr_probability")
	private Long ocrProbability;

	public void setCheatProbability(Long cheatProbability) {
		this.cheatProbability = cheatProbability;
	}
	public Long getCheatProbability( ) {
		return this.cheatProbability;
	}

	public void setCheatType(String cheatType) {
		this.cheatType = cheatType;
	}
	public String getCheatType( ) {
		return this.cheatType;
	}

	public void setOcrKilometres(Long ocrKilometres) {
		this.ocrKilometres = ocrKilometres;
	}
	public Long getOcrKilometres( ) {
		return this.ocrKilometres;
	}

	public void setOcrProbability(Long ocrProbability) {
		this.ocrProbability = ocrProbability;
	}
	public Long getOcrProbability( ) {
		return this.ocrProbability;
	}

}
