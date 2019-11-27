package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.app.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayPlatformAppQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3271219474958539216L;

	/** 
	 * 商户的appid列表
	 */
	@ApiListField("app_ids")
	@ApiField("string")
	private List<String> appIds;

	/** 
	 * 操作成功
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 操作成功
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setAppIds(List<String> appIds) {
		this.appIds = appIds;
	}
	public List<String> getAppIds( ) {
		return this.appIds;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
