package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询角色信息下的人员信息入参
 *
 * @author auto create
 * @since 1.0, 2024-04-11 16:35:42
 */
public class OrgRoleInfoQuery extends AlipayObject {

	private static final long serialVersionUID = 2541829267844677862L;

	/**
	 * 根据当前过滤条件筛选查询角色中的人员信息.
BU_LINE对应业务线
DEPT对应部门
OU对应OU
ORG_TREE 对应自定义树类型
	 */
	@ApiListField("node_types")
	@ApiField("string")
	private List<String> nodeTypes;

	/**
	 * 根绝角色编码集合查询蚁符相关人员信息
	 */
	@ApiListField("role_codes")
	@ApiField("string")
	private List<String> roleCodes;

	public List<String> getNodeTypes() {
		return this.nodeTypes;
	}
	public void setNodeTypes(List<String> nodeTypes) {
		this.nodeTypes = nodeTypes;
	}

	public List<String> getRoleCodes() {
		return this.roleCodes;
	}
	public void setRoleCodes(List<String> roleCodes) {
		this.roleCodes = roleCodes;
	}

}
