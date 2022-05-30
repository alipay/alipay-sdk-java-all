package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建生态协同单接口
 *
 * @author auto create
 * @since 1.0, 2020-04-09 20:55:51
 */
public class AlipayCommerceFixTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7881793966686998168L;

	/**
	 * 应用场景: 用于在ruleScene规则场景下，对提报问题进行二次分类。
如何获取:与业务对接同学沟通后确定。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 提交工单时的联系人名称
	 */
	@ApiField("contact")
	private String contact;

	/**
	 * 提报问题的联系人电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 描述提报问题的详情。
	 */
	@ApiField("description")
	private String description;

	/**
	 * 定向开放场景中，可能同时支持多个业务场景，允许各业务场景自定义个性化提交的数据。数据格式请提前与业务接口人确定
	 */
	@ApiListField("extra")
	@ApiField("fix_ext_data")
	private List<FixExtData> extra;

	/**
	 * 如果工单包含图片等附件信息，首先通过文件上传接口进行文件上传，并从接口返回中获得id。此处构造的fileIds多个之间用英文","分隔。
	 */
	@ApiField("file_ids")
	private String fileIds;

	/**
	 * 特殊场景下需要直接指定任务处理方时使用（非必须）。
通常需要和问题分类id配合使用。
	 */
	@ApiField("handler_id")
	private String handlerId;

	/**
	 * 对接系统中该任务的唯一标识，幂等使用，如果该id对应的工单已经创建则会报错。 如何获取:对接系统自行维护的需要创建工单的唯一标识。
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 对接系统自行设置自己的唯一标识。
如何获取:使用时需要与业务对接同学，确保系统名没有与现有的其他系统名重复。
	 */
	@ApiField("outer_system")
	private String outerSystem;

	/**
	 * 提报问题的分类id。
如何获取:根据问题现象分类查询接口的查询结果。
	 */
	@ApiField("problem_id")
	private Long problemId;

	/**
	 * 工单的业务类型。 枚举值:IoTMTN:IoT维保场景;jfMTN:生活缴费;C2B:C2B;riskControl:行业风险任务。
	 */
	@ApiField("rule_scene")
	private String ruleScene;

	/**
	 * 工单创建来源。对接方使用时请先与业务接口人沟通
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用来标识任务类型。
枚举值:techConsult:技术咨询;malfunctionReport:设备报障
	 */
	@ApiField("task_category")
	private String taskCategory;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContact() {
		return this.contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<FixExtData> getExtra() {
		return this.extra;
	}
	public void setExtra(List<FixExtData> extra) {
		this.extra = extra;
	}

	public String getFileIds() {
		return this.fileIds;
	}
	public void setFileIds(String fileIds) {
		this.fileIds = fileIds;
	}

	public String getHandlerId() {
		return this.handlerId;
	}
	public void setHandlerId(String handlerId) {
		this.handlerId = handlerId;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterSystem() {
		return this.outerSystem;
	}
	public void setOuterSystem(String outerSystem) {
		this.outerSystem = outerSystem;
	}

	public Long getProblemId() {
		return this.problemId;
	}
	public void setProblemId(Long problemId) {
		this.problemId = problemId;
	}

	public String getRuleScene() {
		return this.ruleScene;
	}
	public void setRuleScene(String ruleScene) {
		this.ruleScene = ruleScene;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTaskCategory() {
		return this.taskCategory;
	}
	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}

}
