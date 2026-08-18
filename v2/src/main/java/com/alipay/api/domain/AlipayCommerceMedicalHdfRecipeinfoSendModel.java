package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推送处方内容
 *
 * @author auto create
 * @since 1.0, 2026-07-30 11:12:56
 */
public class AlipayCommerceMedicalHdfRecipeinfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 7688556611548678492L;

	/**
	 * 分配给业务方的事件code 
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用名称
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 调用方自定义，标识自己业务
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 处方内容
	 */
	@ApiField("recipeinfo")
	private RecipeInfo recipeinfo;

	/**
	 * 业务方请求id，业务方要保证唯一，用于幂等性校验
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public RecipeInfo getRecipeinfo() {
		return this.recipeinfo;
	}
	public void setRecipeinfo(RecipeInfo recipeinfo) {
		this.recipeinfo = recipeinfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
