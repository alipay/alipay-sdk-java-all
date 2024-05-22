package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZXZMessageDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.chat.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 10:42:02
 */
public class AntfortuneFinresearchChatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6385198342292616624L;

	/** 
	 * 消息详情
	 */
	@ApiField("data")
	private ZXZMessageDetail data;

	/** 
	 * 接口请求是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setData(ZXZMessageDetail data) {
		this.data = data;
	}
	public ZXZMessageDetail getData( ) {
		return this.data;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
