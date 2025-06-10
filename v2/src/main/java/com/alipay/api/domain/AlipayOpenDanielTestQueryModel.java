package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 丹尼的测试接口3432
 *
 * @author auto create
 * @since 1.0, 2023-11-02 21:34:49
 */
public class AlipayOpenDanielTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6757982944529176196L;

	/**
	 * 1
	 */
	@ApiField("body_str")
	private String bodyStr;

	/**
	 * 12
	 */
	@ApiField("strig_dtest")
	private String strigDtest;

	public String getBodyStr() {
		return this.bodyStr;
	}
	public void setBodyStr(String bodyStr) {
		this.bodyStr = bodyStr;
	}

	public String getStrigDtest() {
		return this.strigDtest;
	}
	public void setStrigDtest(String strigDtest) {
		this.strigDtest = strigDtest;
	}

}
