package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BenefitInterestInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehownerbase.benefitinterest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-16 14:17:22
 */
public class AlipayCommerceTransportVehownerbaseBenefitinterestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8695746981393547394L;

	/** 
	 * 权益编码
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/** 
	 * 权益详细信息，包含描述、值、类型等信息。
	 */
	@ApiField("benefit_interest_info")
	private BenefitInterestInfoResponse benefitInterestInfo;

	/** 
	 * 权益激活状态。权益的生效状态需结合生效日期综合判断，即权益激活状态为S，且当前日期在生效日期内，权益为生效状态，其他情况为未生效状态。
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	/** 
	 * 权益生效截止时间，格式为yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("effective_end_time")
	private Date effectiveEndTime;

	/** 
	 * 权益生效起始时间，格式为yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("effective_start_time")
	private Date effectiveStartTime;

	/** 
	 * 外部商户用户ID，用户关联用户信息
	 */
	@ApiField("operator_user_id")
	private String operatorUserId;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

	public void setBenefitInterestInfo(BenefitInterestInfoResponse benefitInterestInfo) {
		this.benefitInterestInfo = benefitInterestInfo;
	}
	public BenefitInterestInfoResponse getBenefitInterestInfo( ) {
		return this.benefitInterestInfo;
	}

	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}
	public String getBenefitStatus( ) {
		return this.benefitStatus;
	}

	public void setEffectiveEndTime(Date effectiveEndTime) {
		this.effectiveEndTime = effectiveEndTime;
	}
	public Date getEffectiveEndTime( ) {
		return this.effectiveEndTime;
	}

	public void setEffectiveStartTime(Date effectiveStartTime) {
		this.effectiveStartTime = effectiveStartTime;
	}
	public Date getEffectiveStartTime( ) {
		return this.effectiveStartTime;
	}

	public void setOperatorUserId(String operatorUserId) {
		this.operatorUserId = operatorUserId;
	}
	public String getOperatorUserId( ) {
		return this.operatorUserId;
	}

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
