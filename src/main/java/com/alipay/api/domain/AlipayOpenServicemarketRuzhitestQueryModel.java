package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 如之openApi开发熟悉流程
 *
 * @author auto create
 * @since 1.0, 2016-04-05 17:10:33
 */
public class AlipayOpenServicemarketRuzhitestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5872831315686394131L;

	/**
	 * app在开发平台的name
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 入参数据结构描述（RuzhiTest）
	 */
	@ApiField("peoples")
	private RuzhiTest peoples;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public RuzhiTest getPeoples() {
		return this.peoples;
	}
	public void setPeoples(RuzhiTest peoples) {
		this.peoples = peoples;
	}

}
