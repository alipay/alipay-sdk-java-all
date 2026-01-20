package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC货柜交易初始化回调
 *
 * @author auto create
 * @since 1.0, 2025-01-21 15:30:18
 */
public class AlipayCommerceCityfacilitatorIotbspHgnfcSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1553772197636353834L;

	/**
	 * 行业openapi同步信息，具体为初始化信息、注册信息、设备信息等
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 0b446a3f17168015507584370e03f4
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 场景值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 业务标识处理id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
