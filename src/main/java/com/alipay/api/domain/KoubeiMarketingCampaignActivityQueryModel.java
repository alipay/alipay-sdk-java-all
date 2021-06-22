package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动详情查询
 *
 * @author auto create
 * @since 1.0, 2017-11-03 14:54:15
 */
public class KoubeiMarketingCampaignActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1352578396245364275L;

	/**
	 * 活动id。通过 <a href="https://opendocs.alipay.com/apis/api_5/koubei.marketing.campaign.activity.create">koubei.marketing.campaign.activity.create</a>(活动创建接口)获取。
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 操作人id，必须和operator_type配对出现，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型，不填默认为 MER（外部商户）。支持枚举值如下：
* MER：外部商户。
* MER_OPERATOR：外部商户操作员。
* PROVIDER：外部服务商。
* PROVIDER_STAFF：外部服务商员工。
	 */
	@ApiField("operator_type")
	private String operatorType;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

}
