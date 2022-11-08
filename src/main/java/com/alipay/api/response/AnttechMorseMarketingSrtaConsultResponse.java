package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.srta.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:26:38
 */
public class AnttechMorseMarketingSrtaConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5321187849629933232L;

	/** 
	 * 蚂蚁侧返回的唯一标识，用问题定位
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 二次加密的密文值，是对一次加密密文进行二次签署
	 */
	@ApiField("blind_signed_mobile_sha_256")
	private String blindSignedMobileSha256;

	/** 
	 * 匿名返回的加密数据。通过匿名解密后，数据格式为[
    {
      "campaign_channel": "xx银行信用卡",
      "campaign_channel_code": "xxB_CC",
      "campaign_id": "62e01b2f3b2f43f1bff84354f7ec0a29001",
      "idea_content": "xx银行信用卡0.2减0.01",
      "idea_type": "binding",
      "max_amount": "0.01",
      "min_amount": "0.01",
      "threshold": "0.2"
    }
  ]
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
