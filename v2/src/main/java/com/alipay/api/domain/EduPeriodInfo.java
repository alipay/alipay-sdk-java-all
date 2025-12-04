package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 课时配置信息
 *
 * @author auto create
 * @since 1.0, 2025-05-27 18:48:57
 */
public class EduPeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 1146696618719956418L;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 课时配置列表
	 */
	@ApiListField("period_config_list")
	@ApiField("edu_period_config")
	private List<EduPeriodConfig> periodConfigList;

	/**
	 * 课时配置描述
	 */
	@ApiField("period_desc")
	private String periodDesc;

	/**
	 * 课时配置ID
	 */
	@ApiField("period_id")
	private String periodId;

	/**
	 * 课时配置名称
	 */
	@ApiField("period_name")
	private String periodName;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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

}
