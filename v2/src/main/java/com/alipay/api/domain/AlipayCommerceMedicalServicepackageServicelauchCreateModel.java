package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户服务开通接口
 *
 * @author auto create
 * @since 1.0, 2026-06-12 15:02:57
 */
public class AlipayCommerceMedicalServicepackageServicelauchCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6892747958644842935L;

	/**
	 * 主使用人信息
	 */
	@ApiField("main_user_info")
	private MainUserInfo mainUserInfo;

	/**
	 * 用户外部服务支付时间
	 */
	@ApiField("out_pay_time")
	private Date outPayTime;

	/**
	 * 外部业务唯一单号
	 */
	@ApiField("out_unique_biz_no")
	private String outUniqueBizNo;

	/**
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * null
	 */
	@ApiListField("sub_user_info_list")
	@ApiField("main_user_info")
	private List<MainUserInfo> subUserInfoList;

	/**
	 * 外部服务失效时间
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 外部服务生效时间
	 */
	@ApiField("valid_start_time")
	private Date validStartTime;

	public MainUserInfo getMainUserInfo() {
		return this.mainUserInfo;
	}
	public void setMainUserInfo(MainUserInfo mainUserInfo) {
		this.mainUserInfo = mainUserInfo;
	}

	public Date getOutPayTime() {
		return this.outPayTime;
	}
	public void setOutPayTime(Date outPayTime) {
		this.outPayTime = outPayTime;
	}

	public String getOutUniqueBizNo() {
		return this.outUniqueBizNo;
	}
	public void setOutUniqueBizNo(String outUniqueBizNo) {
		this.outUniqueBizNo = outUniqueBizNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List<MainUserInfo> getSubUserInfoList() {
		return this.subUserInfoList;
	}
	public void setSubUserInfoList(List<MainUserInfo> subUserInfoList) {
		this.subUserInfoList = subUserInfoList;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

	public Date getValidStartTime() {
		return this.validStartTime;
	}
	public void setValidStartTime(Date validStartTime) {
		this.validStartTime = validStartTime;
	}

}
