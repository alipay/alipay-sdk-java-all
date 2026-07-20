package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝物流智能取件通知预咨询
 *
 * @author auto create
 * @since 1.0, 2026-07-01 20:17:55
 */
public class AlipayCommerceLogisticsWaybillIntelinoticeConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5377356189698389822L;

	/**
	 * 接口调用方的渠道编码
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * null
	 */
	@ApiListField("data")
	@ApiField("logistics_s_p_i_param_info")
	private List<LogisticsSPIParamInfo> data;

	/**
	 * 场景编码，由支付宝定义
	 */
	@ApiField("scene")
	private String scene;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<LogisticsSPIParamInfo> getData() {
		return this.data;
	}
	public void setData(List<LogisticsSPIParamInfo> data) {
		this.data = data;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
