package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-11 14:35:00
 */
public class AlipayMarketingVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7889739838619621925L;

	/** 
	 * 券余额(元)
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 券交易账单信息(核销交易信息、交易退款信息等可能存在多条)
	 */
	@ApiListField("bill_details")
	@ApiField("voucher_bill_detail")
	private List<VoucherBillDetail> billDetails;

	/** 
	 * 扩展信息,JSON格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 券激活时间(券可以使用起始时间)
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/** 
	 * 券创建时间(券发券时间)
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 券过期时间(券可以使用截止时间)
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/** 
	 * 券名称(用户看到券名称)
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 券状态(ENABLED:可用,DISABLED:不可用,DELETE:删除状态,TRANS:发放中,TRANSFER:已转增,UNC:未领取,USED:已使用,USING:使用中,REFUNDED:已退款,REFUNDING:使用中,UNACTIVE:未激活,EXPIRED:已过期)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券模板ID(模板唯一标识,创建模板返回)
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 券面额(元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 券所属用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 券ID(同入参券ID)
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setBillDetails(List<VoucherBillDetail> billDetails) {
		this.billDetails = billDetails;
	}
	public List<VoucherBillDetail> getBillDetails( ) {
		return this.billDetails;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}
	public Date getGmtActive( ) {
		return this.gmtActive;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}
	public Date getGmtExpired( ) {
		return this.gmtExpired;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
