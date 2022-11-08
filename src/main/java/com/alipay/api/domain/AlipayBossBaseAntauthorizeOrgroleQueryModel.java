package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职能人员查询
 *
 * @author auto create
 * @since 1.0, 2022-02-23 21:16:38
 */
public class AlipayBossBaseAntauthorizeOrgroleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2488158663149655238L;

	/**
	 * 场景用户查询对象-组织视角
	 */
	@ApiField("query")
	private OrgRoleQuery query;

	/**
	 * 接口查询信息，包含调用接口的系统、人的域账号、调用类型
	 */
	@ApiField("query_info")
	private QueryInfo queryInfo;

	public OrgRoleQuery getQuery() {
		return this.query;
	}
	public void setQuery(OrgRoleQuery query) {
		this.query = query;
	}

	public QueryInfo getQueryInfo() {
		return this.queryInfo;
	}
	public void setQueryInfo(QueryInfo queryInfo) {
		this.queryInfo = queryInfo;
	}

}
