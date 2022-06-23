package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消费记录模型
 *
 * @author auto create
 * @since 1.0, 2021-04-27 16:12:09
 */
public class ConsumeRecord extends AlipayObject {

	private static final long serialVersionUID = 2548351835264288886L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 业务状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 业务状态文案
	 */
	@ApiField("biz_state_desc")
	private String bizStateDesc;

	/**
	 * 账单金额，单位分
	 */
	@ApiField("consume_fee")
	private String consumeFee;

	/**
	 * 删除类型
	 */
	@ApiField("delete_type")
	private String deleteType;

	/**
	 * 资金明细列表
	 */
	@ApiListField("fund_items")
	@ApiField("fund_item")
	private List<FundItem> fundItems;

	/**
	 * 业务创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 业务更新时间
	 */
	@ApiField("gmt_biz_modified")
	private Date gmtBizModified;

	/**
	 * 资金流向（收入/支出）
	 */
	@ApiField("in_out")
	private String inOut;

	/**
	 * 商家订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 对方展示logo
	 */
	@ApiField("opposite_logo")
	private String oppositeLogo;

	/**
	 * 对方展示名称
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	/**
	 * 本方登录id（脱敏）
	 */
	@ApiField("owner_logon_id")
	private String ownerLogonId;

	/**
	 * 本方名称（脱敏)
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 是否是退款
	 */
	@ApiField("refund")
	private Boolean refund;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getBizState() {
		return this.bizState;
	}
	public void setBizState(String bizState) {
		this.bizState = bizState;
	}

	public String getBizStateDesc() {
		return this.bizStateDesc;
	}
	public void setBizStateDesc(String bizStateDesc) {
		this.bizStateDesc = bizStateDesc;
	}

	public String getConsumeFee() {
		return this.consumeFee;
	}
	public void setConsumeFee(String consumeFee) {
		this.consumeFee = consumeFee;
	}

	public String getDeleteType() {
		return this.deleteType;
	}
	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}

	public List<FundItem> getFundItems() {
		return this.fundItems;
	}
	public void setFundItems(List<FundItem> fundItems) {
		this.fundItems = fundItems;
	}

	public Date getGmtBizCreate() {
		return this.gmtBizCreate;
	}
	public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

	public Date getGmtBizModified() {
		return this.gmtBizModified;
	}
	public void setGmtBizModified(Date gmtBizModified) {
		this.gmtBizModified = gmtBizModified;
	}

	public String getInOut() {
		return this.inOut;
	}
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOppositeLogo() {
		return this.oppositeLogo;
	}
	public void setOppositeLogo(String oppositeLogo) {
		this.oppositeLogo = oppositeLogo;
	}

	public String getOppositeName() {
		return this.oppositeName;
	}
	public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}

	public String getOwnerCardNo() {
		return this.ownerCardNo;
	}
	public void setOwnerCardNo(String ownerCardNo) {
		this.ownerCardNo = ownerCardNo;
	}

	public String getOwnerLogonId() {
		return this.ownerLogonId;
	}
	public void setOwnerLogonId(String ownerLogonId) {
		this.ownerLogonId = ownerLogonId;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Boolean getRefund() {
		return this.refund;
	}
	public void setRefund(Boolean refund) {
		this.refund = refund;
	}

}
