package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 科室列表
 *
 * @author auto create
 * @since 1.0, 2026-03-25 14:37:44
 */
public class DepartmentInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3657241864223111535L;

	/**
	 * null
	 */
	@ApiListField("child_department_list")
	@ApiField("sub_department_info_v_o")
	private List<SubDepartmentInfoVO> childDepartmentList;

	/**
	 * 科室医生数量
	 */
	@ApiField("depart_doctor_num")
	private String departDoctorNum;

	/**
	 * 科室编码
	 */
	@ApiField("depart_id")
	private String departId;

	/**
	 * 科室logo
	 */
	@ApiField("depart_logo")
	private String departLogo;

	/**
	 * 科室名称
	 */
	@ApiField("depart_name")
	private String departName;

	/**
	 * 父级科室ID
	 */
	@ApiField("parent_depart_id")
	private String parentDepartId;

	public List<SubDepartmentInfoVO> getChildDepartmentList() {
		return this.childDepartmentList;
	}
	public void setChildDepartmentList(List<SubDepartmentInfoVO> childDepartmentList) {
		this.childDepartmentList = childDepartmentList;
	}

	public String getDepartDoctorNum() {
		return this.departDoctorNum;
	}
	public void setDepartDoctorNum(String departDoctorNum) {
		this.departDoctorNum = departDoctorNum;
	}

	public String getDepartId() {
		return this.departId;
	}
	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getDepartLogo() {
		return this.departLogo;
	}
	public void setDepartLogo(String departLogo) {
		this.departLogo = departLogo;
	}

	public String getDepartName() {
		return this.departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getParentDepartId() {
		return this.parentDepartId;
	}
	public void setParentDepartId(String parentDepartId) {
		this.parentDepartId = parentDepartId;
	}

}
