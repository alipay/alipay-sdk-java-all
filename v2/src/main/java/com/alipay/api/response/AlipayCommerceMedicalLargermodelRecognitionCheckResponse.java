package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.recognition.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 18:07:36
 */
public class AlipayCommerceMedicalLargermodelRecognitionCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879453264492885288L;

	/** 
	 * 文件上传afts后返回id
	 */
	@ApiField("afts_id")
	private String aftsId;

	/** 
	 * 算法返回的结果，客户端无须关注此处
	 */
	@ApiField("classify_result")
	private String classifyResult;

	/** 
	 * 压缩图片地址
	 */
	@ApiField("compressed_pic_url")
	private String compressedPicUrl;

	/** 
	 * 图片类型
	 */
	@ApiField("pic_type")
	private String picType;

	/** 
	 * 查询内容
	 */
	@ApiField("query")
	private String query;

	/** 
	 * 图片识别返回值为false时，取该值，提示用户
	 */
	@ApiField("tips")
	private String tips;

	/** 
	 * 文件可访问url
	 */
	@ApiField("url")
	private String url;

	/** 
	 * true表示是需要的内容，false表示无关的,
verificationResult= false时，取该tips值，提示用户
	 */
	@ApiField("verification_result")
	private Boolean verificationResult;

	public void setAftsId(String aftsId) {
		this.aftsId = aftsId;
	}
	public String getAftsId( ) {
		return this.aftsId;
	}

	public void setClassifyResult(String classifyResult) {
		this.classifyResult = classifyResult;
	}
	public String getClassifyResult( ) {
		return this.classifyResult;
	}

	public void setCompressedPicUrl(String compressedPicUrl) {
		this.compressedPicUrl = compressedPicUrl;
	}
	public String getCompressedPicUrl( ) {
		return this.compressedPicUrl;
	}

	public void setPicType(String picType) {
		this.picType = picType;
	}
	public String getPicType( ) {
		return this.picType;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	public String getQuery( ) {
		return this.query;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getTips( ) {
		return this.tips;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

	public void setVerificationResult(Boolean verificationResult) {
		this.verificationResult = verificationResult;
	}
	public Boolean getVerificationResult( ) {
		return this.verificationResult;
	}

}
