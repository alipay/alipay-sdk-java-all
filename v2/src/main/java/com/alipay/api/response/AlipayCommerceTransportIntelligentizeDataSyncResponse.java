package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-18 10:48:27
 */
public class AlipayCommerceTransportIntelligentizeDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3163528977138177312L;

	/** 
	 * 同步成功的数据ID，如有多个使用英文半角逗号分隔
	 */
	@ApiField("data_id")
	private String dataId;

	/** 
	 * 扩展信息，json格式，由双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 结果码，发生异常时非空
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息，发生异常时非空
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
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
