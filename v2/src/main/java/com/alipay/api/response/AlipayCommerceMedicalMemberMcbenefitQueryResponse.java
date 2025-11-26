package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.McBenefitInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.mcbenefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 10:02:41
 */
public class AlipayCommerceMedicalMemberMcbenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5268145735852484141L;

	/** 
	 * 权益详情
	 */
	@ApiField("benefit_info")
	private McBenefitInfo benefitInfo;

	/** 
	 * 已开通的卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/** 
	 * 资产状态
	 */
	@ApiField("card_status")
	private String cardStatus;

	/** 
	 * 过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 是否已开卡
	 */
	@ApiField("open")
	private Boolean open;

	/** 
	 * 开卡时间
	 */
	@ApiField("open_time")
	private Date openTime;

	public void setBenefitInfo(McBenefitInfo benefitInfo) {
		this.benefitInfo = benefitInfo;
	}
	public McBenefitInfo getBenefitInfo( ) {
		return this.benefitInfo;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardId( ) {
		return this.cardId;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	public String getCardStatus( ) {
		return this.cardStatus;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public Date getOpenTime( ) {
		return this.openTime;
	}

}
