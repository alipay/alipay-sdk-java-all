package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流金融统一route沙箱环境接口
 *
 * @author auto create
 * @since 1.0, 2021-10-11 17:11:38
 */
public class AnttechBlockchainFinanceMylogisticfinsandboxMessagePublishModel extends AlipayObject {

	private static final long serialVersionUID = 6173575865117862418L;

	/**
	 * 路由方法的参数
	 */
	@ApiField("data")
	private String data;

	/**
	 * 方法路由
	 */
	@ApiField("method_name")
	private String methodName;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getMethodName() {
		return this.methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}
