package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源消耗的业务标记
 *
 * @author auto create
 * @since 1.0, 2020-08-12 16:37:52
 */
public class AbilityResourceBizMark extends AlipayObject {

	private static final long serialVersionUID = 8397779277789358214L;

	/**
	 * isv的业务code,商户可以用户这个code和商户进行数据核对
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * executionTime
	 */
	@ApiField("execution_time")
	private String executionTime;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getExecutionTime() {
		return this.executionTime;
	}
	public void setExecutionTime(String executionTime) {
		this.executionTime = executionTime;
	}

}
