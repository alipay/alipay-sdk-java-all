package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 包含操作员基本信息、部门、门店信息
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:53:42
 */
public class OperatorInfoModel extends AlipayObject {

	private static final long serialVersionUID = 8596814823853434652L;

	/**
	 * customerId
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 邮件
	 */
	@ApiField("email")
	private String email;

	/**
	 * 部门ID
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 部门树
	 */
	@ApiField("job_tree")
	private String jobTree;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作员姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作员别名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 角色名字
	 */
	@ApiField("role_name")
	private String roleName;

	/**
	 * 门店列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * T
	 */
	@ApiField("status")
	private String status;

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTree() {
		return this.jobTree;
	}
	public void setJobTree(String jobTree) {
		this.jobTree = jobTree;
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

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
