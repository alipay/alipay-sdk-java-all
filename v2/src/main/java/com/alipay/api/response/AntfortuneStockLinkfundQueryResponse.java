package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiLinkFundResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.linkfund.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:12:06
 */
public class AntfortuneStockLinkfundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2247792925267494912L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 关联的基金结果
	 */
	@ApiField("data")
	private OpenApiLinkFundResponse data;

	/** 
	 * 描述信息
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setData(OpenApiLinkFundResponse data) {
		this.data = data;
	}
	public OpenApiLinkFundResponse getData( ) {
		return this.data;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
