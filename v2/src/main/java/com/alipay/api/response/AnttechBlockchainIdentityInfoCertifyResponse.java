package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.identity.info.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:01
 */
public class AnttechBlockchainIdentityInfoCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2367781413384361374L;

	/** 
	 * 账户ID
	 */
	@ApiField("acc_id")
	private String accId;

	/** 
	 * 错误码code，0代表成功， 非0不成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/** 
	 * 业务账户DID
	 */
	@ApiField("did")
	private String did;

	/** 
	 * 表示是否成功，paas=true 表示业务验证通过，需要和success 共同判断业务是否成功
	 */
	@ApiField("pass")
	private Boolean pass;

	/** 
	 * 业务系统ID
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/** 
	 * 代表业务成功
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 代表业务成功，其他字段代表具体的错误
	 */
	@ApiField("sys_err_code")
	private String sysErrCode;

	/** 
	 * 具体的错误美容描述
	 */
	@ApiField("sys_err_msg")
	private String sysErrMsg;

	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getAccId( ) {
		return this.accId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

	public void setDid(String did) {
		this.did = did;
	}
	public String getDid( ) {
		return this.did;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}
	public String getReqMsgId( ) {
		return this.reqMsgId;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public void setSysErrCode(String sysErrCode) {
		this.sysErrCode = sysErrCode;
	}
	public String getSysErrCode( ) {
		return this.sysErrCode;
	}

	public void setSysErrMsg(String sysErrMsg) {
		this.sysErrMsg = sysErrMsg;
	}
	public String getSysErrMsg( ) {
		return this.sysErrMsg;
	}

}
