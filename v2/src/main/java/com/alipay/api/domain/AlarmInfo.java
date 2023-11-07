package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天气预警详情
 *
 * @author auto create
 * @since 1.0, 2023-09-19 09:35:14
 */
public class AlarmInfo extends AlipayObject {

	private static final long serialVersionUID = 4845872876648535142L;

	/**
	 * 6位国标码，支持传区县+城市级别
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 天气预警描述信息
	 */
	@ApiField("content")
	private String content;

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

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
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
