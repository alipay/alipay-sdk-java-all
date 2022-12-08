package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherBillDetail;
import com.alipay.api.domain.VcpDiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-05 20:36:55
 */
public class AlipayMarketingVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3598813141112846622L;

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
	 * 折扣信息
	 */
	@ApiField("discount_info")
	private VcpDiscountInfo discountInfo;

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
	 * 券创建时间(即发券时间)
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
	 * 券所属用户ID(映射openId)
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 券状态。枚举值如下：
ENABLED：可用；
DISABLED：不可用；
DELETE：删除状态；
TRANS：发放中；
TRANSFER：已转增；
UNC：未领取；
USED：已使用；
USING：使用中；
REFUNDED：已退款；
REFUNDING：退款中；
UNACTIVE：未激活；
EXPIRED：已过期。
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
	 * 券核销规则信息
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

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

	public void setDiscountInfo(VcpDiscountInfo discountInfo) {
		this.discountInfo = discountInfo;
	}
	public VcpDiscountInfo getDiscountInfo( ) {
		return this.discountInfo;
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

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
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

	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}
	public String getVoucherDescription( ) {
		return this.voucherDescription;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
