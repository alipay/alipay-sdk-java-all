package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 有资金行业票模板修改接口
 *
 * @author auto create
 * @since 1.0, 2023-11-27 10:29:41
 */
public class AlipayMarketingCashticketTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4636872143474923559L;

	/**
	 * 外部业务单号，用作幂等控制，相同template_id下相同out_biz_no视为同一次修改。注意，此值不是修改模板的out_biz_no属性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发票。票的发放结束时间和发放开始时间跨度不能大于5年（一年按照365天计算）。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss。草稿状态和生效状态可修改，如果此值不想被修改，请传原值
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 发放开始时间，早于该时间不能发票。发放开始时间不能大于当前时间15天。格式为：yyyy-MM-dd HH:mm:ss。仅草稿状态可修改。仅草稿状态可修改，如果此值不想被修改，请传原值
	 */
	@ApiField("publish_start_time")
	private String publishStartTime;

	/**
	 * 票模板ID。通过票模板创建接口接口获取
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 票有效期。有两种类型：绝对时间和相对时间。使用JSON字符串表示。绝对时间有3个key：type、start、end，type取值固定为"ABSOLUTE"，start和end分别表示票生效时间和失效时间，格式为yyyy-MM-dd HH:mm:ss。绝对时间示例：{"type": "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发票时间开始到往后推duration个单位时间为止作为票的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发票，那么票从现在开始生效1(duration)天(unit)后失效，如果此值不想被修改，请传原值
	 */
	@ApiField("ticket_valid_period")
	private String ticketValidPeriod;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public String getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(String publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTicketValidPeriod() {
		return this.ticketValidPeriod;
	}
	public void setTicketValidPeriod(String ticketValidPeriod) {
		this.ticketValidPeriod = ticketValidPeriod;
	}

}
