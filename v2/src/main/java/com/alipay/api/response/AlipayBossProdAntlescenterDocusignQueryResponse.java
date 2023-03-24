package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecipientSignStatusResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlescenter.docusign.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:16:46
 */
public class AlipayBossProdAntlescenterDocusignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2497987414987566752L;

	/** 
	 * 签署任务状态和多方签署人细分状态
	 */
	@ApiListField("recipient_sign_status_result_list")
	@ApiField("recipient_sign_status_result")
	private List<RecipientSignStatusResult> recipientSignStatusResultList;

	public void setRecipientSignStatusResultList(List<RecipientSignStatusResult> recipientSignStatusResultList) {
		this.recipientSignStatusResultList = recipientSignStatusResultList;
	}
	public List<RecipientSignStatusResult> getRecipientSignStatusResultList( ) {
		return this.recipientSignStatusResultList;
	}

}
