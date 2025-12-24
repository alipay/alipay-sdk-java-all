package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.agent.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-24 14:57:40
 */
public class AlipayCommerceMedicalAgentInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5128535123232171983L;

	/** 
	 * 智能体简介描述
	 */
	@ApiField("agent_describe")
	private String agentDescribe;

	/** 
	 * 智能体id,智能体的唯一标识
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 智能体logo
	 */
	@ApiField("agent_logo")
	private String agentLogo;

	/** 
	 * 智能体名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/** 
	 * 智能体状态。
已上线：ALREADY_ONLINE
已下线：OFFLINE_ALREADY
	 */
	@ApiField("agent_status")
	private String agentStatus;

	/** 
	 * 智能体类型。
卫健委：HEALTH_COMMISSION
医院：HOSPITAL
企业：ENTERPRISE
医生：DOCTOR
医保局：MEDICAL_INSURANCE_BUREAU
	 */
	@ApiField("agent_type")
	private String agentType;

	/** 
	 * 市的唯一编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 数字人图片
	 */
	@ApiField("digital_human_pic")
	private String digitalHumanPic;

	/** 
	 * 数字人语音id
	 */
	@ApiField("digital_human_voice_id")
	private String digitalHumanVoiceId;

	/** 
	 * 区的唯一编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	/** 
	 * 机构名称
	 */
	@ApiField("org_name")
	private String orgName;

	/** 
	 * 父智能体的agentId.卫健委下的智能体会有值
	 */
	@ApiField("parent_agent_id")
	private String parentAgentId;

	/** 
	 * 省的唯一编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * null
	 */
	@ApiListField("recommend_question_list")
	@ApiField("string")
	private List<String> recommendQuestionList;

	/** 
	 * null
	 */
	@ApiListField("service_group_list")
	@ApiField("service_group")
	private List<ServiceGroup> serviceGroupList;

	/** 
	 * 标准机构id
	 */
	@ApiField("standard_org_id")
	private String standardOrgId;

	/** 
	 * 社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	/** 
	 * 首页欢迎语
	 */
	@ApiField("welcome_desc")
	private String welcomeDesc;

	public void setAgentDescribe(String agentDescribe) {
		this.agentDescribe = agentDescribe;
	}
	public String getAgentDescribe( ) {
		return this.agentDescribe;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setAgentLogo(String agentLogo) {
		this.agentLogo = agentLogo;
	}
	public String getAgentLogo( ) {
		return this.agentLogo;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentName( ) {
		return this.agentName;
	}

	public void setAgentStatus(String agentStatus) {
		this.agentStatus = agentStatus;
	}
	public String getAgentStatus( ) {
		return this.agentStatus;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	public String getAgentType( ) {
		return this.agentType;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setDigitalHumanPic(String digitalHumanPic) {
		this.digitalHumanPic = digitalHumanPic;
	}
	public String getDigitalHumanPic( ) {
		return this.digitalHumanPic;
	}

	public void setDigitalHumanVoiceId(String digitalHumanVoiceId) {
		this.digitalHumanVoiceId = digitalHumanVoiceId;
	}
	public String getDigitalHumanVoiceId( ) {
		return this.digitalHumanVoiceId;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgId( ) {
		return this.orgId;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgName( ) {
		return this.orgName;
	}

	public void setParentAgentId(String parentAgentId) {
		this.parentAgentId = parentAgentId;
	}
	public String getParentAgentId( ) {
		return this.parentAgentId;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setRecommendQuestionList(List<String> recommendQuestionList) {
		this.recommendQuestionList = recommendQuestionList;
	}
	public List<String> getRecommendQuestionList( ) {
		return this.recommendQuestionList;
	}

	public void setServiceGroupList(List<ServiceGroup> serviceGroupList) {
		this.serviceGroupList = serviceGroupList;
	}
	public List<ServiceGroup> getServiceGroupList( ) {
		return this.serviceGroupList;
	}

	public void setStandardOrgId(String standardOrgId) {
		this.standardOrgId = standardOrgId;
	}
	public String getStandardOrgId( ) {
		return this.standardOrgId;
	}

	public void setUscc(String uscc) {
		this.uscc = uscc;
	}
	public String getUscc( ) {
		return this.uscc;
	}

	public void setWelcomeDesc(String welcomeDesc) {
		this.welcomeDesc = welcomeDesc;
	}
	public String getWelcomeDesc( ) {
		return this.welcomeDesc;
	}

}
