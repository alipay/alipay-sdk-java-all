package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.circular.zft.indirect.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-20 13:52:40
 */
public class AlipayCircularZftIndirectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1499554212654331345L;

	/** 
	 * 签约状态
	 */
	@ApiField("prod_confirm")
	private String prodConfirm;

	/** 
	 * 进件申请单中的二级商户openid
	 */
	@ApiField("relation_openid")
	private String relationOpenid;

	/** 
	 * 进件账户id
	 */
	@ApiField("relation_uid")
	private String relationUid;

	/** 
	 * 进件状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 二级商户确认状态
	 */
	@ApiField("sub_confirm")
	private String subConfirm;

	public void setProdConfirm(String prodConfirm) {
		this.prodConfirm = prodConfirm;
	}
	public String getProdConfirm( ) {
		return this.prodConfirm;
	}

	public void setRelationOpenid(String relationOpenid) {
		this.relationOpenid = relationOpenid;
	}
	public String getRelationOpenid( ) {
		return this.relationOpenid;
	}

	public void setRelationUid(String relationUid) {
		this.relationUid = relationUid;
	}
	public String getRelationUid( ) {
		return this.relationUid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubConfirm(String subConfirm) {
		this.subConfirm = subConfirm;
	}
	public String getSubConfirm( ) {
		return this.subConfirm;
	}

}
