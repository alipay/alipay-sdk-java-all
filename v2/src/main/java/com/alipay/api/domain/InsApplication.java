package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保申请信息
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:36:51
 */
public class InsApplication extends AlipayObject {

	private static final long serialVersionUID = 7635888263134118783L;

	/**
	 * 投保参数 ,每个产品特有的投保参数,如航空险的航班信息;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 份数
	 */
	@ApiField("copies")
	private Long copies;

	/**
	 * 失效时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 保险标的
	 */
	@ApiField("ins_object")
	private InsObject insObject;

	/**
	 * 被保险人
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保费
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Long getCopies() {
		return this.copies;
	}
	public void setCopies(Long copies) {
		this.copies = copies;
	}

	public Date getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public InsObject getInsObject() {
		return this.insObject;
	}
	public void setInsObject(InsObject insObject) {
		this.insObject = insObject;
	}

	public InsPerson getInsured() {
		return this.insured;
	}
	public void setInsured(InsPerson insured) {
		this.insured = insured;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
