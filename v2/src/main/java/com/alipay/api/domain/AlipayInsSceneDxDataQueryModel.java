package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * dx数据服务
 *
 * @author auto create
 * @since 1.0, 2020-02-25 15:36:33
 */
public class AlipayInsSceneDxDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4823899364452775785L;

	/**
	 * dx服务名
	 */
	@ApiField("dx_name")
	private String dxName;

	/**
	 * 请求参数
	 */
	@ApiField("param")
	private String param;

	public String getDxName() {
		return this.dxName;
	}
	public void setDxName(String dxName) {
		this.dxName = dxName;
	}

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

}
