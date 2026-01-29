package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视频会议通用处理接口
 *
 * @author auto create
 * @since 1.0, 2026-01-28 16:47:42
 */
public class AlipayCommerceMedicalHdfrtcConferenceAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 4581883819773843883L;

	/**
	 * 请求参数
	 */
	@ApiField("request_data")
	private String requestData;

	/**
	 * 查询类型
	 */
	@ApiField("type")
	private String type;

	public String getRequestData() {
		return this.requestData;
	}
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
