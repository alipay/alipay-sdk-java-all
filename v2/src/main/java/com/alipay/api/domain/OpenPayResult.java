package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务支付结果
 *
 * @author auto create
 * @since 1.0, 2025-08-18 16:36:16
 */
public class OpenPayResult extends AlipayObject {

	private static final long serialVersionUID = 6556293277945514255L;

	/**
	 * 支付结构模块数组
	 */
	@ApiListField("modules")
	@ApiField("open_pay_result_module")
	private List<OpenPayResultModule> modules;

	public List<OpenPayResultModule> getModules() {
		return this.modules;
	}
	public void setModules(List<OpenPayResultModule> modules) {
		this.modules = modules;
	}

}
