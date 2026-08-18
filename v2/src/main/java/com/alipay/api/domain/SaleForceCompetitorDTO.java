package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-17 21:07:49
 */
public class SaleForceCompetitorDTO extends AlipayObject {

	private static final long serialVersionUID = 2484423782831575864L;

	/**
	 * null
	 */
	@ApiListField("competitor")
	@ApiField("string")
	private List<String> competitor;

	/**
	 * 数据库类型
	 */
	@ApiField("db_type")
	private String dbType;

	public List<String> getCompetitor() {
		return this.competitor;
	}
	public void setCompetitor(List<String> competitor) {
		this.competitor = competitor;
	}

	public String getDbType() {
		return this.dbType;
	}
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

}
