package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.deepfake.detect response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-18 11:02:05
 */
public class DatadigitalFincloudGeneralsaasDeepfakeDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1152749649867918398L;

	/** 
	 * 防伪识别单据号，计费依据，请保留以便排查问题。
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 彩打复印检测结果。Y=通过，N=不通过，S=跳过(未检测)
	 */
	@ApiField("colorprint_result")
	private String colorprintResult;

	/** 
	 * 重复提交检测
	 */
	@ApiField("duplicate_upload_result")
	private String duplicateUploadResult;

	/** 
	 * 截屏检测结果。Y=通过，N=不通过，S=跳过(未检测)
	 */
	@ApiField("jieping_result")
	private String jiepingResult;

	/** 
	 * 拍屏检测结果。Y=通过，N=不通过，S=跳过(未检测)
	 */
	@ApiField("paiping_result")
	private String paipingResult;

	/** 
	 * 综合判定。
	 */
	@ApiField("passed")
	private Boolean passed;

	/** 
	 * PS检测。
	 */
	@ApiField("ps_result")
	private String psResult;

	/** 
	 * 相同背景检测结果。Y=通过，N=不通过，S=跳过(未检测)
	 */
	@ApiField("same_background_result")
	private String sameBackgroundResult;

	/** 
	 * 相同人脸检测结果。Y=通过，N=不通过，S=跳过(未检测)
	 */
	@ApiField("same_face_result")
	private String sameFaceResult;

	/** 
	 * 相同签名检测结果。Y=通过，N=不通过，S=跳过(未检测)
	 */
	@ApiField("same_signature_result")
	private String sameSignatureResult;

	/** 
	 * 大模型篡改检测结果，仅增强模式返回。Y=通过，N=不通过，S=跳过(未检测)
	 */
	@ApiField("tamper_ps_result")
	private String tamperPsResult;

	/** 
	 * 水印检测结果。Y=通过，N=不通过，S=跳过(未检测)
	 */
	@ApiField("watermark_result")
	private String watermarkResult;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setColorprintResult(String colorprintResult) {
		this.colorprintResult = colorprintResult;
	}
	public String getColorprintResult( ) {
		return this.colorprintResult;
	}

	public void setDuplicateUploadResult(String duplicateUploadResult) {
		this.duplicateUploadResult = duplicateUploadResult;
	}
	public String getDuplicateUploadResult( ) {
		return this.duplicateUploadResult;
	}

	public void setJiepingResult(String jiepingResult) {
		this.jiepingResult = jiepingResult;
	}
	public String getJiepingResult( ) {
		return this.jiepingResult;
	}

	public void setPaipingResult(String paipingResult) {
		this.paipingResult = paipingResult;
	}
	public String getPaipingResult( ) {
		return this.paipingResult;
	}

	public void setPassed(Boolean passed) {
		this.passed = passed;
	}
	public Boolean getPassed( ) {
		return this.passed;
	}

	public void setPsResult(String psResult) {
		this.psResult = psResult;
	}
	public String getPsResult( ) {
		return this.psResult;
	}

	public void setSameBackgroundResult(String sameBackgroundResult) {
		this.sameBackgroundResult = sameBackgroundResult;
	}
	public String getSameBackgroundResult( ) {
		return this.sameBackgroundResult;
	}

	public void setSameFaceResult(String sameFaceResult) {
		this.sameFaceResult = sameFaceResult;
	}
	public String getSameFaceResult( ) {
		return this.sameFaceResult;
	}

	public void setSameSignatureResult(String sameSignatureResult) {
		this.sameSignatureResult = sameSignatureResult;
	}
	public String getSameSignatureResult( ) {
		return this.sameSignatureResult;
	}

	public void setTamperPsResult(String tamperPsResult) {
		this.tamperPsResult = tamperPsResult;
	}
	public String getTamperPsResult( ) {
		return this.tamperPsResult;
	}

	public void setWatermarkResult(String watermarkResult) {
		this.watermarkResult = watermarkResult;
	}
	public String getWatermarkResult( ) {
		return this.watermarkResult;
	}

}
