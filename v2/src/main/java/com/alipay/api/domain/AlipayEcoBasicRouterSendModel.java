package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开发生态基础平台域内路由接口
 *
 * @author auto create
 * @since 1.0, 2018-01-26 13:50:04
 */
public class AlipayEcoBasicRouterSendModel extends AlipayObject {

	private static final long serialVersionUID = 7773565364763422146L;

	/**
	 * 路由数据
	 */
	@ApiField("input")
	private String input;

	/**
	 * 路由任务名
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * 本次调用唯一id
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getInput() {
		return this.input;
	}
	public void setInput(String input) {
		this.input = input;
	}

	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
