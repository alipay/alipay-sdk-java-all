package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.se.applet.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 15:07:39
 */
public class AlipaySecurityProdSeAppletQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1894744671272247757L;

	/** 
	 * apdu_commands:apdu指令列表，逗号分隔，根据该值确定硬件端对applet的具体操作
	 */
	@ApiField("apdu_commands")
	private String apduCommands;

	/** 
	 * 操作类型，唯一，传递tsm的具体操作，厂测程序提供
	 */
	@ApiField("opt_type")
	private Long optType;

	/** 
	 * result_code:调用tsm返回的结果码，根据该字段可以知道本次调用的状态
	 */
	@ApiField("result_code")
	private Long resultCode;

	/** 
	 * step:表示调用tsm过程中的步骤数
	 */
	@ApiField("step")
	private Long step;

	/** 
	 * step_code:tsm返回的步骤编码，供多语使用
	 */
	@ApiField("step_code")
	private Long stepCode;

	/** 
	 * sub_opt_type:子操作类型，tsm返回给厂测程序
	 */
	@ApiField("sub_opt_type")
	private Long subOptType;

	/** 
	 * total_step:表示调用tsm的总步骤数
	 */
	@ApiField("total_step")
	private Long totalStep;

	public void setApduCommands(String apduCommands) {
		this.apduCommands = apduCommands;
	}
	public String getApduCommands( ) {
		return this.apduCommands;
	}

	public void setOptType(Long optType) {
		this.optType = optType;
	}
	public Long getOptType( ) {
		return this.optType;
	}

	public void setResultCode(Long resultCode) {
		this.resultCode = resultCode;
	}
	public Long getResultCode( ) {
		return this.resultCode;
	}

	public void setStep(Long step) {
		this.step = step;
	}
	public Long getStep( ) {
		return this.step;
	}

	public void setStepCode(Long stepCode) {
		this.stepCode = stepCode;
	}
	public Long getStepCode( ) {
		return this.stepCode;
	}

	public void setSubOptType(Long subOptType) {
		this.subOptType = subOptType;
	}
	public Long getSubOptType( ) {
		return this.subOptType;
	}

	public void setTotalStep(Long totalStep) {
		this.totalStep = totalStep;
	}
	public Long getTotalStep( ) {
		return this.totalStep;
	}

}
