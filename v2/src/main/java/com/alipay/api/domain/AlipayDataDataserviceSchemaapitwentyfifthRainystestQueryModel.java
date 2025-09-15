package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试接口25_新建极速版
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:17
 */
public class AlipayDataDataserviceSchemaapitwentyfifthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7627896275943196687L;

	/**
	 * 数字类型的参数
	 */
	@ApiField("demo_num")
	private Long demoNum;

	public Long getDemoNum() {
		return this.demoNum;
	}
	public void setDemoNum(Long demoNum) {
		this.demoNum = demoNum;
	}

}
