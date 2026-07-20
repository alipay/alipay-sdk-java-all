package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据手机号发放服务包
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:37:55
 */
public class AlipayCommerceMedicalServicepackageGrantbyphonenoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6613224125854814235L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 服务生效天数
	 */
	@ApiField("effect_days")
	private Long effectDays;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否开通主订单，不传不开通
	 */
	@ApiField("open_main")
	private Boolean openMain;

	/**
	 * 外部唯一单号
	 */
	@ApiField("out_unique_biz_no")
	private String outUniqueBizNo;

	/**
	 * 用户手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 服务项限制使用规则
	 */
	@ApiField("service_item_restrict_rule_list")
	private ServiceItemRestrictRule serviceItemRestrictRuleList;

	/**
	 * 指定可用开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * null
	 */
	@ApiListField("sub_user_info_list")
	@ApiField("sub_user_info")
	private List<SubUserInfo> subUserInfoList;

	/**
	 * 指定的用户可用开始时间
	 */
	@ApiField("user_start_time")
	private Date userStartTime;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public Long getEffectDays() {
		return this.effectDays;
	}
	public void setEffectDays(Long effectDays) {
		this.effectDays = effectDays;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOpenMain() {
		return this.openMain;
	}
	public void setOpenMain(Boolean openMain) {
		this.openMain = openMain;
	}

	public String getOutUniqueBizNo() {
		return this.outUniqueBizNo;
	}
	public void setOutUniqueBizNo(String outUniqueBizNo) {
		this.outUniqueBizNo = outUniqueBizNo;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public ServiceItemRestrictRule getServiceItemRestrictRuleList() {
		return this.serviceItemRestrictRuleList;
	}
	public void setServiceItemRestrictRuleList(ServiceItemRestrictRule serviceItemRestrictRuleList) {
		this.serviceItemRestrictRuleList = serviceItemRestrictRuleList;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public List<SubUserInfo> getSubUserInfoList() {
		return this.subUserInfoList;
	}
	public void setSubUserInfoList(List<SubUserInfo> subUserInfoList) {
		this.subUserInfoList = subUserInfoList;
	}

	public Date getUserStartTime() {
		return this.userStartTime;
	}
	public void setUserStartTime(Date userStartTime) {
		this.userStartTime = userStartTime;
	}

}
