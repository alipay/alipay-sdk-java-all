package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.assetmanage.penetrate.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-28 11:15:16
 */
public class AnttechBlockchainDefinAssetmanagePenetrateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5564283393237235822L;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 业务展示类信息
	 */
	@ApiField("error_view_msg")
	private String errorViewMsg;

	/** 
	 * 业务查询返回数据JSON，一般为各类申请的状态，内容等，资产穿透类查询不返回个人信息
	 */
	@ApiField("result_obj")
	private String resultObj;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setErrorViewMsg(String errorViewMsg) {
		this.errorViewMsg = errorViewMsg;
	}
	public String getErrorViewMsg( ) {
		return this.errorViewMsg;
	}

	public void setResultObj(String resultObj) {
		this.resultObj = resultObj;
	}
	public String getResultObj( ) {
		return this.resultObj;
	}

}
