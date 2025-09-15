package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序信息
 *
 * @author auto create
 * @since 1.0, 2025-07-14 20:59:26
 */
public class AlipayDataDataserviceAdcampaignAppBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1364896498845442233L;

	/**
	 * 选择的创意交互动作类型需从接口获取，该字段类型从前置模版配置接口获取当前创意可提交的落地页类型 alipay.data.dataservice.adcampaign.actionandtemplate.query
	 */
	@ApiField("action_type")
	private String actionType;

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

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
