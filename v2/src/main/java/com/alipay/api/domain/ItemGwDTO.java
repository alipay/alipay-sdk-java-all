package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 政务事项对象
 *
 * @author auto create
 * @since 1.0, 2023-06-08 21:29:35
 */
public class ItemGwDTO extends AlipayObject {

	private static final long serialVersionUID = 8245165766223287939L;

	/**
	 * 该事项的办理需要前提的条件
	 */
	@ApiField("accept_conditions")
	private String acceptConditions;

	/**
	 * 事项所属云客服的类目，根目录下的一级或二级目录，美誉则创建
	 */
	@ApiListField("category")
	@ApiField("string")
	private List<String> category;

	/**
	 * 事项的材料清单
	 */
	@ApiListField("checklist")
	@ApiField("string")
	private List<String> checklist;

	/**
	 * 事项的唯一编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 事项联络详情（时间、地点、咨询方式）
	 */
	@ApiListField("contact")
	@ApiField("item_contact_vo")
	private List<ItemContactVo> contact;

	/**
	 * 国家统一区域编码
	 */
	@ApiField("district")
	private String district;

	/**
	 * 该事项实施的主体单位
	 */
	@ApiField("implementation_subject")
	private String implementationSubject;

	/**
	 * 事项的小程序链接，alipays协议
	 */
	@ApiField("link")
	private String link;

	/**
	 * 事项的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支持： true；不支持：false。不填为false
	 */
	@ApiField("online_support")
	private Boolean onlineSupport;

	/**
	 * 支持：true；不支持：false。不填为false
	 */
	@ApiField("palm_support")
	private Boolean palmSupport;

	/**
	 * 支付宝小程序地址，alipays协议
	 */
	@ApiField("palm_url")
	private String palmUrl;

	/**
	 * 该事项关联的支付宝服务
	 */
	@ApiField("rel_service")
	private String relService;

	/**
	 * 政府标准事项
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 该事项服务的对象
	 */
	@ApiField("service_object")
	private String serviceObject;

	/**
	 * 事项主题（法人）
	 */
	@ApiListField("subject_juridical")
	@ApiField("string")
	private List<String> subjectJuridical;

	/**
	 * 事项主题（自然人）
	 */
	@ApiListField("subject_nature")
	@ApiField("string")
	private List<String> subjectNature;

	/**
	 * 该事项办理的流程
	 */
	@ApiField("working_schedule")
	private String workingSchedule;

	public String getAcceptConditions() {
		return this.acceptConditions;
	}
	public void setAcceptConditions(String acceptConditions) {
		this.acceptConditions = acceptConditions;
	}

	public List<String> getCategory() {
		return this.category;
	}
	public void setCategory(List<String> category) {
		this.category = category;
	}

	public List<String> getChecklist() {
		return this.checklist;
	}
	public void setChecklist(List<String> checklist) {
		this.checklist = checklist;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<ItemContactVo> getContact() {
		return this.contact;
	}
	public void setContact(List<ItemContactVo> contact) {
		this.contact = contact;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getImplementationSubject() {
		return this.implementationSubject;
	}
	public void setImplementationSubject(String implementationSubject) {
		this.implementationSubject = implementationSubject;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOnlineSupport() {
		return this.onlineSupport;
	}
	public void setOnlineSupport(Boolean onlineSupport) {
		this.onlineSupport = onlineSupport;
	}

	public Boolean getPalmSupport() {
		return this.palmSupport;
	}
	public void setPalmSupport(Boolean palmSupport) {
		this.palmSupport = palmSupport;
	}

	public String getPalmUrl() {
		return this.palmUrl;
	}
	public void setPalmUrl(String palmUrl) {
		this.palmUrl = palmUrl;
	}

	public String getRelService() {
		return this.relService;
	}
	public void setRelService(String relService) {
		this.relService = relService;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getServiceObject() {
		return this.serviceObject;
	}
	public void setServiceObject(String serviceObject) {
		this.serviceObject = serviceObject;
	}

	public List<String> getSubjectJuridical() {
		return this.subjectJuridical;
	}
	public void setSubjectJuridical(List<String> subjectJuridical) {
		this.subjectJuridical = subjectJuridical;
	}

	public List<String> getSubjectNature() {
		return this.subjectNature;
	}
	public void setSubjectNature(List<String> subjectNature) {
		this.subjectNature = subjectNature;
	}

	public String getWorkingSchedule() {
		return this.workingSchedule;
	}
	public void setWorkingSchedule(String workingSchedule) {
		this.workingSchedule = workingSchedule;
	}

}
