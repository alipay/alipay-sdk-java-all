package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流运单状态变更同步
 *
 * @author auto create
 * @since 1.0, 2021-05-11 17:09:21
 */
public class AlipayCommerceLogisticsWaybillStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8279646347412949571L;

	/**
	 * 接口调用方的渠道编码，由支付宝分配
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 物流运单状态同步的具体内容，根据不同的scene确定参数字段
	 */
	@ApiListField("data")
	@ApiField("param_info")
	private List<ParamInfo> data;

	/**
	 * 物流运单状态同步的场景编码，由支付宝定义
	 */
	@ApiField("scene")
	private String scene;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<ParamInfo> getData() {
		return this.data;
	}
	public void setData(List<ParamInfo> data) {
		this.data = data;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
