package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交换中心JSAPI创建
 *
 * @author auto create
 * @since 1.0, 2019-12-26 18:17:15
 */
public class AlipayOpenMiniAliminiabilityprodJsapiCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1721686336122718437L;

	/**
	 * api基本参数
	 */
	@ApiField("api_base_request")
	private JsApiBaseDTO apiBaseRequest;

	/**
	 * JsApi错误码
	 */
	@ApiListField("api_error_code_request")
	@ApiField("error_code_d_t_o")
	private List<ErrorCodeDTO> apiErrorCodeRequest;

	/**
	 * 入参列表
	 */
	@ApiField("in_param_requests")
	private String inParamRequests;

	/**
	 * 出参
	 */
	@ApiField("out_param_requests")
	private String outParamRequests;

	public JsApiBaseDTO getApiBaseRequest() {
		return this.apiBaseRequest;
	}
	public void setApiBaseRequest(JsApiBaseDTO apiBaseRequest) {
		this.apiBaseRequest = apiBaseRequest;
	}

	public List<ErrorCodeDTO> getApiErrorCodeRequest() {
		return this.apiErrorCodeRequest;
	}
	public void setApiErrorCodeRequest(List<ErrorCodeDTO> apiErrorCodeRequest) {
		this.apiErrorCodeRequest = apiErrorCodeRequest;
	}

	public String getInParamRequests() {
		return this.inParamRequests;
	}
	public void setInParamRequests(String inParamRequests) {
		this.inParamRequests = inParamRequests;
	}

	public String getOutParamRequests() {
		return this.outParamRequests;
	}
	public void setOutParamRequests(String outParamRequests) {
		this.outParamRequests = outParamRequests;
	}

}
