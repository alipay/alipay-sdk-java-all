package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取签署地址
 *
 * @author auto create
 * @since 1.0, 2022-09-21 16:30:16
 */
public class AlipayEcoSignflowsUrlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6375843851194394463L;

	/**
	 * 流程id，通过 <a href ="https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create">创建电子合同签署流程</a>(alipay.eco.contract.signflows.create)接口获取。
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
