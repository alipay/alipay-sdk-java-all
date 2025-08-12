package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业工商变更明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:18:13
 */
public class EpReginfoChangeInfo extends AlipayObject {

	private static final long serialVersionUID = 5531233158467976687L;

	/**
	 * 变更后的内容
	 */
	@ApiField("after_change")
	private String afterChange;

	/**
	 * 变更前的内容
	 */
	@ApiField("before_change")
	private String beforeChange;

	/**
	 * 变更日期
	 */
	@ApiField("change_date")
	private String changeDate;

	/**
	 * 企业工商变更事项
	 */
	@ApiField("change_matter")
	private String changeMatter;

	/**
	 * 企业工商变更事项详情
	 */
	@ApiField("change_matter_details")
	private String changeMatterDetails;

	public String getAfterChange() {
		return this.afterChange;
	}
	public void setAfterChange(String afterChange) {
		this.afterChange = afterChange;
	}

	public String getBeforeChange() {
		return this.beforeChange;
	}
	public void setBeforeChange(String beforeChange) {
		this.beforeChange = beforeChange;
	}

	public String getChangeDate() {
		return this.changeDate;
	}
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	public String getChangeMatter() {
		return this.changeMatter;
	}
	public void setChangeMatter(String changeMatter) {
		this.changeMatter = changeMatter;
	}

	public String getChangeMatterDetails() {
		return this.changeMatterDetails;
	}
	public void setChangeMatterDetails(String changeMatterDetails) {
		this.changeMatterDetails = changeMatterDetails;
	}

}
