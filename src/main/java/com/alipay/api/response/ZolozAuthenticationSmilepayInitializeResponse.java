package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.smilepay.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 11:01:34
 */
public class ZolozAuthenticationSmilepayInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4171287292751181261L;

	/** 
	 * 返回详细码
	 */
	@ApiField("ret_code_sub")
	private String retCodeSub;

	/** 
	 * 返回详细信息
	 */
	@ApiField("ret_message_sub")
	private String retMessageSub;

	/** 
	 * ZIM上下文ID
	 */
	@ApiField("zim_id")
	private String zimId;

	/** 
	 * 客户端协议
	 */
	@ApiField("zim_init_client_data")
	private String zimInitClientData;

	public void setRetCodeSub(String retCodeSub) {
		this.retCodeSub = retCodeSub;
	}
	public String getRetCodeSub( ) {
		return this.retCodeSub;
	}

	public void setRetMessageSub(String retMessageSub) {
		this.retMessageSub = retMessageSub;
	}
	public String getRetMessageSub( ) {
		return this.retMessageSub;
	}

	public void setZimId(String zimId) {
		this.zimId = zimId;
	}
	public String getZimId( ) {
		return this.zimId;
	}

	public void setZimInitClientData(String zimInitClientData) {
		this.zimInitClientData = zimInitClientData;
	}
	public String getZimInitClientData( ) {
		return this.zimInitClientData;
	}

}
