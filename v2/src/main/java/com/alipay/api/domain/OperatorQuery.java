package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁操作员查询参数
 *
 * @author auto create
 * @since 1.0, 2023-03-29 15:46:12
 */
public class OperatorQuery extends AlipayObject {

	private static final long serialVersionUID = 2213657268475187391L;

	/**
	 * 查询操作员的唯一ID。类型由id_type决定
	 */
	@ApiField("id")
	private String id;

	/**
	 * id参数的类型。取值如下：
OPERATOR_ID=id填操作员ID
USER_ID=id填支付宝登录userId
LOGON_ID=id填操作员的登录号
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 操作员登录号类型。id_type为LOGON_ID时必填。
枚举值参考LogonIdTypeEnum
范围如下： 
1=手机号
2=Email
3=企业操作员昵称方式
	 */
	@ApiField("logon_id_type")
	private String logonIdType;

	/**
	 * 操作员所属主账号ID，ID类型由main_ip_role_type定义
	 */
	@ApiField("main_ip_role_id")
	private String mainIpRoleId;

	/**
	 * 操作员所属主账号类型，枚举值参考RelIpRoleTypeEnum，取值范围： 1=支付宝商户客户customerId 2=支付宝商户PID 6=支付宝开放账号OID 7=蚂蚁通行证虚拟账号ID
	 */
	@ApiField("main_ip_role_type")
	private String mainIpRoleType;

	/**
	 * 查询操作员的OPENID。类型由id_type决定，当id_type为 OPEN_ID 时，使用 open_id 的值。
	 */
	@ApiField("open_id")
	private String openId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getLogonIdType() {
		return this.logonIdType;
	}
	public void setLogonIdType(String logonIdType) {
		this.logonIdType = logonIdType;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
