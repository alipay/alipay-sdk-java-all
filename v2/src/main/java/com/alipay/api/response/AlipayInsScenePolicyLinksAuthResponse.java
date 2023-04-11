package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsPolicyLinkDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.policy.links.auth response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:59:58
 */
public class AlipayInsScenePolicyLinksAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 7877228643456235671L;

	/** 
	 * 保单链接列表
	 */
	@ApiListField("policy_links")
	@ApiField("ins_policy_link_d_t_o")
	private List<InsPolicyLinkDTO> policyLinks;

	public void setPolicyLinks(List<InsPolicyLinkDTO> policyLinks) {
		this.policyLinks = policyLinks;
	}
	public List<InsPolicyLinkDTO> getPolicyLinks( ) {
		return this.policyLinks;
	}

}
