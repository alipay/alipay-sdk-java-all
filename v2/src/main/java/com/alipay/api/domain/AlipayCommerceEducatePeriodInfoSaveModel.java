package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保存课时
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:57:53
 */
public class AlipayCommerceEducatePeriodInfoSaveModel extends AlipayObject {

	private static final long serialVersionUID = 4245714692925612177L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 操作人姓名
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 课时配置列表
	 */
	@ApiListField("period_config_list")
	@ApiField("edu_period_config")
	private List<EduPeriodConfig> periodConfigList;

	/**
	 * 课时描述
	 */
	@ApiField("period_desc")
	private String periodDesc;

	/**
	 * 课时ID
	 */
	@ApiField("period_id")
	private String periodId;

	/**
	 * 课时名称
	 */
	@ApiField("period_name")
	private String periodName;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<EduPeriodConfig> getPeriodConfigList() {
		return this.periodConfigList;
	}
	public void setPeriodConfigList(List<EduPeriodConfig> periodConfigList) {
		this.periodConfigList = periodConfigList;
	}

	public String getPeriodDesc() {
		return this.periodDesc;
	}
	public void setPeriodDesc(String periodDesc) {
		this.periodDesc = periodDesc;
	}

	public String getPeriodId() {
		return this.periodId;
	}
	public void setPeriodId(String periodId) {
		this.periodId = periodId;
	}

	public String getPeriodName() {
		return this.periodName;
	}
	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
