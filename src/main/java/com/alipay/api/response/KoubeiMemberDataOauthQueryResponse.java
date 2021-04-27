package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.oauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-28 16:35:01
 */
public class KoubeiMemberDataOauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5842294355174896987L;

	/** 
	 * 扩展信息, 目前保留未用
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/** 
	 * 商户id
	 */
	@ApiField("operator_partner_id")
	private String operatorPartnerId;

	/** 
	 * 操作人身份，PROVIDER:服务商,PROVIDER_STAFF:服务商员工,MER:商户,MER_STAFF:商户员工,SALES:阿里销售小二
	 */
	@ApiField("operator_type")
	private String operatorType;

	/** 
	 * 操作人身份是商家员工(MER_STAFF)或服务商员工(PROVIDER_STAFF)时将返回其可操作的门店id列表
	 */
	@ApiField("shop_ids")
	private String shopIds;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorId( ) {
		return this.operatorId;
	}

	public void setOperatorPartnerId(String operatorPartnerId) {
		this.operatorPartnerId = operatorPartnerId;
	}
	public String getOperatorPartnerId( ) {
		return this.operatorPartnerId;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	public String getOperatorType( ) {
		return this.operatorType;
	}

	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}
	public String getShopIds( ) {
		return this.shopIds;
	}

}
