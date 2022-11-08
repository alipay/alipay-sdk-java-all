package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsOpenPolicyDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.tradeevent.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 17:06:05
 */
public class AlipayInsSceneEcommerceTradeeventSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5384455652935275762L;

	/** 
	 * 保单摘要数据
	 */
	@ApiListField("policy_list")
	@ApiField("ins_open_policy_digest_d_t_o")
	private List<InsOpenPolicyDigestDTO> policyList;

	public void setPolicyList(List<InsOpenPolicyDigestDTO> policyList) {
		this.policyList = policyList;
	}
	public List<InsOpenPolicyDigestDTO> getPolicyList( ) {
		return this.policyList;
	}

}
