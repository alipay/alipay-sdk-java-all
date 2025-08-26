package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 角色下人员信息查询
 *
 * @author auto create
 * @since 1.0, 2024-11-08 15:30:46
 */
public class AlipayBossBaseAntauthorizeRoleuserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1618732794264675898L;

	/**
	 * 查询职能角色人员列表入参
	 */
	@ApiField("query")
	private OrgRoleInfoQuery query;

	/**
	 * 接口查询信息，包含调用接口的系统、人的域账号、调用类型
	 */
	@ApiField("query_info")
	private QueryInfo queryInfo;

	public OrgRoleInfoQuery getQuery() {
		return this.query;
	}
	public void setQuery(OrgRoleInfoQuery query) {
		this.query = query;
	}

	public QueryInfo getQueryInfo() {
		return this.queryInfo;
	}
	public void setQueryInfo(QueryInfo queryInfo) {
		this.queryInfo = queryInfo;
	}

}
