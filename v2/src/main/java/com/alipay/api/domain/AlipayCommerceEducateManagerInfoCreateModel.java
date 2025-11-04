package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建管理员
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:59:47
 */
public class AlipayCommerceEducateManagerInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7129982585777192564L;

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
	 * 管理的组织节点ID列表
	 */
	@ApiListField("node_id_list")
	@ApiField("string")
	private List<String> nodeIdList;

	/**
	 * 管理的位置ID列表
	 */
	@ApiListField("place_id_list")
	@ApiField("string")
	private List<String> placeIdList;

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

	public List<String> getNodeIdList() {
		return this.nodeIdList;
	}
	public void setNodeIdList(List<String> nodeIdList) {
		this.nodeIdList = nodeIdList;
	}

	public List<String> getPlaceIdList() {
		return this.placeIdList;
	}
	public void setPlaceIdList(List<String> placeIdList) {
		this.placeIdList = placeIdList;
	}

}
