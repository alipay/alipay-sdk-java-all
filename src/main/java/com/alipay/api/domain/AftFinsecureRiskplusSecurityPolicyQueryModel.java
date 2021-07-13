package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 策略咨询服务输出
 *
 * @author auto create
 * @since 1.0, 2018-12-18 17:57:00
 */
public class AftFinsecureRiskplusSecurityPolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4895366919972144317L;

	/**
	 * 蚁盾事件信息
	 */
	@ApiField("event_info")
	private EventInfo eventInfo;

	/**
	 * 产品集群ID，默认填写示例值
	 */
	@ApiField("product_instance_id")
	private String productInstanceId;

	public EventInfo getEventInfo() {
		return this.eventInfo;
	}
	public void setEventInfo(EventInfo eventInfo) {
		this.eventInfo = eventInfo;
	}

	public String getProductInstanceId() {
		return this.productInstanceId;
	}
	public void setProductInstanceId(String productInstanceId) {
		this.productInstanceId = productInstanceId;
	}

}
