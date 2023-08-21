package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.zmgo.cumulate.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:11:57
 */
public class ZhimaMerchantZmgoCumulateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4332644944368923885L;

	/** 
	 * 芝麻go协议号，唯一标识一个芝麻go协议。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 数据回传失败原因描述
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 外部业务号，唯一标识一笔回传数据。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
