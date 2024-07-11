package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量修改结果
 *
 * @author auto create
 * @since 1.0, 2023-08-30 16:35:14
 */
public class BatchModifyResponse extends AlipayObject {

	private static final long serialVersionUID = 2776654797338918447L;

	/**
	 * 数据
	 */
	@ApiField("data")
	private BatchResultDTO data;

	/**
	 * 结果码
	 */
	@ApiField("response_code")
	private String responseCode;

	/**
	 * 信息
	 */
	@ApiField("response_msg")
	private String responseMsg;

	/**
	 * 是否成功
	 */
	@ApiField("succeeded")
	private Boolean succeeded;

	public BatchResultDTO getData() {
		return this.data;
	}
	public void setData(BatchResultDTO data) {
		this.data = data;
	}

	public String getResponseCode() {
		return this.responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return this.responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public Boolean getSucceeded() {
		return this.succeeded;
	}
	public void setSucceeded(Boolean succeeded) {
		this.succeeded = succeeded;
	}

}
