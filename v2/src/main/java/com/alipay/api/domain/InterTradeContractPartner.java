package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约参与方
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:58:55
 */
public class InterTradeContractPartner extends AlipayObject {

	private static final long serialVersionUID = 8489944614726876223L;

	/**
	 * 参与方类型（包括：OU、NAME、PID、CID、UID、
MID）
	 */
	@ApiField("type")
	private String type;

	/**
	 * 根据参与类型来设置具体的值（如：type=NAME, value=网商银行；type=PID, value=2088xxxxxxxx）
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
