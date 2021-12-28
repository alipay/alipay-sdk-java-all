package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口返回对象
 *
 * @author auto create
 * @since 1.0, 2018-10-25 11:00:24
 */
public class IcrowdUseResp extends AlipayObject {

	private static final long serialVersionUID = 3842678454839361282L;

	/**
	 * 方法ID
	 */
	@ApiField("method_id")
	private String methodId;

	/**
	 * 方法返回结果
	 */
	@ApiField("ret_val")
	private String retVal;

	public String getMethodId() {
		return this.methodId;
	}
	public void setMethodId(String methodId) {
		this.methodId = methodId;
	}

	public String getRetVal() {
		return this.retVal;
	}
	public void setRetVal(String retVal) {
		this.retVal = retVal;
	}

}
