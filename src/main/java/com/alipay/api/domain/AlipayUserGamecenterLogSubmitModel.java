package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 玩一玩游戏中心平台三方游戏厂商错误日志提交接口
 *
 * @author auto create
 * @since 1.0, 2022-09-22 19:13:37
 */
public class AlipayUserGamecenterLogSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8242849233646661783L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 通用错误码:
RETRY_FAILED - 重试多次仍然失败
DELAY_SUBMIT - 数据将延迟上传

游戏商可自定义不能及时上报的错误码，然后同步给玩一玩技术
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 游戏商自行定义具有可读性的错误码描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 出现异常的openapi接口名字
	 */
	@ApiField("openapi_name")
	private String openapiName;

	/**
	 * 出现异常的openapi接口请求参数信息。直接取request中的bizContent字段信息
	 */
	@ApiField("request_body")
	private String requestBody;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getOpenapiName() {
		return this.openapiName;
	}
	public void setOpenapiName(String openapiName) {
		this.openapiName = openapiName;
	}

	public String getRequestBody() {
		return this.requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

}
