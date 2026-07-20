package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流同城无人车运营信息同步
 *
 * @author auto create
 * @since 1.0, 2026-03-31 16:52:44
 */
public class AlipayCommerceLogisticsRoboOperationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4698447865286373338L;

	/**
	 * 接口调用方的渠道编码，由支付宝
分配
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
	 * 场景编码
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
