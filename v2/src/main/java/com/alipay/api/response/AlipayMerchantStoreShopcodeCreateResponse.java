package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.store.shopcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:57
 */
public class AlipayMerchantStoreShopcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5355584629423875323L;

	/** 
	 * 申请流水ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 商户确认地址
	 */
	@ApiField("confirm_url")
	private String confirmUrl;

	/** 
	 * 门店码开通结果码，详细可参考文档下方统一对外错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 门店码开通结果提示，详细可参考文档下方统一对外错误码
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 开通门店码请求状态码，提交后一般为“等待商户确认”状态(WAIT_MERCHANT_CONFIRM)。
	 */
	@ApiField("status")
	private String status;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setConfirmUrl(String confirmUrl) {
		this.confirmUrl = confirmUrl;
	}
	public String getConfirmUrl( ) {
		return this.confirmUrl;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
