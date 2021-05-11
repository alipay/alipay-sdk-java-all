package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检测结果
 *
 * @author auto create
 * @since 1.0, 2019-09-03 21:26:13
 */
public class SpiDetectionDetail extends AlipayObject {

	private static final long serialVersionUID = 3661233584915676511L;

	/**
	 * 检测结果码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 检测内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 检测外部任务编号
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 检测细节，检测内容可能涉及多个场景
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 检测结果分类
	 */
	@ApiField("label")
	private String label;

	/**
	 * 检测结果信息
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 检测准确率
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 检测场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 检测建议 pass-文本正常 review-需要人工审核 block-文本违规，可以直接删除或者做限制处理
	 */
	@ApiField("suggestion")
	private String suggestion;

	/**
	 * 检测内部任务编号
	 */
	@ApiField("task_id")
	private String taskId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSuggestion() {
		return this.suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
