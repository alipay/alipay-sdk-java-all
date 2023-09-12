package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送学费码打款规则
 *
 * @author auto create
 * @since 1.0, 2023-04-12 10:51:03
 */
public class AlipayCommerceEducateTuitioncodePlanruleSendModel extends AlipayObject {

	private static final long serialVersionUID = 3337761735697538539L;

	/**
	 * 分配类型：
1-平均分配；
2-自定义分配;
	 */
	@ApiField("allot_type")
	private String allotType;

	/**
	 * 打款规则执行类型：
1-系统调度；
2-外部触发
	 */
	@ApiField("execute_type")
	private String executeType;

	/**
	 * 外部业务编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 周期数。平均分配方式下必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 规则设定类型：
1- 课程级别
2-交易级别
	 */
	@ApiField("setting_type")
	private String settingType;

	/**
	 * 商户smid
	 */
	@ApiField("smid")
	private String smid;

	public String getAllotType() {
		return this.allotType;
	}
	public void setAllotType(String allotType) {
		this.allotType = allotType;
	}

	public String getExecuteType() {
		return this.executeType;
	}
	public void setExecuteType(String executeType) {
		this.executeType = executeType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getSettingType() {
		return this.settingType;
	}
	public void setSettingType(String settingType) {
		this.settingType = settingType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
