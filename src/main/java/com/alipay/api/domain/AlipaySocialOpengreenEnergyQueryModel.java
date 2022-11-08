package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开放平台绿色能量信息查询
 *
 * @author auto create
 * @since 1.0, 2022-09-26 11:01:49
 */
public class AlipaySocialOpengreenEnergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5249596797639269426L;

	/**
	 * 生成能量时传入的唯一键
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 查询结束时间，选填
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 选填，后续有特殊需求，可以存放的字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 传入需要查询的绿色场景字符串数组
	 */
	@ApiListField("green_actions")
	@ApiField("string")
	private List<String> greenActions;

	/**
	 * 在对应商户的消费者id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户接入绿色开发平台的id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 请求的来源，必填
	 */
	@ApiField("source")
	private String source;

	/**
	 * 查询开始时间，查询区域最大只支持3个月，包含当月
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<String> getGreenActions() {
		return this.greenActions;
	}
	public void setGreenActions(List<String> greenActions) {
		this.greenActions = greenActions;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
