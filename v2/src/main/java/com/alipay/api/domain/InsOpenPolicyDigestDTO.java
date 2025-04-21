package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单摘要数据
 *
 * @author auto create
 * @since 1.0, 2025-03-19 18:14:32
 */
public class InsOpenPolicyDigestDTO extends AlipayObject {

	private static final long serialVersionUID = 4287548149289474818L;

	/**
	 * 保险公司id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 保司保单号
	 */
	@ApiField("inst_policy_no")
	private String instPolicyNo;

	/**
	 * 保单生效时间
	 */
	@ApiField("policy_effect_time")
	private String policyEffectTime;

	/**
	 * 保单结束时间
	 */
	@ApiField("policy_end_time")
	private Date policyEndTime;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单状态：INIT (初始化/未出单)，ISSUED(已出单)，SURRENDERRED(已退保)，CLOSED(关单已解约
)，SUSPENSION(已中止)
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/**
	 * 预下单id
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/**
	 * 保费，单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品编码，标识某一类产品 :YFX (运费险),JYBZ(交易保障险),SHX(售后险)
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 自行寄回保额，单位分，仅在运费险产品返回
	 */
	@ApiField("self_delivery_sum_insured")
	private Long selfDeliverySumInsured;

	/**
	 * 保额，单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstPolicyNo() {
		return this.instPolicyNo;
	}
	public void setInstPolicyNo(String instPolicyNo) {
		this.instPolicyNo = instPolicyNo;
	}

	public String getPolicyEffectTime() {
		return this.policyEffectTime;
	}
	public void setPolicyEffectTime(String policyEffectTime) {
		this.policyEffectTime = policyEffectTime;
	}

	public Date getPolicyEndTime() {
		return this.policyEndTime;
	}
	public void setPolicyEndTime(Date policyEndTime) {
		this.policyEndTime = policyEndTime;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getSelfDeliverySumInsured() {
		return this.selfDeliverySumInsured;
	}
	public void setSelfDeliverySumInsured(Long selfDeliverySumInsured) {
		this.selfDeliverySumInsured = selfDeliverySumInsured;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
