package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户服务取消接口
 *
 * @author auto create
 * @since 1.0, 2026-06-12 15:02:57
 */
public class AlipayCommerceMedicalServicepackageServicelauchCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3313655967883747143L;

	/**
	 * 主使用人手机号
	 */
	@ApiField("main_user_phone_no")
	private String mainUserPhoneNo;

	/**
	 * 用户外部服务取消时间
	 */
	@ApiField("out_cancel_time")
	private Date outCancelTime;

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

	public String getMainUserPhoneNo() {
		return this.mainUserPhoneNo;
	}
	public void setMainUserPhoneNo(String mainUserPhoneNo) {
		this.mainUserPhoneNo = mainUserPhoneNo;
	}

	public Date getOutCancelTime() {
		return this.outCancelTime;
	}
	public void setOutCancelTime(Date outCancelTime) {
		this.outCancelTime = outCancelTime;
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

}
