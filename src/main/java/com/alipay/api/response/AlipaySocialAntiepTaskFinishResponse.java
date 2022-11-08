package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antiep.task.finish response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 15:41:50
 */
public class AlipaySocialAntiepTaskFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 6481594348274654454L;

	/** 
	 * 完成任务结果的描述
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/** 
	 * 完成任务的处理结果码
	 */
	@ApiField("biz_result_code")
	private String bizResultCode;

	/** 
	 * 任务完成的结果如果是失败时，是否可重试， 如果biz_success=false，则biz_retriable=true时代表需要重试的异常， 如果biz_retriable=false时，则代表不能重试，含义可分为两种：1、不需要重试的异常，比如重试的请求被幂等了、2、或者是即使重试了也成功不了的异常，比如参数缺失、配置缺失等，这种错误需要在验证期间就避免掉，验证无误了再上线！
	 */
	@ApiField("biz_retriable")
	private Boolean bizRetriable;

	/** 
	 * 完成任务的处理结果是否成功，如果biz_success=true，则代表完成任务成功，如果biz_success=false，需看biz_retriable的值是true代表可重试，biz_retriable为false时则不可重试
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public String getBizDesc( ) {
		return this.bizDesc;
	}

	public void setBizResultCode(String bizResultCode) {
		this.bizResultCode = bizResultCode;
	}
	public String getBizResultCode( ) {
		return this.bizResultCode;
	}

	public void setBizRetriable(Boolean bizRetriable) {
		this.bizRetriable = bizRetriable;
	}
	public Boolean getBizRetriable( ) {
		return this.bizRetriable;
	}

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
