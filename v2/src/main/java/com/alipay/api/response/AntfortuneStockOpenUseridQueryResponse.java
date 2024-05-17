package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.open.userid.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 00:29:07
 */
public class AntfortuneStockOpenUseridQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6167418979726976672L;

	/** 
	 * 用户证券签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
