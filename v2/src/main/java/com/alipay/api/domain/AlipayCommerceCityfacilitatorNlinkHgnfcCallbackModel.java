package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC货柜行业异步通信回调
 *
 * @author auto create
 * @since 1.0, 2024-12-31 22:08:18
 */
public class AlipayCommerceCityfacilitatorNlinkHgnfcCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 6137378926222937696L;

	/**
	 * 业务服务标识对应的参数
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 设备端生成的碰请求标识
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 业务标识处理id
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
