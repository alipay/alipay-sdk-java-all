package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeepFakeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.deepfake.new.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-18 15:52:51
 */
public class DatadigitalFincloudGeneralsaasDeepfakeNewCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2869622615282688869L;

	/** 
	 * 防伪识别单据号，计费依据，请保留以便排查问题。
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 彩打复印检测结果。Y=通过，N=不通过，S=跳过（未检测）。
	 */
	@ApiField("colorprint_result")
	private DeepFakeResult colorprintResult;

	/** 
	 * 元数据异常检测结果。
	 */
	@ApiField("exif_ps_result")
	private String exifPsResult;

	/** 
	 * 截屏检测结果。Y=通过，N=不通过，S=跳过（未检测）。
	 */
	@ApiField("jieping_result")
	private DeepFakeResult jiepingResult;

	/** 
	 * 拍屏检测结果。Y=通过，N=不通过，S=跳过（未检测）。
	 */
	@ApiField("paiping_result")
	private DeepFakeResult paipingResult;

	/** 
	 * 综合判定。
	 */
	@ApiField("passed")
	private Boolean passed;

	/** 
	 * PS检测结果。Y=通过，N=不通过，S=跳过（未检测）；检测不通过时返回fake_reason。
	 */
	@ApiField("ps_result")
	private DeepFakeResult psResult;

	/** 
	 * 大模型篡改检测结果。Y=通过，N=不通过，S=跳过（未检测）。
	 */
	@ApiField("tamper_ps_result")
	private DeepFakeResult tamperPsResult;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setColorprintResult(DeepFakeResult colorprintResult) {
		this.colorprintResult = colorprintResult;
	}
	public DeepFakeResult getColorprintResult( ) {
		return this.colorprintResult;
	}

	public void setExifPsResult(String exifPsResult) {
		this.exifPsResult = exifPsResult;
	}
	public String getExifPsResult( ) {
		return this.exifPsResult;
	}

	public void setJiepingResult(DeepFakeResult jiepingResult) {
		this.jiepingResult = jiepingResult;
	}
	public DeepFakeResult getJiepingResult( ) {
		return this.jiepingResult;
	}

	public void setPaipingResult(DeepFakeResult paipingResult) {
		this.paipingResult = paipingResult;
	}
	public DeepFakeResult getPaipingResult( ) {
		return this.paipingResult;
	}

	public void setPassed(Boolean passed) {
		this.passed = passed;
	}
	public Boolean getPassed( ) {
		return this.passed;
	}

	public void setPsResult(DeepFakeResult psResult) {
		this.psResult = psResult;
	}
	public DeepFakeResult getPsResult( ) {
		return this.psResult;
	}

	public void setTamperPsResult(DeepFakeResult tamperPsResult) {
		this.tamperPsResult = tamperPsResult;
	}
	public DeepFakeResult getTamperPsResult( ) {
		return this.tamperPsResult;
	}

}
