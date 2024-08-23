package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupOptionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupoption.assistant.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-13 16:37:06
 */
public class AlipayMerchantGroupGroupoptionAssistantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3375266221169752478L;

	/** 
	 * 群组选项列表
	 */
	@ApiListField("group_options")
	@ApiField("group_option_v_o")
	private List<GroupOptionVO> groupOptions;

	public void setGroupOptions(List<GroupOptionVO> groupOptions) {
		this.groupOptions = groupOptions;
	}
	public List<GroupOptionVO> getGroupOptions( ) {
		return this.groupOptions;
	}

}
