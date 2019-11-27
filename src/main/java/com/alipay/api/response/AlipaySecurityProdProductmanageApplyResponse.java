package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.productmanage.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-28 10:53:12
 */
public class AlipaySecurityProdProductmanageApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8226197993427652224L;

	/** 
	 * 结果数据
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 产品管理流程失败后返回的错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 产品管理流程失败后返回的错误原因
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 产品管理流程是否结束
	 */
	@ApiField("finish")
	private Boolean finish;

	/** 
	 * 产品管理结束码
	 */
	@ApiField("finish_code")
	private String finishCode;

	/** 
	 * 产品管理流程结束文案
	 */
	@ApiField("finish_msg")
	private String finishMsg;

	/** 
	 * 产品管理初始化token
	 */
	@ApiField("init_token")
	private String initToken;

	/** 
	 * 下一步指令
	 */
	@ApiField("next_step")
	private String nextStep;

	/** 
	 * 产品管理状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 产品管理流程处理结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setFinish(Boolean finish) {
		this.finish = finish;
	}
	public Boolean getFinish( ) {
		return this.finish;
	}

	public void setFinishCode(String finishCode) {
		this.finishCode = finishCode;
	}
	public String getFinishCode( ) {
		return this.finishCode;
	}

	public void setFinishMsg(String finishMsg) {
		this.finishMsg = finishMsg;
	}
	public String getFinishMsg( ) {
		return this.finishMsg;
	}

	public void setInitToken(String initToken) {
		this.initToken = initToken;
	}
	public String getInitToken( ) {
		return this.initToken;
	}

	public void setNextStep(String nextStep) {
		this.nextStep = nextStep;
	}
	public String getNextStep( ) {
		return this.nextStep;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
