package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集点卡工具
 *
 * @author auto create
 * @since 1.0, 2017-06-05 11:25:25
 */
public class PointCard extends AlipayObject {

	private static final long serialVersionUID = 2115287259185922833L;

	/**
	 * 工具的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 工具的有效期的结束时间（必须晚于活动的结束时间）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 工具的LOGO文件ID
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 工具的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 工具的有效期的起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 工具类型，目前支持：
集点卡：POINT_CARD
	 */
	@ApiField("type")
	private String type;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
