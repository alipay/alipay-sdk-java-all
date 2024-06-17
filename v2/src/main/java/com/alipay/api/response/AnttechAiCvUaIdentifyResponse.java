package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.ua.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 11:59:13
 */
public class AnttechAiCvUaIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2224632792922369524L;

	/** 
	 * 服务访问机器
	 */
	@ApiField("host")
	private String host;

	/** 
	 * 具体错误码参考模型服务提供者
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 模型预测结果，jsonstring，具体参考模型服务提供者的样例输出
	 */
	@ApiField("result_map")
	private String resultMap;

	/** 
	 * 模型结果信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 非0表示模型inference有异常
	 */
	@ApiField("ret")
	private String ret;

	/** 
	 * 当次调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setHost(String host) {
		this.host = host;
	}
	public String getHost( ) {
		return this.host;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMap(String resultMap) {
		this.resultMap = resultMap;
	}
	public String getResultMap( ) {
		return this.resultMap;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setRet(String ret) {
		this.ret = ret;
	}
	public String getRet( ) {
		return this.ret;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
