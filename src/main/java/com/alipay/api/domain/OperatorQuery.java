package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁操作员查询参数
 *
 * @author auto create
 * @since 1.0, 2022-05-17 19:54:48
 */
public class OperatorQuery extends AlipayObject {

	private static final long serialVersionUID = 2746273164198956627L;

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

}
