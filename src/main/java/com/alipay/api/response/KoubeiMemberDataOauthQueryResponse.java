package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.oauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-10 16:11:45
 */
public class KoubeiMemberDataOauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2521245429425516931L;

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

}
