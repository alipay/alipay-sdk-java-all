package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台页面接口测试（老上下文）
 *
 * @author auto create
 * @since 1.0, 2020-03-25 16:45:24
 */
public class AlipayOpenPageOldcontextTransferModel extends AlipayObject {

	private static final long serialVersionUID = 7864635337842236366L;

	/**
	 * 参数1
	 */
	@ApiField("param_one")
	private String paramOne;

	/**
	 * 参数3
	 */
	@ApiField("param_three")
	private String paramThree;

	/**
	 * 参数2
	 */
	@ApiField("param_two")
	private String paramTwo;

	public String getParamOne() {
		return this.paramOne;
	}
	public void setParamOne(String paramOne) {
		this.paramOne = paramOne;
	}

	public String getParamThree() {
		return this.paramThree;
	}
	public void setParamThree(String paramThree) {
		this.paramThree = paramThree;
	}

	public String getParamTwo() {
		return this.paramTwo;
	}
	public void setParamTwo(String paramTwo) {
		this.paramTwo = paramTwo;
	}

}
