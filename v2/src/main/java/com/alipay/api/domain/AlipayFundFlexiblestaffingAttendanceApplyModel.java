package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申请考勤链接（投保）
 *
 * @author auto create
 * @since 1.0, 2023-11-24 13:47:26
 */
public class AlipayFundFlexiblestaffingAttendanceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4748127921229455355L;

	/**
	 * 授权跳转类型
	 */
	@ApiField("apply_link_type")
	private String applyLinkType;

	/**
	 * 场景码固定值
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 跳转渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 零工卡信息
	 */
	@ApiField("employee_card_info")
	private EmployeeCardInfoDTO employeeCardInfo;

	/**
	 * 链接有效时间，最大值一年有效期
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 打卡的配置信息
	 */
	@ApiField("insure_attend")
	private InsureAttendDTO insureAttend;

	/**
	 * 当投保模式为直接投保，投保主体信息必选
	 */
	@ApiField("insure_info")
	private InsureInfoDTO insureInfo;

	/**
	 * 投保模式1：审批投 2：直接投
	 */
	@ApiField("insure_type")
	private String insureType;

	/**
	 * 员工工种code列表信息，替代原job,job_level字段，该字段必填
	 */
	@ApiListField("job_list")
	@ApiField("string")
	private List<String> jobList;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作商信息,本次场景和投保企业信息报错一致
	 */
	@ApiField("partner_organization")
	private InsurePartnerOrganization partnerOrganization;

	/**
	 * 产品码固定值
	 */
	@ApiField("product_code")
	private String productCode;

	public String getApplyLinkType() {
		return this.applyLinkType;
	}
	public void setApplyLinkType(String applyLinkType) {
		this.applyLinkType = applyLinkType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public EmployeeCardInfoDTO getEmployeeCardInfo() {
		return this.employeeCardInfo;
	}
	public void setEmployeeCardInfo(EmployeeCardInfoDTO employeeCardInfo) {
		this.employeeCardInfo = employeeCardInfo;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public InsureAttendDTO getInsureAttend() {
		return this.insureAttend;
	}
	public void setInsureAttend(InsureAttendDTO insureAttend) {
		this.insureAttend = insureAttend;
	}

	public InsureInfoDTO getInsureInfo() {
		return this.insureInfo;
	}
	public void setInsureInfo(InsureInfoDTO insureInfo) {
		this.insureInfo = insureInfo;
	}

	public String getInsureType() {
		return this.insureType;
	}
	public void setInsureType(String insureType) {
		this.insureType = insureType;
	}

	public List<String> getJobList() {
		return this.jobList;
	}
	public void setJobList(List<String> jobList) {
		this.jobList = jobList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public InsurePartnerOrganization getPartnerOrganization() {
		return this.partnerOrganization;
	}
	public void setPartnerOrganization(InsurePartnerOrganization partnerOrganization) {
		this.partnerOrganization = partnerOrganization;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
