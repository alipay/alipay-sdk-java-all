package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联接网络学籍数据查询接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:19
 */
public class AlipayDataDataserviceZdatafrontStudentstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2592496417457785435L;

	/**
	 * 如果cacheInterval<=0,就直接从外部获取数据；
如果cacheInterval>0,就先判断cache中的数据是否过期，如果没有过期就返回cache中的数据，如果过期再从外部获取数据并刷新cache，然后返回数据。
单位：秒
	 */
	@ApiField("cache_interval")
	private Long cacheInterval;

	/**
	 * 查询的入参
	 */
	@ApiField("query_conditions")
	private String queryConditions;

	public Long getCacheInterval() {
		return this.cacheInterval;
	}
	public void setCacheInterval(Long cacheInterval) {
		this.cacheInterval = cacheInterval;
	}

	public String getQueryConditions() {
		return this.queryConditions;
	}
	public void setQueryConditions(String queryConditions) {
		this.queryConditions = queryConditions;
	}

}
