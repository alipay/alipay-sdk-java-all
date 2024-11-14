package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群操作节点选项组
 *
 * @author auto create
 * @since 1.0, 2023-11-09 19:22:08
 */
public class CrowdOperationNodeOptionGroup extends AlipayObject {

	private static final long serialVersionUID = 6494154189557783462L;

	/**
	 * 节点值编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 节点选项列表
	 */
	@ApiListField("node_option_list")
	@ApiField("crowd_operation_node_option")
	private List<CrowdOperationNodeOption> nodeOptionList;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<CrowdOperationNodeOption> getNodeOptionList() {
		return this.nodeOptionList;
	}
	public void setNodeOptionList(List<CrowdOperationNodeOption> nodeOptionList) {
		this.nodeOptionList = nodeOptionList;
	}

}
