package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中欧基金数据同步返回结果
 *
 * @author auto create
 * @since 1.0, 2023-03-20 10:25:41
 */
public class CustomizeSyncDataResult extends AlipayObject {

	private static final long serialVersionUID = 7843744148798377273L;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 结果状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	/**
	 * 同步状态
	 */
	@ApiField("sync_status")
	private String syncStatus;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getResultStatus() {
		return this.resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public String getSyncStatus() {
		return this.syncStatus;
	}
	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}

}
