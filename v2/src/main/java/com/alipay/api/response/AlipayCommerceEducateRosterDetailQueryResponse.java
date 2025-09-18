package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduDepartmentNode;
import com.alipay.api.domain.EduNodeInfo;
import com.alipay.api.domain.EduPlaceInfo;
import com.alipay.api.domain.EduRoleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.roster.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 20:07:27
 */
public class AlipayCommerceEducateRosterDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6781614736728782461L;

	/** 
	 * 花名册是否绑定支付宝
	 */
	@ApiField("bind_status")
	private Boolean bindStatus;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件号尾号
	 */
	@ApiField("cert_no_tail")
	private String certNoTail;

	/** 
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 部门信息
	 */
	@ApiListField("department_info")
	@ApiField("edu_department_node")
	private List<EduDepartmentNode> departmentInfo;

	/** 
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 学工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/** 
	 * 过期失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

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
	 * 所属组织节点列表
	 */
	@ApiListField("node_info_list")
	@ApiField("edu_node_info")
	private List<EduNodeInfo> nodeInfoList;

	/** 
	 * 所属位置列表
	 */
	@ApiListField("place_info_list")
	@ApiField("edu_place_info")
	private List<EduPlaceInfo> placeInfoList;

	/** 
	 * 所属角色列表
	 */
	@ApiListField("role_info_list")
	@ApiField("edu_role_info")
	private List<EduRoleInfo> roleInfoList;

	/** 
	 * 角色名称，可自定义，未自定义则使用默认值
	 */
	@ApiField("role_name")
	private String roleName;

	/** 
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/** 
	 * 花名册ID
	 */
	@ApiField("roster_id")
	private String rosterId;

	public void setBindStatus(Boolean bindStatus) {
		this.bindStatus = bindStatus;
	}
	public Boolean getBindStatus( ) {
		return this.bindStatus;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertNoTail(String certNoTail) {
		this.certNoTail = certNoTail;
	}
	public String getCertNoTail( ) {
		return this.certNoTail;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setDepartmentInfo(List<EduDepartmentNode> departmentInfo) {
		this.departmentInfo = departmentInfo;
	}
	public List<EduDepartmentNode> getDepartmentInfo( ) {
		return this.departmentInfo;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeNo( ) {
		return this.employeeNo;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstName( ) {
		return this.instName;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setNodeInfoList(List<EduNodeInfo> nodeInfoList) {
		this.nodeInfoList = nodeInfoList;
	}
	public List<EduNodeInfo> getNodeInfoList( ) {
		return this.nodeInfoList;
	}

	public void setPlaceInfoList(List<EduPlaceInfo> placeInfoList) {
		this.placeInfoList = placeInfoList;
	}
	public List<EduPlaceInfo> getPlaceInfoList( ) {
		return this.placeInfoList;
	}

	public void setRoleInfoList(List<EduRoleInfo> roleInfoList) {
		this.roleInfoList = roleInfoList;
	}
	public List<EduRoleInfo> getRoleInfoList( ) {
		return this.roleInfoList;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleName( ) {
		return this.roleName;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleType( ) {
		return this.roleType;
	}

	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}
	public String getRosterId( ) {
		return this.rosterId;
	}

}
