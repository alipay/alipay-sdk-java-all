package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人才就业岗位应聘信息同步
 *
 * @author auto create
 * @since 1.0, 2024-06-14 11:14:51
 */
public class AlipayEbppIndustryJobApplySyncModel extends AlipayObject {

	private static final long serialVersionUID = 3684842889338733256L;

	/**
	 * 应聘信息最新更新时间

如果应聘信息有更新，通过本接口传更新后的信息，以及最新更新时间。

在某些情况下更新信息在本接口无法体现，比如服务商侧的应聘状态更详尽，多种状态对应到本岗位的一个状态，（查看简历、一面中、二面均对应到“应聘中”状态），但从查看简历更新到一面中时，仍需要通过本接口同步最新更新时间，支付宝引导用户到服务商小程序查看最新信息

格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_change_time")
	private Date applyChangeTime;

	/**
	 * 小程序应聘详情页地址
	 */
	@ApiField("apply_info_url")
	private String applyInfoUrl;

	/**
	 * 状态枚举
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 用户发起应聘的时间

格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 业务场景ID，例如招聘专场id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用于记录面试地点信息
	 */
	@ApiField("inter_address")
	private String interAddress;

	/**
	 * 面试时间
	 */
	@ApiField("inter_time")
	private Date interTime;

	/**
	 * IoT设备SN号，该字段向IoT服务商定向开放，非IoT服务商无需传值
	 */
	@ApiField("iot_sn")
	private String iotSn;

	/**
	 * 服务商侧该应聘信息的唯一标识，用于做幂等判断。
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 服务商侧应聘的岗位的唯一标识。请确保已经提前将岗位信息同步给支付宝。
	 */
	@ApiField("out_job_id")
	private String outJobId;

	public Date getApplyChangeTime() {
		return this.applyChangeTime;
	}
	public void setApplyChangeTime(Date applyChangeTime) {
		this.applyChangeTime = applyChangeTime;
	}

	public String getApplyInfoUrl() {
		return this.applyInfoUrl;
	}
	public void setApplyInfoUrl(String applyInfoUrl) {
		this.applyInfoUrl = applyInfoUrl;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getInterAddress() {
		return this.interAddress;
	}
	public void setInterAddress(String interAddress) {
		this.interAddress = interAddress;
	}

	public Date getInterTime() {
		return this.interTime;
	}
	public void setInterTime(Date interTime) {
		this.interTime = interTime;
	}

	public String getIotSn() {
		return this.iotSn;
	}
	public void setIotSn(String iotSn) {
		this.iotSn = iotSn;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

}
