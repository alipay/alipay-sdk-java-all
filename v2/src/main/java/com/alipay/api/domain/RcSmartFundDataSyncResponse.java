package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中欧基金数据同步响应体
 *
 * @author auto create
 * @since 1.0, 2023-03-29 10:55:02
 */
public class RcSmartFundDataSyncResponse extends AlipayObject {

	private static final long serialVersionUID = 7879864483514877882L;

	/**
	 * 创建返回结果
	 */
	@ApiField("data")
	private CustomizeSyncDataResult data;

	/**
	 * 返回的提示信息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 返回的结果编码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 受理请求是否成功，true成功，false失败
	 */
	@ApiField("success")
	private Boolean success;

	public CustomizeSyncDataResult getData() {
		return this.data;
	}
	public void setData(CustomizeSyncDataResult data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
