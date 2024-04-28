package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序启动模型
 *
 * @author auto create
 * @since 1.0, 2019-05-10 10:00:33
 */
public class SingleStartAppVO extends AlipayObject {

	private static final long serialVersionUID = 6437568646776212691L;

	/**
	 * 小程序启动协议
	 */
	@ApiField("protocol")
	private String protocol;

	/**
	 * 按照标准定义的startAppModel
	 */
	@ApiField("start_app_model")
	private String startAppModel;

	public String getProtocol() {
		return this.protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getStartAppModel() {
		return this.startAppModel;
	}
	public void setStartAppModel(String startAppModel) {
		this.startAppModel = startAppModel;
	}

}
