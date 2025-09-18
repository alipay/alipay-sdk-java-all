package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试接口27_新建经典版_回归验证
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:17
 */
public class AlipayDataDataserviceSchematwentyseventhRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1267789196682593361L;

	/**
	 * 测试数据，无需关注
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
