package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineMarketShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7786143221564688934L;

	/** 
	 * 修改门店请求受理成功后返回的支付宝流水ID，根据此ID调用接口
alipay.offline.market.applyorder.batchquery，能够获取当前修改店铺请求审核状态、驳回原因等信息。
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 废弃字段。
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 同步请求如果支付宝受理成功，将返回AUDITING状态。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 废弃字段，T表示上架,F表示未上架。
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 废弃字段，T表示显示，F表示隐藏。
	 */
	@ApiField("is_show")
	private String isShow;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public String getIsOnline( ) {
		return this.isOnline;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getIsShow( ) {
		return this.isShow;
	}

}
