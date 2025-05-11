package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序信息
 *
 * @author auto create
 * @since 1.0, 2025-05-09 10:54:49
 */
public class AlipayDataDataserviceAdcampaignAppBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8863415486569759231L;

	/**
	 * 创意动作类型
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
