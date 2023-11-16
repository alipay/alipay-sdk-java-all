package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * max遥感工作台预测结果获取服务
 *
 * @author auto create
 * @since 1.0, 2023-01-05 14:41:31
 */
public class AnttechAiCvRsResultGetModel extends AlipayObject {

	private static final long serialVersionUID = 8781555729242713794L;

	/**
	 * 要查询预测数据的围栏经纬度信息
	 */
	@ApiField("geo")
	private String geo;

	public String getGeo() {
		return this.geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}

}
