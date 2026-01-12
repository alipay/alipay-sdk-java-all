package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-05 17:47:43
 */
public class ObjStatus extends AlipayObject {

	private static final long serialVersionUID = 8284295939133242478L;

	/**
	 * 业务对象标识
	 */
	@ApiField("biz_object_no")
	private String bizObjectNo;

	/**
	 * 基本信息是否完整
true：是
false：否
	 */
	@ApiField("completed_info")
	private Boolean completedInfo;

	/**
	 * 是否有地图
true: 是
false: 否
	 */
	@ApiField("mapping")
	private Boolean mapping;

	/**
	 * 是否分拣
true: 是
false: 否
	 */
	@ApiField("sorting")
	private Boolean sorting;

	public String getBizObjectNo() {
		return this.bizObjectNo;
	}
	public void setBizObjectNo(String bizObjectNo) {
		this.bizObjectNo = bizObjectNo;
	}

	public Boolean getCompletedInfo() {
		return this.completedInfo;
	}
	public void setCompletedInfo(Boolean completedInfo) {
		this.completedInfo = completedInfo;
	}

	public Boolean getMapping() {
		return this.mapping;
	}
	public void setMapping(Boolean mapping) {
		this.mapping = mapping;
	}

	public Boolean getSorting() {
		return this.sorting;
	}
	public void setSorting(Boolean sorting) {
		this.sorting = sorting;
	}

}
