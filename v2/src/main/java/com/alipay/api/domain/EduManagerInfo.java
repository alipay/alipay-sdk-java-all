package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 管理员信息
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:59:47
 */
public class EduManagerInfo extends AlipayObject {

	private static final long serialVersionUID = 4586818835559616876L;

	/**
	 * 学工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 管理员ID
	 */
	@ApiField("manager_id")
	private String managerId;

	/**
	 * 管理员类型
	 */
	@ApiField("manager_type")
	private String managerType;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 管理的组织节点列表
	 */
	@ApiListField("node_list")
	@ApiField("edu_node_info")
	private List<EduNodeInfo> nodeList;

	/**
	 * 管理的位置列表
	 */
	@ApiListField("place_list")
	@ApiField("edu_place_info")
	private List<EduPlaceInfo> placeList;

	/**
	 * 花名册ID
	 */
	@ApiField("roster_id")
	private String rosterId;

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getManagerId() {
		return this.managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getManagerType() {
		return this.managerType;
	}
	public void setManagerType(String managerType) {
		this.managerType = managerType;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<EduNodeInfo> getNodeList() {
		return this.nodeList;
	}
	public void setNodeList(List<EduNodeInfo> nodeList) {
		this.nodeList = nodeList;
	}

	public List<EduPlaceInfo> getPlaceList() {
		return this.placeList;
	}
	public void setPlaceList(List<EduPlaceInfo> placeList) {
		this.placeList = placeList;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

}
