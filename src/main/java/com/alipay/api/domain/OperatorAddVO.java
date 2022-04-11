package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁操作员添加参数
 *
 * @author auto create
 * @since 1.0, 2020-08-24 15:02:23
 */
public class OperatorAddVO extends AlipayObject {

	private static final long serialVersionUID = 4695124916113592164L;

	/**
	 * 企业版操作员业务类型。其它类型操作员无需填写
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
	 * 操作员登录号。如果不需要注册登录号则无需填写。
该登录号与已有支付宝账号登录号不可以重复。
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 操作员登录号类型。如果不需要注册登录号则无需填写。
枚举值参考LogonIdTypeEnum
范围如下：
1=手机号
2=Email
3=企业操作员昵称方式
	 */
	@ApiField("logon_id_type")
	private String logonIdType;

	/**
	 * 操作员登录密码（密文）。如果不需要注册登录号则不需要填写。
	 */
	@ApiField("logon_password")
	private String logonPassword;

	/**
	 * 操作员所属主账号ID，ID类型由main_ip_role_type定义
	 */
	@ApiField("main_ip_role_id")
	private String mainIpRoleId;

	/**
	 * 操作员所属主账号类型，枚举值参考RelIpRoleTypeEnum，取值范围：
1=支付宝商户客户customerId
2=支付宝商户PID
6=支付宝开放账号OID
7=蚂蚁通行证虚拟账号ID
	 */
	@ApiField("main_ip_role_type")
	private String mainIpRoleType;

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
	 * 指定租户ID，新增值需联系蚂蚁操作员operator团队人工处理
	 */
	@ApiField("tenant_id")
	private String tenantId;

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

	public String getLogonPassword() {
		return this.logonPassword;
	}
	public void setLogonPassword(String logonPassword) {
		this.logonPassword = logonPassword;
	}

	public String getMainIpRoleId() {
		return this.mainIpRoleId;
	}
	public void setMainIpRoleId(String mainIpRoleId) {
		this.mainIpRoleId = mainIpRoleId;
	}

	public String getMainIpRoleType() {
		return this.mainIpRoleType;
	}
	public void setMainIpRoleType(String mainIpRoleType) {
		this.mainIpRoleType = mainIpRoleType;
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

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
