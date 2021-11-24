package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量绑定部门员工关系
 *
 * @author auto create
 * @since 1.0, 2021-10-26 12:01:31
 */
public class KoubeiMerchantDepartmentBatchBindModel extends AlipayObject {

	private static final long serialVersionUID = 5324798494141426486L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 部门类型，5为非叶子节点部门即商户创建的部门；6为叶子节点部门即门店，门店在业务上被当成是类型为6的部门
	 */
	@ApiField("dept_type")
	private String deptType;

	/**
	 * 操作员基本信息列表
	 */
	@ApiListField("operator_list")
	@ApiField("simple_operator_model")
	private List<SimpleOperatorModel> operatorList;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptType() {
		return this.deptType;
	}
	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	public List<SimpleOperatorModel> getOperatorList() {
		return this.operatorList;
	}
	public void setOperatorList(List<SimpleOperatorModel> operatorList) {
		this.operatorList = operatorList;
	}

}
