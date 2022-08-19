package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无资金行业票模板修改接口
 *
 * @author auto create
 * @since 1.0, 2019-12-09 11:11:06
 */
public class AlipayMarketingCashlessticketTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7852163789219153181L;

	/**
	 * 模板修改操作外部业务号，用于修改时的幂等控制，注意这里不是修改创建模板时的业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发票。票的发放结束时间和发放开始时间跨度不能大于5年（一年按照365天计算）。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private String publishEndTime;

	/**
	 * 则配置，JSON字符串，{"PID":"2088102147297014","STORE":"123456,678901","MerchantMarketingSign":{"userDefinedValue":"AAA","belongType":"Y"}}，其中PID表示可以核销该票的PID列表，多个值用英文逗号隔开，STORE表示可以核销该票的内部门店ID，多个值用英文逗号隔开，不传此参数则不修改规则，若有要修改规则那么必须包含PID，且PID范围和STOREID范围只允许扩大，不允许缩小。特别注意：
如果传入的核销规则中没有自定义核销规则字段，那么表示自定义核销规则就会被取消，只根据PID规则和STORE规则进行核销
	 */
	@ApiField("rule_conf")
	private String ruleConf;

	/**
	 * 票模板ID ，通过调用alipay.marketing.cashlessticket.template.create接口返回
	 */
	@ApiField("template_id")
	private String templateId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(String publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public String getRuleConf() {
		return this.ruleConf;
	}
	public void setRuleConf(String ruleConf) {
		this.ruleConf = ruleConf;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
