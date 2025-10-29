package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 联防联控数据流入蚂蚁消息接口
 *
 * @author auto create
 * @since 1.0, 2024-07-29 10:38:57
 */
public class AlipaySecurityDataRiskservicecloudInputSendModel extends AlipayObject {

	private static final long serialVersionUID = 1721551975185336532L;

	/**
	 * 标识本次协商的数据输入的唯一编码，由蚂蚁定义
	 */
	@ApiField("input_code")
	private String inputCode;

	/**
	 * 请求入参数据列表
	 */
	@ApiListField("params")
	@ApiField("data_input_param")
	private List<DataInputParam> params;

	/**
	 * 由客户端随机生成的关联本次调用的唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	public String getInputCode() {
		return this.inputCode;
	}
	public void setInputCode(String inputCode) {
		this.inputCode = inputCode;
	}

	public List<DataInputParam> getParams() {
		return this.params;
	}
	public void setParams(List<DataInputParam> params) {
		this.params = params;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
