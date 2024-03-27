package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金明细模型
 *
 * @author auto create
 * @since 1.0, 2023-01-30 20:03:19
 */
public class FundItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 2571438635622919172L;

	/**
	 * 财务外部单据号
	 */
	@ApiField("acctrans_out_biz_no")
	private String acctransOutBizNo;

	/**
	 * 资金变动金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产类型编码
	 */
	@ApiField("assert_type_code")
	private String assertTypeCode;

	/**
	 * 银行卡支付工具类型
	 */
	@ApiField("bank_card_pay_type")
	private String bankCardPayType;

	/**
	 * 银行卡类型
	 */
	@ApiField("bank_card_type")
	private String bankCardType;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务号
	 */
	@ApiField("biz_in_no")
	private String bizInNo;

	/**
	 * 业务外部流水号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 业务类型（枚举值对应的code）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 币种（数字形式）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 充退金额
	 */
	@ApiField("dback_amount")
	private String dbackAmount;

	/**
	 * 退款申请时间
	 */
	@ApiField("dback_gmt_create")
	private Date dbackGmtCreate;

	/**
	 * 实际/预估银行响应时间
	 */
	@ApiField("dback_gmt_est_bk_ack")
	private Date dbackGmtEstBkAck;

	/**
	 * 预估银行入账时间
	 */
	@ApiField("dback_gmt_est_bk_into")
	private Date dbackGmtEstBkInto;

	/**
	 * 充值账户名
	 */
	@ApiField("dback_inst_account_name")
	private String dbackInstAccountName;

	/**
	 * 充值卡号（后四位）
	 */
	@ApiField("dback_inst_account_no")
	private String dbackInstAccountNo;

	/**
	 * 机构ID
	 */
	@ApiField("dback_inst_id")
	private String dbackInstId;

	/**
	 * 机构名称
	 */
	@ApiField("dback_inst_name")
	private String dbackInstName;

	/**
	 * 统一支付资金条目ID
	 */
	@ApiField("fid")
	private String fid;

	/**
	 * 面向系统的资金工具接入类型
	 */
	@ApiField("fund_access_type")
	private Long fundAccessType;

	/**
	 * 资金账号。可以是支付宝主卡账号，子卡账号，银行卡号等等。
	 */
	@ApiField("fund_account_no")
	private String fundAccountNo;

	/**
	 * 资金业务类型枚举
	 */
	@ApiField("fund_biz_type")
	private Long fundBizType;

	/**
	 * 资金明细创建时间
	 */
	@ApiField("fund_create_time")
	private Date fundCreateTime;

	/**
	 * 资金变动完成时间
	 */
	@ApiField("fund_finish_time")
	private Date fundFinishTime;

	/**
	 * 资金流向枚举
	 */
	@ApiField("fund_in_out")
	private Long fundInOut;

	/**
	 * 资金工具机构
	 */
	@ApiField("fund_inst_id")
	private String fundInstId;

	/**
	 * 资金明细最后修改时间
	 */
	@ApiField("fund_modify_time")
	private Date fundModifyTime;

	/**
	 * 资金状态
	 */
	@ApiField("fund_status")
	private String fundStatus;

	/**
	 * 该资金变动的资金工具是否为ownerCardNo所拥有
	 */
	@ApiField("fund_tool_belong_to_crowner")
	private Boolean fundToolBelongToCrowner;

	/**
	 * fundToolBelongToCROwner为false时，该字段记录资金工具的实际拥有者
	 */
	@ApiField("fund_tool_owner_card_no")
	private String fundToolOwnerCardNo;

	/**
	 * fundToolBelongToCROwner为false时，该字段记录资金工具的实际拥有者
	 */
	@ApiField("fund_tool_owner_open_id")
	private String fundToolOwnerOpenId;

	/**
	 * 面向用户的资金工具类型
	 */
	@ApiField("fund_tool_type_for_crowner")
	private String fundToolTypeForCrowner;

	/**
	 * 面向系统的资金工具类型
	 */
	@ApiField("fund_tool_type_for_system")
	private String fundToolTypeForSystem;

	/**
	 * 资金工具名字（中文），供外部直接展示用。
	 */
	@ApiField("fund_tool_type_name")
	private String fundToolTypeName;

	/**
	 * 业务创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 差错资金自服务入口开放类型，TAOBAO-对淘宝开放，ALIPAY-对支付宝站内开放
	 */
	@ApiField("open_self_slip_type")
	private String openSelfSlipType;

	/**
	 * 导致该资金变动在业务上的另一方的卡别名
	 */
	@ApiField("opposite_biz_card_alias")
	private String oppositeBizCardAlias;

	/**
	 * 导致该资金变动在业务上的另一方的卡别名。
	 */
	@ApiField("opposite_biz_card_no")
	private String oppositeBizCardNo;

	/**
	 * 导致该资金变动在业务上的另一方的卡别名。
	 */
	@ApiField("opposite_biz_open_id")
	private String oppositeBizOpenId;

	/**
	 * 导致该资金变动在资金上的另一方的卡别名。
	 */
	@ApiField("opposite_fund_card_no")
	private String oppositeFundCardNo;

	/**
	 * 导致该资金变动在资金上的另一方的卡别名。
	 */
	@ApiField("opposite_fund_open_id")
	private String oppositeFundOpenId;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 银行卡退款进度状态
	 */
	@ApiField("refund_bank_status")
	private String refundBankStatus;

	/**
	 * 差错可提取金额，单位元
	 */
	@ApiField("slip_amount")
	private String slipAmount;

	/**
	 * 差错挂账id
	 */
	@ApiField("slip_id")
	private String slipId;

	/**
	 * 差错挂账资金申领状态，W-待申领，P-申领中，S-成功，F-失败
	 */
	@ApiField("slip_status")
	private String slipStatus;

	/**
	 * 预付子卡类型
	 */
	@ApiField("sub_prepaid_card_type")
	private String subPrepaidCardType;

	/**
	 * 统一支付ID
	 */
	@ApiField("uid")
	private String uid;

	public String getAcctransOutBizNo() {
		return this.acctransOutBizNo;
	}
	public void setAcctransOutBizNo(String acctransOutBizNo) {
		this.acctransOutBizNo = acctransOutBizNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssertTypeCode() {
		return this.assertTypeCode;
	}
	public void setAssertTypeCode(String assertTypeCode) {
		this.assertTypeCode = assertTypeCode;
	}

	public String getBankCardPayType() {
		return this.bankCardPayType;
	}
	public void setBankCardPayType(String bankCardPayType) {
		this.bankCardPayType = bankCardPayType;
	}

	public String getBankCardType() {
		return this.bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizInNo() {
		return this.bizInNo;
	}
	public void setBizInNo(String bizInNo) {
		this.bizInNo = bizInNo;
	}

	public String getBizOutNo() {
		return this.bizOutNo;
	}
	public void setBizOutNo(String bizOutNo) {
		this.bizOutNo = bizOutNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDbackAmount() {
		return this.dbackAmount;
	}
	public void setDbackAmount(String dbackAmount) {
		this.dbackAmount = dbackAmount;
	}

	public Date getDbackGmtCreate() {
		return this.dbackGmtCreate;
	}
	public void setDbackGmtCreate(Date dbackGmtCreate) {
		this.dbackGmtCreate = dbackGmtCreate;
	}

	public Date getDbackGmtEstBkAck() {
		return this.dbackGmtEstBkAck;
	}
	public void setDbackGmtEstBkAck(Date dbackGmtEstBkAck) {
		this.dbackGmtEstBkAck = dbackGmtEstBkAck;
	}

	public Date getDbackGmtEstBkInto() {
		return this.dbackGmtEstBkInto;
	}
	public void setDbackGmtEstBkInto(Date dbackGmtEstBkInto) {
		this.dbackGmtEstBkInto = dbackGmtEstBkInto;
	}

	public String getDbackInstAccountName() {
		return this.dbackInstAccountName;
	}
	public void setDbackInstAccountName(String dbackInstAccountName) {
		this.dbackInstAccountName = dbackInstAccountName;
	}

	public String getDbackInstAccountNo() {
		return this.dbackInstAccountNo;
	}
	public void setDbackInstAccountNo(String dbackInstAccountNo) {
		this.dbackInstAccountNo = dbackInstAccountNo;
	}

	public String getDbackInstId() {
		return this.dbackInstId;
	}
	public void setDbackInstId(String dbackInstId) {
		this.dbackInstId = dbackInstId;
	}

	public String getDbackInstName() {
		return this.dbackInstName;
	}
	public void setDbackInstName(String dbackInstName) {
		this.dbackInstName = dbackInstName;
	}

	public String getFid() {
		return this.fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}

	public Long getFundAccessType() {
		return this.fundAccessType;
	}
	public void setFundAccessType(Long fundAccessType) {
		this.fundAccessType = fundAccessType;
	}

	public String getFundAccountNo() {
		return this.fundAccountNo;
	}
	public void setFundAccountNo(String fundAccountNo) {
		this.fundAccountNo = fundAccountNo;
	}

	public Long getFundBizType() {
		return this.fundBizType;
	}
	public void setFundBizType(Long fundBizType) {
		this.fundBizType = fundBizType;
	}

	public Date getFundCreateTime() {
		return this.fundCreateTime;
	}
	public void setFundCreateTime(Date fundCreateTime) {
		this.fundCreateTime = fundCreateTime;
	}

	public Date getFundFinishTime() {
		return this.fundFinishTime;
	}
	public void setFundFinishTime(Date fundFinishTime) {
		this.fundFinishTime = fundFinishTime;
	}

	public Long getFundInOut() {
		return this.fundInOut;
	}
	public void setFundInOut(Long fundInOut) {
		this.fundInOut = fundInOut;
	}

	public String getFundInstId() {
		return this.fundInstId;
	}
	public void setFundInstId(String fundInstId) {
		this.fundInstId = fundInstId;
	}

	public Date getFundModifyTime() {
		return this.fundModifyTime;
	}
	public void setFundModifyTime(Date fundModifyTime) {
		this.fundModifyTime = fundModifyTime;
	}

	public String getFundStatus() {
		return this.fundStatus;
	}
	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}

	public Boolean getFundToolBelongToCrowner() {
		return this.fundToolBelongToCrowner;
	}
	public void setFundToolBelongToCrowner(Boolean fundToolBelongToCrowner) {
		this.fundToolBelongToCrowner = fundToolBelongToCrowner;
	}

	public String getFundToolOwnerCardNo() {
		return this.fundToolOwnerCardNo;
	}
	public void setFundToolOwnerCardNo(String fundToolOwnerCardNo) {
		this.fundToolOwnerCardNo = fundToolOwnerCardNo;
	}

	public String getFundToolOwnerOpenId() {
		return this.fundToolOwnerOpenId;
	}
	public void setFundToolOwnerOpenId(String fundToolOwnerOpenId) {
		this.fundToolOwnerOpenId = fundToolOwnerOpenId;
	}

	public String getFundToolTypeForCrowner() {
		return this.fundToolTypeForCrowner;
	}
	public void setFundToolTypeForCrowner(String fundToolTypeForCrowner) {
		this.fundToolTypeForCrowner = fundToolTypeForCrowner;
	}

	public String getFundToolTypeForSystem() {
		return this.fundToolTypeForSystem;
	}
	public void setFundToolTypeForSystem(String fundToolTypeForSystem) {
		this.fundToolTypeForSystem = fundToolTypeForSystem;
	}

	public String getFundToolTypeName() {
		return this.fundToolTypeName;
	}
	public void setFundToolTypeName(String fundToolTypeName) {
		this.fundToolTypeName = fundToolTypeName;
	}

	public Date getGmtBizCreate() {
		return this.gmtBizCreate;
	}
	public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

	public String getOpenSelfSlipType() {
		return this.openSelfSlipType;
	}
	public void setOpenSelfSlipType(String openSelfSlipType) {
		this.openSelfSlipType = openSelfSlipType;
	}

	public String getOppositeBizCardAlias() {
		return this.oppositeBizCardAlias;
	}
	public void setOppositeBizCardAlias(String oppositeBizCardAlias) {
		this.oppositeBizCardAlias = oppositeBizCardAlias;
	}

	public String getOppositeBizCardNo() {
		return this.oppositeBizCardNo;
	}
	public void setOppositeBizCardNo(String oppositeBizCardNo) {
		this.oppositeBizCardNo = oppositeBizCardNo;
	}

	public String getOppositeBizOpenId() {
		return this.oppositeBizOpenId;
	}
	public void setOppositeBizOpenId(String oppositeBizOpenId) {
		this.oppositeBizOpenId = oppositeBizOpenId;
	}

	public String getOppositeFundCardNo() {
		return this.oppositeFundCardNo;
	}
	public void setOppositeFundCardNo(String oppositeFundCardNo) {
		this.oppositeFundCardNo = oppositeFundCardNo;
	}

	public String getOppositeFundOpenId() {
		return this.oppositeFundOpenId;
	}
	public void setOppositeFundOpenId(String oppositeFundOpenId) {
		this.oppositeFundOpenId = oppositeFundOpenId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOwnerCardNo() {
		return this.ownerCardNo;
	}
	public void setOwnerCardNo(String ownerCardNo) {
		this.ownerCardNo = ownerCardNo;
	}

	public String getOwnerOpenId() {
		return this.ownerOpenId;
	}
	public void setOwnerOpenId(String ownerOpenId) {
		this.ownerOpenId = ownerOpenId;
	}

	public String getRefundBankStatus() {
		return this.refundBankStatus;
	}
	public void setRefundBankStatus(String refundBankStatus) {
		this.refundBankStatus = refundBankStatus;
	}

	public String getSlipAmount() {
		return this.slipAmount;
	}
	public void setSlipAmount(String slipAmount) {
		this.slipAmount = slipAmount;
	}

	public String getSlipId() {
		return this.slipId;
	}
	public void setSlipId(String slipId) {
		this.slipId = slipId;
	}

	public String getSlipStatus() {
		return this.slipStatus;
	}
	public void setSlipStatus(String slipStatus) {
		this.slipStatus = slipStatus;
	}

	public String getSubPrepaidCardType() {
		return this.subPrepaidCardType;
	}
	public void setSubPrepaidCardType(String subPrepaidCardType) {
		this.subPrepaidCardType = subPrepaidCardType;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
