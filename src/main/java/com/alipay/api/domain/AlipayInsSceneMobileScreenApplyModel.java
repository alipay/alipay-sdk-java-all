package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碎屏险投保接口
 *
 * @author auto create
 * @since 1.0, 2021-11-15 09:30:25
 */
public class AlipayInsSceneMobileScreenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2577826515623664461L;

	/**
	 * 投保人信息
	 */
	@ApiField("applicant")
	private InsurancePerson applicant;

	/**
	 * 渠道来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 渠道业务信息
	 */
	@ApiField("channel_biz_data")
	private ChannelBizData channelBizData;

	/**
	 * 保险保障开始时间
	 */
	@ApiField("effective_start_time")
	private Date effectiveStartTime;

	/**
	 * 保障期限对象
	 */
	@ApiField("insurance_period")
	private InsurancePeriod insurancePeriod;

	/**
	 * 被保人信息
	 */
	@ApiField("insured")
	private InsurancePerson insured;

	/**
	 * 手机设备信息
	 */
	@ApiField("mobile_device_info")
	private MobileDeviceInfo mobileDeviceInfo;

	/**
	 * 外部业务单号，幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保费金额，单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 维修类型
官修：official;
严选：unOfficial;
	 */
	@ApiField("repair_type")
	private String repairType;

	public InsurancePerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsurancePerson applicant) {
		this.applicant = applicant;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public ChannelBizData getChannelBizData() {
		return this.channelBizData;
	}
	public void setChannelBizData(ChannelBizData channelBizData) {
		this.channelBizData = channelBizData;
	}

	public Date getEffectiveStartTime() {
		return this.effectiveStartTime;
	}
	public void setEffectiveStartTime(Date effectiveStartTime) {
		this.effectiveStartTime = effectiveStartTime;
	}

	public InsurancePeriod getInsurancePeriod() {
		return this.insurancePeriod;
	}
	public void setInsurancePeriod(InsurancePeriod insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}

	public InsurancePerson getInsured() {
		return this.insured;
	}
	public void setInsured(InsurancePerson insured) {
		this.insured = insured;
	}

	public MobileDeviceInfo getMobileDeviceInfo() {
		return this.mobileDeviceInfo;
	}
	public void setMobileDeviceInfo(MobileDeviceInfo mobileDeviceInfo) {
		this.mobileDeviceInfo = mobileDeviceInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getRepairType() {
		return this.repairType;
	}
	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

}
