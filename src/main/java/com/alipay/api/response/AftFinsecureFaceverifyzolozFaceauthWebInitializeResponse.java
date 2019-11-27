package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: aft.finsecure.faceverifyzoloz.faceauth.web.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AftFinsecureFaceverifyzolozFaceauthWebInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3877223776712267635L;

	/** 
	 * 预留扩展结果
	 */
	@ApiField("extern_info")
	private String externInfo;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 产品结果明细，不影响决策
	 */
	@ApiField("result_code_sub")
	private String resultCodeSub;

	/** 
	 * 结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * result_code_sub对应的文案
	 */
	@ApiField("result_msg_sub")
	private String resultMsgSub;

	/** 
	 * 实人认证id
	 */
	@ApiField("zim_id")
	private String zimId;

	public void setExternInfo(String externInfo) {
		this.externInfo = externInfo;
	}
	public String getExternInfo( ) {
		return this.externInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultCodeSub(String resultCodeSub) {
		this.resultCodeSub = resultCodeSub;
	}
	public String getResultCodeSub( ) {
		return this.resultCodeSub;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setResultMsgSub(String resultMsgSub) {
		this.resultMsgSub = resultMsgSub;
	}
	public String getResultMsgSub( ) {
		return this.resultMsgSub;
	}

	public void setZimId(String zimId) {
		this.zimId = zimId;
	}
	public String getZimId( ) {
		return this.zimId;
	}

}
