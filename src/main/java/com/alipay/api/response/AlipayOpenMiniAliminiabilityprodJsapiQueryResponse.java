package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ErrorCodeDTO;
import com.alipay.api.domain.JsApiBaseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.aliminiabilityprod.jsapi.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-26 18:14:41
 */
public class AlipayOpenMiniAliminiabilityprodJsapiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6696874789425966512L;

	/** 
	 * 错误码
	 */
	@ApiListField("error_code_dto_list")
	@ApiField("error_code_d_t_o")
	private List<ErrorCodeDTO> errorCodeDtoList;

	/** 
	 * 入参
	 */
	@ApiField("in_params")
	private String inParams;

	/** 
	 * JSAPI基础参数
	 */
	@ApiField("js_api_base_dto")
	private JsApiBaseDTO jsApiBaseDto;

	/** 
	 * 出参
	 */
	@ApiField("out_params")
	private String outParams;

	public void setErrorCodeDtoList(List<ErrorCodeDTO> errorCodeDtoList) {
		this.errorCodeDtoList = errorCodeDtoList;
	}
	public List<ErrorCodeDTO> getErrorCodeDtoList( ) {
		return this.errorCodeDtoList;
	}

	public void setInParams(String inParams) {
		this.inParams = inParams;
	}
	public String getInParams( ) {
		return this.inParams;
	}

	public void setJsApiBaseDto(JsApiBaseDTO jsApiBaseDto) {
		this.jsApiBaseDto = jsApiBaseDto;
	}
	public JsApiBaseDTO getJsApiBaseDto( ) {
		return this.jsApiBaseDto;
	}

	public void setOutParams(String outParams) {
		this.outParams = outParams;
	}
	public String getOutParams( ) {
		return this.outParams;
	}

}
