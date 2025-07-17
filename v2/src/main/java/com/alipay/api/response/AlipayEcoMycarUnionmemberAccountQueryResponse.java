package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.unionmember.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-13 15:47:24
 */
public class AlipayEcoMycarUnionmemberAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8568375366928598659L;

	/** 
	 * 权益凭证ID，无凭证类权益的情况下为空
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

	/** 
	 * 车生活联名会员的会员卡号，入会时生成，同步商户时传给商户
	 */
	@ApiField("biz_card_no")
	private String bizCardNo;

	/** 
	 * 入会时间
	 */
	@ApiField("open_date")
	private Date openDate;

	/** 
	 * 商户侧与当前会员身份关联的业务ID（入会时传入，商户查询时原样返回）
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/** 
	 * 商户侧的用户ID（入会时传入，商户查询时原样返回）
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/** 
	 * 会员状态（已入会/未入会）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 到期时间
	 */
	@ApiField("valid_date")
	private Date validDate;

	public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}
	public List<String> getBenefitIds( ) {
		return this.benefitIds;
	}

	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}
	public String getBizCardNo( ) {
		return this.bizCardNo;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public Date getOpenDate( ) {
		return this.openDate;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}
	public String getOutUserId( ) {
		return this.outUserId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public Date getValidDate( ) {
		return this.validDate;
	}

}
