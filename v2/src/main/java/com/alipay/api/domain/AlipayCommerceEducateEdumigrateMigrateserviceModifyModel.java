package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费迁移工具接口
 *
 * @author auto create
 * @since 1.0, 2023-04-14 10:12:52
 */
public class AlipayCommerceEducateEdumigrateMigrateserviceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3861353479966189771L;

	/**
	 * 调用的服务名称 操作类型 + 具体服务名称
	 */
	@ApiField("handler")
	private String handler;

	/**
	 * 迁移服务的具体参数 JSON结构
	 */
	@ApiField("params")
	private String params;

	public String getHandler() {
		return this.handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

}
