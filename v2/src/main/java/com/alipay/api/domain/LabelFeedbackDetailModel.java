package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签反馈详情模型
 *
 * @author auto create
 * @since 1.0, 2024-05-13 14:53:14
 */
public class LabelFeedbackDetailModel extends AlipayObject {

	private static final long serialVersionUID = 5835424739934445823L;

	/**
	 * 曝光实力标内容代码列表
	 */
	@ApiListField("action_content")
	@ApiField("string")
	private List<String> actionContent;

	/**
	 * 动作统计值
	 */
	@ApiField("action_count")
	private String actionCount;

	/**
	 * 动作发生日期，建议使用YYYY-MM-DD格式
	 */
	@ApiField("action_date")
	private String actionDate;

	/**
	 * 反馈动作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 上报统计类型。accurate标识精确值，interval标识区间值
	 */
	@ApiField("count_type")
	private String countType;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	public List<String> getActionContent() {
		return this.actionContent;
	}
	public void setActionContent(List<String> actionContent) {
		this.actionContent = actionContent;
	}

	public String getActionCount() {
		return this.actionCount;
	}
	public void setActionCount(String actionCount) {
		this.actionCount = actionCount;
	}

	public String getActionDate() {
		return this.actionDate;
	}
	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getCountType() {
		return this.countType;
	}
	public void setCountType(String countType) {
		this.countType = countType;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

}
