package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.bizorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-21 15:27:45
 */
public class AlipayFundWalletBizorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7236679717757873348L;

	/** 
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 钱包业务金额
	 */
	@ApiField("biz_amount")
	private String bizAmount;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 业务单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 业务子类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/** 
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 钱包id
	 */
	@ApiField("wallet_id")
	private String walletId;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setBizAmount(String bizAmount) {
		this.bizAmount = bizAmount;
	}
	public String getBizAmount( ) {
		return this.bizAmount;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDisplayName( ) {
		return this.displayName;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType( ) {
		return this.subBizType;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getWalletId( ) {
		return this.walletId;
	}

}
