package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 森林碳账户数据明细数据结构
 *
 * @author auto create
 * @since 1.0, 2021-11-08 15:29:52
 */
public class CarbonTranDetail extends AlipayObject {

	private static final long serialVersionUID = 1487127319991414314L;

	/**
	 * 绿色场景类型
	 */
	@ApiField("carbon_type")
	private String carbonType;

	/**
	 * 能量值
	 */
	@ApiField("carbon_value")
	private String carbonValue;

	public String getCarbonType() {
		return this.carbonType;
	}
	public void setCarbonType(String carbonType) {
		this.carbonType = carbonType;
	}

	public String getCarbonValue() {
		return this.carbonValue;
	}
	public void setCarbonValue(String carbonValue) {
		this.carbonValue = carbonValue;
	}

}
