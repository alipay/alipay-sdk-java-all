package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antiep.scene.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:33:16
 */
public class AlipaySocialAntiepSceneSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2597428396886346125L;

	/** 
	 * 上报行为的结果描述
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/** 
	 * 上报行为的处理结果码
	 */
	@ApiField("biz_result_code")
	private String bizResultCode;

	/** 
	 * 上报行为的结果如果是失败时，是否可重试，
如果biz_success=false，则biz_retriable=true时代表需要重试的异常，
如果biz_retriable=false时，则代表不能重试，含义可分为两种：1、不需要重试的异常，比如重试的请求被幂等了、2、或者是即使重试了也成功不了的异常，比如参数缺失、配置缺失等，这种错误需要在验证期间就避免掉，验证无误了再上线！
	 */
	@ApiField("biz_retriable")
	private Boolean bizRetriable;

	/** 
	 * 上报行为的处理结果是否成功，如果biz_success=true，则代表上报成功，如果biz_success=false，需看biz_retriable的值是true代表可重试，biz_retriable为false时则不可重试
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 行为上报所需处理模块的处理结果。
比如：一次行为上报需要处理：统计、任务1、任务2，三个模块，则key为每个模块的标识，value为每个模块的处理结果，value有：
1、success：模块执行结果是否成功，如果success为false，则代表执行失败，不能立即拿到该模块的执行结果，但无需重试，只要外面的success为true，这里会保证最终一致性，
2、code：结果码
3、desc：结果描述
	 */
	@ApiField("module_result_map")
	private String moduleResultMap;

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

	public void setModuleResultMap(String moduleResultMap) {
		this.moduleResultMap = moduleResultMap;
	}
	public String getModuleResultMap( ) {
		return this.moduleResultMap;
	}

}
