package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot监控应急的报警上报接口
 *
 * @author auto create
 * @since 1.0, 2022-10-21 15:10:08
 */
public class AlipayOpenIoteopAlarmSendModel extends AlipayObject {

	private static final long serialVersionUID = 4272946389673771313L;

	/**
	 * 报警规则id
	 */
	@ApiField("alarm_rule_id")
	private String alarmRuleId;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 时序图id
	 */
	@ApiField("sequence_diagram_id")
	private String sequenceDiagramId;

	public String getAlarmRuleId() {
		return this.alarmRuleId;
	}
	public void setAlarmRuleId(String alarmRuleId) {
		this.alarmRuleId = alarmRuleId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getSequenceDiagramId() {
		return this.sequenceDiagramId;
	}
	public void setSequenceDiagramId(String sequenceDiagramId) {
		this.sequenceDiagramId = sequenceDiagramId;
	}

}
