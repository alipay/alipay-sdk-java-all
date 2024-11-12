package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国内离线计量上报
 *
 * @author auto create
 * @since 1.0, 2024-01-25 09:32:42
 */
public class AlipaySecurityProdRaasMeterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8714155341563469643L;

	/**
	 * 业务的类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * odps中的dt分区
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 分页的pageNo的值
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 页码的值大小
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
