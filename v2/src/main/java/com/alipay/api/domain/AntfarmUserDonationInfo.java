package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁庄园捐爱心信息，限制 appId 对捐赠项目访问
 *
 * @author auto create
 * @since 1.0, 2021-07-01 14:23:14
 */
public class AntfarmUserDonationInfo extends AlipayObject {

	private static final long serialVersionUID = 3739354568871419182L;

	/**
	 * 用户捐爱心记录列表
	 */
	@ApiListField("donation_record_list")
	@ApiField("antfarm_user_donation_record")
	private List<AntfarmUserDonationRecord> donationRecordList;

	/**
	 * 捐赠标的物 id
	 */
	@ApiField("donation_target_id")
	private String donationTargetId;

	/**
	 * 捐赠标的物名称
	 */
	@ApiField("donation_target_name")
	private String donationTargetName;

	/**
	 * 捐赠项目 id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 捐赠项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	public List<AntfarmUserDonationRecord> getDonationRecordList() {
		return this.donationRecordList;
	}
	public void setDonationRecordList(List<AntfarmUserDonationRecord> donationRecordList) {
		this.donationRecordList = donationRecordList;
	}

	public String getDonationTargetId() {
		return this.donationTargetId;
	}
	public void setDonationTargetId(String donationTargetId) {
		this.donationTargetId = donationTargetId;
	}

	public String getDonationTargetName() {
		return this.donationTargetName;
	}
	public void setDonationTargetName(String donationTargetName) {
		this.donationTargetName = donationTargetName;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
