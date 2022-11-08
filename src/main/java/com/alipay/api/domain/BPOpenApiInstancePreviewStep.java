package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预演步骤
 *
 * @author auto create
 * @since 1.0, 2022-03-17 20:51:08
 */
public class BPOpenApiInstancePreviewStep extends AlipayObject {

	private static final long serialVersionUID = 4373483415179584159L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 错误信息. 如果该节点预演失败时，则将错误信息填入到该字段.
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 完成时间
	 */
	@ApiField("finish_date")
	private String finishDate;

	/**
	 * next也是一个复杂对象BPOpenApiInstancePreviewStep，平台无法循环嵌套使用，故定义成String，使用方请自行解析
	 */
	@ApiField("next")
	private String next;

	/**
	 * 节点展示名称
	 */
	@ApiField("node")
	private String node;

	/**
	 * 节点名称
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 源头活动id
	 */
	@ApiField("source_act_id")
	private Long sourceActId;

	/**
	 * sub_steps是一复杂对象列表：List<BPOpenApiInstancePreviewStep>,
由于平台不能循环嵌套使用，故定义成String，使用方自行解析
	 */
	@ApiField("sub_steps")
	private String subSteps;

	/**
	 * 该节点是否预演成功. 默认为true
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 任务类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 步骤单元集合
	 */
	@ApiListField("units")
	@ApiField("step_unit")
	private List<StepUnit> units;

	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getFinishDate() {
		return this.finishDate;
	}
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}

	public String getNext() {
		return this.next;
	}
	public void setNext(String next) {
		this.next = next;
	}

	public String getNode() {
		return this.node;
	}
	public void setNode(String node) {
		this.node = node;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Long getSourceActId() {
		return this.sourceActId;
	}
	public void setSourceActId(Long sourceActId) {
		this.sourceActId = sourceActId;
	}

	public String getSubSteps() {
		return this.subSteps;
	}
	public void setSubSteps(String subSteps) {
		this.subSteps = subSteps;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<StepUnit> getUnits() {
		return this.units;
	}
	public void setUnits(List<StepUnit> units) {
		this.units = units;
	}

}
