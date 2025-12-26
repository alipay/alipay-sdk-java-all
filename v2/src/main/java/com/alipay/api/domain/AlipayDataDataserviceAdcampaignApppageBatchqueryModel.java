package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序页面信息
 *
 * @author auto create
 * @since 1.0, 2025-07-14 17:59:13
 */
public class AlipayDataDataserviceAdcampaignApppageBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3559592497581596324L;

	/**
	 * 选择的创意交互动作类型，该字段类型从前置模版配置接口获取当前创意可提交的落地页类型alipay.data.dataservice.adcampaign.actionandtemplate.query
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 小程序应用标识
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 商家tag
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
