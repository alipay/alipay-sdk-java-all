package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部数据采集
 *
 * @author auto create
 * @since 1.0, 2022-06-22 17:20:40
 */
public class AnttechBlockchainDefinDtcDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 8368895693498423933L;

	/**
	 * 接口编码
	 */
	@ApiField("api_code")
	private String apiCode;

	/**
	 * 业务参数，json字符串
	 */
	@ApiField("biz_param")
	private String bizParam;

	/**
	 * 请求幂等ID
	 */
	@ApiField("request_id")
	private String requestId;

	public String getApiCode() {
		return this.apiCode;
	}
	public void setApiCode(String apiCode) {
		this.apiCode = apiCode;
	}

	public String getBizParam() {
		return this.bizParam;
	}
	public void setBizParam(String bizParam) {
		this.bizParam = bizParam;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
