package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询sgx集群的IAS report
 *
 * @author auto create
 * @since 1.0, 2019-05-22 15:30:06
 */
public class AlipayDataAiserviceSgxGatewayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4614211518172594282L;

	/**
	 * biz_handler: 具体的业务方法名称，该值必须填写。业务方请联系此openapi接口负责人获取业务方法名称。
	 */
	@ApiField("biz_handler")
	private String bizHandler;

	/**
	 * biz_handler_input:
具体业务请求输入的json字符串，必须填写且唯一。该值的具体内容取决于具体业务。
	 */
	@ApiField("biz_handler_input")
	private String bizHandlerInput;

	/**
	 * institution_uuid: 机构ID，该值可选，默认不填写。业务调用方如果需要填写此值，需要联系此openapi接口人获取。
	 */
	@ApiField("institution_uuid")
	private String institutionUuid;

	/**
	 * request_uuid: 请求的唯一ID，用于定位请求。该ID用户可以自行生成，每次请求的ID不要重复。
	 */
	@ApiField("request_uuid")
	private String requestUuid;

	public String getBizHandler() {
		return this.bizHandler;
	}
	public void setBizHandler(String bizHandler) {
		this.bizHandler = bizHandler;
	}

	public String getBizHandlerInput() {
		return this.bizHandlerInput;
	}
	public void setBizHandlerInput(String bizHandlerInput) {
		this.bizHandlerInput = bizHandlerInput;
	}

	public String getInstitutionUuid() {
		return this.institutionUuid;
	}
	public void setInstitutionUuid(String institutionUuid) {
		this.institutionUuid = institutionUuid;
	}

	public String getRequestUuid() {
		return this.requestUuid;
	}
	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}

}
