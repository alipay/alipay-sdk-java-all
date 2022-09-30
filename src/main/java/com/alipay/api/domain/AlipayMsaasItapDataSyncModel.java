package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备变更信息数据同步
 *
 * @author auto create
 * @since 1.0, 2022-09-23 11:41:59
 */
public class AlipayMsaasItapDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4494314875434635273L;

	/**
	 * 设备数据同步通知消息体
	 */
	@ApiField("payload")
	private DataSyncPayload payload;

	/**
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public DataSyncPayload getPayload() {
		return this.payload;
	}
	public void setPayload(DataSyncPayload payload) {
		this.payload = payload;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
