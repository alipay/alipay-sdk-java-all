package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业财受理详情查询结果
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:59:02
 */
public class GFAOpenAPIDetailQueryResult extends AlipayObject {

	private static final long serialVersionUID = 4611585952815597838L;

	/**
	 * 业财受理单基础模型
	 */
	@ApiListField("acceptance_list")
	@ApiField("g_f_a_open_a_p_i_base_acceptance")
	private List<GFAOpenAPIBaseAcceptance> acceptanceList;

	/**
	 * 业财受理指令
	 */
	@ApiListField("command_list")
	@ApiField("g_f_a_open_a_p_i_command")
	private List<GFAOpenAPICommand> commandList;

	public List<GFAOpenAPIBaseAcceptance> getAcceptanceList() {
		return this.acceptanceList;
	}
	public void setAcceptanceList(List<GFAOpenAPIBaseAcceptance> acceptanceList) {
		this.acceptanceList = acceptanceList;
	}

	public List<GFAOpenAPICommand> getCommandList() {
		return this.commandList;
	}
	public void setCommandList(List<GFAOpenAPICommand> commandList) {
		this.commandList = commandList;
	}

}
