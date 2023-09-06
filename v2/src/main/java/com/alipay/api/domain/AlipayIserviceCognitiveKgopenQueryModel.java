package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识图谱在线服务统一接口
 *
 * @author auto create
 * @since 1.0, 2019-11-19 23:50:35
 */
public class AlipayIserviceCognitiveKgopenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8519638294346391847L;

	/**
	 * 所属在线服务的编码
	 */
	@ApiField("online_service_code")
	private String onlineServiceCode;

	/**
	 * 查询参数
	 */
	@ApiListField("params")
	@ApiField("map_parameter")
	private List<MapParameter> params;

	public String getOnlineServiceCode() {
		return this.onlineServiceCode;
	}
	public void setOnlineServiceCode(String onlineServiceCode) {
		this.onlineServiceCode = onlineServiceCode;
	}

	public List<MapParameter> getParams() {
		return this.params;
	}
	public void setParams(List<MapParameter> params) {
		this.params = params;
	}

}
