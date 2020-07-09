package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取签署地址
 *
 * @author auto create
 * @since 1.0, 2020-05-06 11:46:41
 */
public class AlipayEcoSignflowsUrlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2645513339936445872L;

	/**
	 * 流程id
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 创建流程时指定企业唯一标识
	 */
	@ApiField("org_third_party_user_id")
	private String orgThirdPartyUserId;

	/**
	 * 创建流程时指定个人唯一标识
	 */
	@ApiField("third_party_user_id")
	private String thirdPartyUserId;

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getOrgThirdPartyUserId() {
		return this.orgThirdPartyUserId;
	}
	public void setOrgThirdPartyUserId(String orgThirdPartyUserId) {
		this.orgThirdPartyUserId = orgThirdPartyUserId;
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}
	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
	}

}
