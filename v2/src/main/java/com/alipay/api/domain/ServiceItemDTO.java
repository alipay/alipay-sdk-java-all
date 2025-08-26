package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 办事事项
 *
 * @author auto create
 * @since 1.0, 2025-07-04 13:22:37
 */
public class ServiceItemDTO extends AlipayObject {

	private static final long serialVersionUID = 6272627987343944421L;

	/**
	 * 受理条件
	 */
	@ApiField("accept_conditions")
	private String acceptConditions;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 事项办理的咨询电话
	 */
	@ApiField("consult_tel")
	private String consultTel;

	/**
	 * 实施主体
	 */
	@ApiField("implementation_subject")
	private String implementationSubject;

	/**
	 * 办理材料
	 */
	@ApiField("material_list")
	private String materialList;

	/**
	 * 事项名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部事项id。必须保证唯一性。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 办理流程信息说明
	 */
	@ApiField("process")
	private String process;

	/**
	 * 事项办理地点说明
	 */
	@ApiField("process_location")
	private String processLocation;

	/**
	 * 事项办理的时间。
	 */
	@ApiField("process_time")
	private String processTime;

	/**
	 * 语料的运行状态
	 */
	@ApiField("run_status")
	private String runStatus;

	/**
	 * 事项服务的对象
	 */
	@ApiField("service_object")
	private String serviceObject;

	/**
	 * 法人事项主题
	 */
	@ApiField("subject_juridical")
	private String subjectJuridical;

	/**
	 * 个人事项主题
	 */
	@ApiField("subject_nature")
	private String subjectNature;

	/**
	 * 办事事项的跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getAcceptConditions() {
		return this.acceptConditions;
	}
	public void setAcceptConditions(String acceptConditions) {
		this.acceptConditions = acceptConditions;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getConsultTel() {
		return this.consultTel;
	}
	public void setConsultTel(String consultTel) {
		this.consultTel = consultTel;
	}

	public String getImplementationSubject() {
		return this.implementationSubject;
	}
	public void setImplementationSubject(String implementationSubject) {
		this.implementationSubject = implementationSubject;
	}

	public String getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(String materialList) {
		this.materialList = materialList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getProcess() {
		return this.process;
	}
	public void setProcess(String process) {
		this.process = process;
	}

	public String getProcessLocation() {
		return this.processLocation;
	}
	public void setProcessLocation(String processLocation) {
		this.processLocation = processLocation;
	}

	public String getProcessTime() {
		return this.processTime;
	}
	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}

	public String getRunStatus() {
		return this.runStatus;
	}
	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

	public String getServiceObject() {
		return this.serviceObject;
	}
	public void setServiceObject(String serviceObject) {
		this.serviceObject = serviceObject;
	}

	public String getSubjectJuridical() {
		return this.subjectJuridical;
	}
	public void setSubjectJuridical(String subjectJuridical) {
		this.subjectJuridical = subjectJuridical;
	}

	public String getSubjectNature() {
		return this.subjectNature;
	}
	public void setSubjectNature(String subjectNature) {
		this.subjectNature = subjectNature;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
