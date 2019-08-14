package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物业授权授权信息发送
 *
 * @author auto create
 * @since 1.0, 2019-03-20 15:17:55
 */
public class AlipayOpenAppPropertyAuthSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6364443533989429755L;

	/**
	 * 需要同步的小区认证信息，批量操作时，事务控制，一条数据失败，整个事务回滚。
	 */
	@ApiListField("auth_info")
	@ApiField("property_auth_info")
	private List<PropertyAuthInfo> authInfo;

	/**
	 * 认证信息同步操作类型：PUT(新增)、RESET(修改)、REMOVE(删除)。
	 */
	@ApiField("operator")
	private String operator;

	public List<PropertyAuthInfo> getAuthInfo() {
		return this.authInfo;
	}
	public void setAuthInfo(List<PropertyAuthInfo> authInfo) {
		this.authInfo = authInfo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
