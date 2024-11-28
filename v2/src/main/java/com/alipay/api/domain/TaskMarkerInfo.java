package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超级导购任务标的物信息
 *
 * @author auto create
 * @since 1.0, 2024-08-09 16:47:52
 */
public class TaskMarkerInfo extends AlipayObject {

	private static final long serialVersionUID = 5423656687699681779L;

	/**
	 * 标的物logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 标的物描述
	 */
	@ApiField("marker_desc")
	private String markerDesc;

	/**
	 * 标的物名称
	 */
	@ApiField("marker_name")
	private String markerName;

	/**
	 * 标的物类型
	 */
	@ApiField("marker_type")
	private String markerType;

	/**
	 * 个人完成数，单位为次
	 */
	@ApiField("personal_count")
	private Long personalCount;

	/**
	 * 总完成数，单位为次
	 */
	@ApiField("total_count")
	private Long totalCount;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMarkerDesc() {
		return this.markerDesc;
	}
	public void setMarkerDesc(String markerDesc) {
		this.markerDesc = markerDesc;
	}

	public String getMarkerName() {
		return this.markerName;
	}
	public void setMarkerName(String markerName) {
		this.markerName = markerName;
	}

	public String getMarkerType() {
		return this.markerType;
	}
	public void setMarkerType(String markerType) {
		this.markerType = markerType;
	}

	public Long getPersonalCount() {
		return this.personalCount;
	}
	public void setPersonalCount(Long personalCount) {
		this.personalCount = personalCount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
