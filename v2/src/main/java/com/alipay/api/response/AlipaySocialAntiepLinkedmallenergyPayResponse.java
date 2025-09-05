package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antiep.linkedmallenergy.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-05 15:10:38
 */
public class AlipaySocialAntiepLinkedmallenergyPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1327963256452157369L;

	/** 
	 * 支持积分的处理结果描述，这个文案展示给用户查看
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/** 
	 * 支持积分的处理结果码
	 */
	@ApiField("biz_result_code")
	private String bizResultCode;

	/** 
	 * 业务的实际处理结果
biz_success=ture,代表成功；biz_success=false代表失败
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public String getBizDesc( ) {
		return this.bizDesc;
	}

	public void setBizResultCode(String bizResultCode) {
		this.bizResultCode = bizResultCode;
	}
	public String getBizResultCode( ) {
		return this.bizResultCode;
	}

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
