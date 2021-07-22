package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 操作员基础信息
 *
 * @author auto create
 * @since 1.0, 2020-08-21 10:22:29
 */
public class OperatorBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 3794388245967925477L;

	/**
	 * 关联账号列表
	 */
	@ApiListField("accounts")
	@ApiField("operator_account_v_o")
	private List<OperatorAccountVO> accounts;

	/**
	 * 企业操作员业务类型。其它操作员没有该值
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 操作员联系方式列表
	 */
	@ApiListField("contacts")
	@ApiField("operator_contact_v_o")
	private List<OperatorContactVO> contacts;

	/**
	 * 操作员登录号。仅由登录号注册的操作员才有值。
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 操作员登录号类型。仅由登录号注册的操作员才有值。
枚举值参考LogonIdTypeEnum
1=手机
2=Email
3=企业操作员昵称方式
	 */
	@ApiField("logon_id_type")
	private String logonIdType;

	/**
	 * 操作员名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作员昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员所属主账号ID
	 */
	@ApiField("rel_ip_role_id")
	private String relIpRoleId;

	/**
	 * 操作员所属主账号类型。取值参考RelIpRoleTypeEnum。
1=支付宝商户客户customerId
2=支付宝商户PID
6=支付宝开放账号OID
7=蚂蚁通行证虚拟账号ID
	 */
	@ApiField("rel_ip_role_type")
	private String relIpRoleType;

	/**
	 * 操作员状态。枚举参考OperatorStatusEnum。
T=正常
W=未激活
B=已冻结
C=已删除
	 */
	@ApiField("status")
	private String status;

	/**
	 * 操作员所在租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 操作员类型
1=主操作员
2=子操作员
	 */
	@ApiField("type")
	private String type;

	public List<OperatorAccountVO> getAccounts() {
		return this.accounts;
	}
	public void setAccounts(List<OperatorAccountVO> accounts) {
		this.accounts = accounts;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<OperatorContactVO> getContacts() {
		return this.contacts;
	}
	public void setContacts(List<OperatorContactVO> contacts) {
		this.contacts = contacts;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getLogonIdType() {
		return this.logonIdType;
	}
	public void setLogonIdType(String logonIdType) {
		this.logonIdType = logonIdType;
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

	public String getRelIpRoleId() {
		return this.relIpRoleId;
	}
	public void setRelIpRoleId(String relIpRoleId) {
		this.relIpRoleId = relIpRoleId;
	}

	public String getRelIpRoleType() {
		return this.relIpRoleType;
	}
	public void setRelIpRoleType(String relIpRoleType) {
		this.relIpRoleType = relIpRoleType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
