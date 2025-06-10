package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 天气预警详情
 *
 * @author auto create
 * @since 1.0, 2024-10-15 09:43:50
 */
public class AlarmInfo extends AlipayObject {

	private static final long serialVersionUID = 8238592667729159857L;

	/**
	 * 6位国标码，支持传区县+城市级别
和ad_code_list任选其一填写
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * adCode列表。支持省份，城市，区县维度。和adCode参数任选其一填写
	 */
	@ApiListField("ad_code_list")
	@ApiField("string")
	private List<String> adCodeList;

	/**
	 * 预警信息发布单位
	 */
	@ApiField("alarm_publish_unit")
	private String alarmPublishUnit;

	/**
	 * 天气预警描述信息
	 */
	@ApiField("content")
	private String content;

	/**
	 * 预警结束时间。如果有预期结束时间可以填写。如果没有系统会自动计算个默认失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 预警级别，一般包含蓝色，黄色，橙色，红色
	 */
	@ApiField("level")
	private String level;

	/**
	 * 天气预警唯一id
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 预警承接页链接。如果自行开发了承接页面，请传入该链接
	 */
	@ApiField("target_url")
	private String targetUrl;

	/**
	 * 标准时间格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time")
	private Date time;

	/**
	 * 天气预警的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 天气预警类型
	 */
	@ApiField("type")
	private String type;

	public String getAdCode() {
		return this.adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public List<String> getAdCodeList() {
		return this.adCodeList;
	}
	public void setAdCodeList(List<String> adCodeList) {
		this.adCodeList = adCodeList;
	}

	public String getAlarmPublishUnit() {
		return this.alarmPublishUnit;
	}
	public void setAlarmPublishUnit(String alarmPublishUnit) {
		this.alarmPublishUnit = alarmPublishUnit;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public Date getTime() {
		return this.time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
