package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天气预警关闭接口
 *
 * @author auto create
 * @since 1.0, 2023-12-26 11:04:54
 */
public class AlipayEbppIndustryGovWeatheralarmCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4579978922785835113L;

	/**
	 * 天气预警唯一id
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 各气象局来源平台，由支付宝政务分配
	 */
	@ApiField("source")
	private String source;

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
