package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.voice.mediaaudio.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMsaasMediarecogVoiceMediaaudioUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2834583722777922987L;

	/** 
	 * 扩展字段
	 */
	@ApiField("extinfo_a")
	private String extinfoA;

	/** 
	 * 扩展字段
	 */
	@ApiField("extinfo_b")
	private String extinfoB;

	/** 
	 * 结果memo
	 */
	@ApiField("result_memo")
	private String resultMemo;

	/** 
	 * 结果状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setExtinfoA(String extinfoA) {
		this.extinfoA = extinfoA;
	}
	public String getExtinfoA( ) {
		return this.extinfoA;
	}

	public void setExtinfoB(String extinfoB) {
		this.extinfoB = extinfoB;
	}
	public String getExtinfoB( ) {
		return this.extinfoB;
	}

	public void setResultMemo(String resultMemo) {
		this.resultMemo = resultMemo;
	}
	public String getResultMemo( ) {
		return this.resultMemo;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
