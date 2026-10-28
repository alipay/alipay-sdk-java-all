package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-20 14:52:58
 */
public class SaleForceCompetitorDTO extends AlipayObject {

	private static final long serialVersionUID = 5191456456237741531L;

	/**
	 * null
	 */
	@ApiListField("competitor")
	@ApiField("string")
	private List<String> competitor;

	/**
	 * 竞对数据库分类文本，取自Salesforce竞对记录的业务配置，例如KV；该配置可扩展，海图按文本保存，不限定固定枚举值。
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
