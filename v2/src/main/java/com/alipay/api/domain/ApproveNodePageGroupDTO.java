package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审批流信息分组对象信息
 *
 * @author auto create
 * @since 1.0, 2022-12-12 19:24:41
 */
public class ApproveNodePageGroupDTO extends AlipayObject {

	private static final long serialVersionUID = 8223253569214417784L;

	/**
	 * 审批流操作groupId
	 */
	@ApiField("ant_process_group_puid")
	private String antProcessGroupPuid;

	/**
	 * 审批流分组列表
	 */
	@ApiListField("approve_node_group_list")
	@ApiField("node_operate_d_t_o")
	private List<NodeOperateDTO> approveNodeGroupList;

	public String getAntProcessGroupPuid() {
		return this.antProcessGroupPuid;
	}
	public void setAntProcessGroupPuid(String antProcessGroupPuid) {
		this.antProcessGroupPuid = antProcessGroupPuid;
	}

	public List<NodeOperateDTO> getApproveNodeGroupList() {
		return this.approveNodeGroupList;
	}
	public void setApproveNodeGroupList(List<NodeOperateDTO> approveNodeGroupList) {
		this.approveNodeGroupList = approveNodeGroupList;
	}

}
