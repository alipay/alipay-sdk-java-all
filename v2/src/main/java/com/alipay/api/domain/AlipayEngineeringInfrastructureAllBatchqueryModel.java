package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询关于饿了么舆情
 *
 * @author auto create
 * @since 1.0, 2024-02-23 16:36:59
 */
public class AlipayEngineeringInfrastructureAllBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7869263267117732874L;

	/**
	 * 应用的英文名
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 查询时间区间 起始时间  格式为：
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("begin")
	private String begin;

	/**
	 * 查询时间区间 结束时间  格式为
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end")
	private String end;

	/**
	 * 唯一code值
	 */
	@ApiField("key_code")
	private String keyCode;

	/**
	 * 查询条数 不超过1w条每次
	 */
	@ApiField("limit")
	private Long limit;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBegin() {
		return this.begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getKeyCode() {
		return this.keyCode;
	}
	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	public Long getLimit() {
		return this.limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
	}

}
