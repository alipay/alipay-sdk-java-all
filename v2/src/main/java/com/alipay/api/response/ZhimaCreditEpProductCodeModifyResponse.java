package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.product.code.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:36:44
 */
public class ZhimaCreditEpProductCodeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4441974257236624288L;

	/** 
	 * 处理结果：true成功,false失败
	 */
	@ApiField("result")
	private Boolean result;

	/** 
	 * 更新结果描述
	 */
	@ApiField("result_info")
	private String resultInfo;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
	public String getResultInfo( ) {
		return this.resultInfo;
	}

}
