package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板配置项：跳转至支付宝小程序页面的URL信息模型
 *
 * @author auto create
 * @since 1.0, 2023-07-03 13:55:01
 */
public class TemplateActionMiniAppUrlDTO extends AlipayObject {

	private static final long serialVersionUID = 2153499924985578194L;

	/**
	 * 行动点按钮是否在列表页展示，true 或 false，不填则默认false；

列表页可以配置展示最多2项小程序跳转行动点。
	 */
	@ApiField("display_on_list")
	private String displayOnList;

	/**
	 * 小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 指定小程序页面，不填则默认跳转至对应小程序首页
	 */
	@ApiField("mini_page_param")
	private String miniPageParam;

	/**
	 * query参数，商户自定义传参，填入值将以"query"为参数名提交至指定小程序页面
	 */
	@ApiField("mini_query_param")
	private String miniQueryParam;

	public String getDisplayOnList() {
		return this.displayOnList;
	}
	public void setDisplayOnList(String displayOnList) {
		this.displayOnList = displayOnList;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniPageParam() {
		return this.miniPageParam;
	}
	public void setMiniPageParam(String miniPageParam) {
		this.miniPageParam = miniPageParam;
	}

	public String getMiniQueryParam() {
		return this.miniQueryParam;
	}
	public void setMiniQueryParam(String miniQueryParam) {
		this.miniQueryParam = miniQueryParam;
	}

}
