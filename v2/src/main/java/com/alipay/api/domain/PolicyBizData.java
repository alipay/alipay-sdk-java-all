package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单扩展字段
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:54:30
 */
public class PolicyBizData extends AlipayObject {

	private static final long serialVersionUID = 6466353619169836685L;

	/**
	 * 渠道用户标识
	 */
	@ApiField("channel_user_tag")
	private String channelUserTag;

	/**
	 * 保单结束日期
	 */
	@ApiField("effect_end_date")
	private Date effectEndDate;

	/**
	 * 保单生效日期
	 */
	@ApiField("effect_start_date")
	private Date effectStartDate;

	/**
	 * 渠道
	 */
	@ApiField("entrance")
	private String entrance;

	/**
	 * 承保状态:  1-已出单
	 */
	@ApiField("insure_status")
	private String insureStatus;

	/**
	 * 合作商机构ID:  从保单的 bizData 中获取
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 出单保费金额,单位:分
	 */
	@ApiField("premium_amount")
	private Long premiumAmount;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 1.0001
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 标准产品ID: 从保单信息中获取
	 */
	@ApiField("sp_no")
	private String spNo;

	public String getChannelUserTag() {
		return this.channelUserTag;
	}
	public void setChannelUserTag(String channelUserTag) {
		this.channelUserTag = channelUserTag;
	}

	public Date getEffectEndDate() {
		return this.effectEndDate;
	}
	public void setEffectEndDate(Date effectEndDate) {
		this.effectEndDate = effectEndDate;
	}

	public Date getEffectStartDate() {
		return this.effectStartDate;
	}
	public void setEffectStartDate(Date effectStartDate) {
		this.effectStartDate = effectStartDate;
	}

	public String getEntrance() {
		return this.entrance;
	}
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}

	public String getInsureStatus() {
		return this.insureStatus;
	}
	public void setInsureStatus(String insureStatus) {
		this.insureStatus = insureStatus;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public Long getPremiumAmount() {
		return this.premiumAmount;
	}
	public void setPremiumAmount(Long premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSpNo() {
		return this.spNo;
	}
	public void setSpNo(String spNo) {
		this.spNo = spNo;
	}

}
