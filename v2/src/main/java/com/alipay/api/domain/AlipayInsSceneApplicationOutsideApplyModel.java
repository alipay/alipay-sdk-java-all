package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户投保调用
 *
 * @author auto create
 * @since 1.0, 2022-10-12 16:57:18
 */
public class AlipayInsSceneApplicationOutsideApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3757651831388549479L;

	/**
	 * 保险干系人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 业务因子信息
	 */
	@ApiField("biz_factor")
	private String bizFactor;

	/**
	 * 保险止期
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 生效日期
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 被保人信息
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 外部业务号(幂等字段)
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保费信息，一口价场景可以为空，定价规则较为复杂场景需外部传入用于业务核价，单位(分)
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品号
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 保额(单位:分)，可选
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public String getBizFactor() {
		return this.bizFactor;
	}
	public void setBizFactor(String bizFactor) {
		this.bizFactor = bizFactor;
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

	public List<InsPerson> getInsureds() {
		return this.insureds;
	}
	public void setInsureds(List<InsPerson> insureds) {
		this.insureds = insureds;
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

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
