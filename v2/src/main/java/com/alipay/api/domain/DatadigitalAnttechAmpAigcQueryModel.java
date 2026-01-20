package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * aigc服务调用查询
 *
 * @author auto create
 * @since 1.0, 2024-05-16 11:38:53
 */
public class DatadigitalAnttechAmpAigcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8799479256398686911L;

	/**
	 * 参数数据
	 */
	@ApiField("param_data")
	private String paramData;

	/**
	 * 业务请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 企业社会信用代码
	 */
	@ApiField("social_code")
	private String socialCode;

	public String getParamData() {
		return this.paramData;
	}
	public void setParamData(String paramData) {
		this.paramData = paramData;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSocialCode() {
		return this.socialCode;
	}
	public void setSocialCode(String socialCode) {
		this.socialCode = socialCode;
	}

}
