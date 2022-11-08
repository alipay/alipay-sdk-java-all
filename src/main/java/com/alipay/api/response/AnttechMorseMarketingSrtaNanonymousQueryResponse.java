package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.srta.nanonymous.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-07 11:16:43
 */
public class AnttechMorseMarketingSrtaNanonymousQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2878262655594284334L;

	/** 
	 * 蚂蚁侧返回的唯一标识
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 手机号二次加密密文值，对一次加密密文进行二次签署
	 */
	@ApiField("blind_signed_mobile_sha_256")
	private String blindSignedMobileSha256;

	/** 
	 * 匿名返回的加密数据。通过匿名解密后，数据格式为{"min_amount":"1.00","channel":"xx银行信用卡","max_amount":"5.00","need_deduct":"true","prize_type":"reduce"}
	 */
	@ApiField("result_cipher_list")
	private String resultCipherList;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setBlindSignedMobileSha256(String blindSignedMobileSha256) {
		this.blindSignedMobileSha256 = blindSignedMobileSha256;
	}
	public String getBlindSignedMobileSha256( ) {
		return this.blindSignedMobileSha256;
	}

	public void setResultCipherList(String resultCipherList) {
		this.resultCipherList = resultCipherList;
	}
	public String getResultCipherList( ) {
		return this.resultCipherList;
	}

}
