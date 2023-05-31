package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消费记录信息-主记录
 *
 * @author auto create
 * @since 1.0, 2023-01-30 20:03:19
 */
public class ConsumeRecordAOPModel extends AlipayObject {

	private static final long serialVersionUID = 4845986198757384473L;

	/**
	 * 接入渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 扩展状态
	 */
	@ApiField("additional_status")
	private String additionalStatus;

	/**
	 * 用户下一步动作
	 */
	@ApiListField("biz_actions")
	@ApiField("string")
	private List<String> bizActions;

	/**
	 * 业务扩展流水号
	 */
	@ApiField("biz_extra_no")
	private String bizExtraNo;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_in_no")
	private String bizInNo;

	/**
	 * 业务备注
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 业务发起方
	 */
	@ApiField("biz_orig")
	private String bizOrig;

	/**
	 * 业务外部流水号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 业务状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 业务子类型
	 */
	@ApiField("biz_sub_type")
	private String bizSubType;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 自定义分类Id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 总费用
	 */
	@ApiField("consume_fee")
	private String consumeFee;

	/**
	 * 消费记录退款状态
	 */
	@ApiField("consume_refund_status")
	private String consumeRefundStatus;

	/**
	 * 来源
	 */
	@ApiField("consume_site")
	private String consumeSite;

	/**
	 * 消费记录状态
	 */
	@ApiField("consume_status")
	private String consumeStatus;

	/**
	 * 标题
	 */
	@ApiField("consume_title")
	private String consumeTitle;

	/**
	 * 消费记录类型
	 */
	@ApiField("consume_type")
	private String consumeType;

	/**
	 * 货币币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 消费记录永久删除时间
	 */
	@ApiField("delete_over_time")
	private Date deleteOverTime;

	/**
	 * 消费记录删除时间
	 */
	@ApiField("delete_time")
	private Date deleteTime;

	/**
	 * 消费记录删除标记
	 */
	@ApiField("delete_type")
	private String deleteType;

	/**
	 * 充退状态，可能为空，目前只针对交易业务有效
	 */
	@ApiField("depositback_status")
	private String depositbackStatus;

	/**
	 * 是否锁定标记
	 */
	@ApiField("flag_locked")
	private String flagLocked;

	/**
	 * 退款标记
	 */
	@ApiField("flag_refund")
	private String flagRefund;

	/**
	 * 业务数据创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 业务数据最后更新时间
	 */
	@ApiField("gmt_biz_modified")
	private Date gmtBizModified;

	/**
	 * 消费记录创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 消费记录最后更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 收到付款时间（买家付款时间）
	 */
	@ApiField("gmt_receive_pay")
	private Date gmtReceivePay;

	/**
	 * 打款给卖家时间（卖家收款时间）
	 */
	@ApiField("gmt_send_pay")
	private Date gmtSendPay;

	/**
	 * 是否有资金明细
	 */
	@ApiField("has_fund_item")
	private Boolean hasFundItem;

	/**
	 * 是否有新资金明细(落地新流程交易的消费记录)
	 */
	@ApiField("has_new_fund_item")
	private Boolean hasNewFundItem;

	/**
	 * 收入/支出
	 */
	@ApiField("in_out")
	private String inOut;

	/**
	 * 对方卡号
	 */
	@ApiField("opposite_card_no")
	private String oppositeCardNo;

	/**
	 * 对方登录ID
	 */
	@ApiField("opposite_login_id")
	private String oppositeLoginId;

	/**
	 * 对方名称
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/**
	 * 对方昵称
	 */
	@ApiField("opposite_nick_name")
	private String oppositeNickName;

	/**
	 * 对方卡号
	 */
	@ApiField("opposite_open_id")
	private String oppositeOpenId;

	/**
	 * 消费记录原标题
	 */
	@ApiField("orig_consume_title")
	private String origConsumeTitle;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	/**
	 * 本方客户ID
	 */
	@ApiField("owner_customer_id")
	private String ownerCustomerId;

	/**
	 * 本方登录ID
	 */
	@ApiField("owner_login_id")
	private String ownerLoginId;

	/**
	 * 本方名称
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 本方昵称
	 */
	@ApiField("owner_nick")
	private String ownerNick;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 创建渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 代付人&亲密付人姓名
	 */
	@ApiField("peerpayer_real_name")
	private String peerpayerRealName;

	/**
	 * 产品码
	 */
	@ApiField("product")
	private String product;

	/**
	 * 最后一次退款金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 服务费
	 */
	@ApiField("service_fee")
	private String serviceFee;

	/**
	 * 多次成功退款总金额
	 */
	@ApiField("total_refund_fee")
	private String totalRefundFee;

	/**
	 * 交易来源
	 */
	@ApiField("trade_from")
	private String tradeFrom;

	public String getAccessChannel() {
		return this.accessChannel;
	}
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

	public String getAdditionalStatus() {
		return this.additionalStatus;
	}
	public void setAdditionalStatus(String additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

	public List<String> getBizActions() {
		return this.bizActions;
	}
	public void setBizActions(List<String> bizActions) {
		this.bizActions = bizActions;
	}

	public String getBizExtraNo() {
		return this.bizExtraNo;
	}
	public void setBizExtraNo(String bizExtraNo) {
		this.bizExtraNo = bizExtraNo;
	}

	public String getBizInNo() {
		return this.bizInNo;
	}
	public void setBizInNo(String bizInNo) {
		this.bizInNo = bizInNo;
	}

	public String getBizMemo() {
		return this.bizMemo;
	}
	public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

	public String getBizOrig() {
		return this.bizOrig;
	}
	public void setBizOrig(String bizOrig) {
		this.bizOrig = bizOrig;
	}

	public String getBizOutNo() {
		return this.bizOutNo;
	}
	public void setBizOutNo(String bizOutNo) {
		this.bizOutNo = bizOutNo;
	}

	public String getBizState() {
		return this.bizState;
	}
	public void setBizState(String bizState) {
		this.bizState = bizState;
	}

	public String getBizSubType() {
		return this.bizSubType;
	}
	public void setBizSubType(String bizSubType) {
		this.bizSubType = bizSubType;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getConsumeFee() {
		return this.consumeFee;
	}
	public void setConsumeFee(String consumeFee) {
		this.consumeFee = consumeFee;
	}

	public String getConsumeRefundStatus() {
		return this.consumeRefundStatus;
	}
	public void setConsumeRefundStatus(String consumeRefundStatus) {
		this.consumeRefundStatus = consumeRefundStatus;
	}

	public String getConsumeSite() {
		return this.consumeSite;
	}
	public void setConsumeSite(String consumeSite) {
		this.consumeSite = consumeSite;
	}

	public String getConsumeStatus() {
		return this.consumeStatus;
	}
	public void setConsumeStatus(String consumeStatus) {
		this.consumeStatus = consumeStatus;
	}

	public String getConsumeTitle() {
		return this.consumeTitle;
	}
	public void setConsumeTitle(String consumeTitle) {
		this.consumeTitle = consumeTitle;
	}

	public String getConsumeType() {
		return this.consumeType;
	}
	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getDeleteOverTime() {
		return this.deleteOverTime;
	}
	public void setDeleteOverTime(Date deleteOverTime) {
		this.deleteOverTime = deleteOverTime;
	}

	public Date getDeleteTime() {
		return this.deleteTime;
	}
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public String getDeleteType() {
		return this.deleteType;
	}
	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}

	public String getDepositbackStatus() {
		return this.depositbackStatus;
	}
	public void setDepositbackStatus(String depositbackStatus) {
		this.depositbackStatus = depositbackStatus;
	}

	public String getFlagLocked() {
		return this.flagLocked;
	}
	public void setFlagLocked(String flagLocked) {
		this.flagLocked = flagLocked;
	}

	public String getFlagRefund() {
		return this.flagRefund;
	}
	public void setFlagRefund(String flagRefund) {
		this.flagRefund = flagRefund;
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

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtReceivePay() {
		return this.gmtReceivePay;
	}
	public void setGmtReceivePay(Date gmtReceivePay) {
		this.gmtReceivePay = gmtReceivePay;
	}

	public Date getGmtSendPay() {
		return this.gmtSendPay;
	}
	public void setGmtSendPay(Date gmtSendPay) {
		this.gmtSendPay = gmtSendPay;
	}

	public Boolean getHasFundItem() {
		return this.hasFundItem;
	}
	public void setHasFundItem(Boolean hasFundItem) {
		this.hasFundItem = hasFundItem;
	}

	public Boolean getHasNewFundItem() {
		return this.hasNewFundItem;
	}
	public void setHasNewFundItem(Boolean hasNewFundItem) {
		this.hasNewFundItem = hasNewFundItem;
	}

	public String getInOut() {
		return this.inOut;
	}
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	public String getOppositeCardNo() {
		return this.oppositeCardNo;
	}
	public void setOppositeCardNo(String oppositeCardNo) {
		this.oppositeCardNo = oppositeCardNo;
	}

	public String getOppositeLoginId() {
		return this.oppositeLoginId;
	}
	public void setOppositeLoginId(String oppositeLoginId) {
		this.oppositeLoginId = oppositeLoginId;
	}

	public String getOppositeName() {
		return this.oppositeName;
	}
	public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}

	public String getOppositeNickName() {
		return this.oppositeNickName;
	}
	public void setOppositeNickName(String oppositeNickName) {
		this.oppositeNickName = oppositeNickName;
	}

	public String getOppositeOpenId() {
		return this.oppositeOpenId;
	}
	public void setOppositeOpenId(String oppositeOpenId) {
		this.oppositeOpenId = oppositeOpenId;
	}

	public String getOrigConsumeTitle() {
		return this.origConsumeTitle;
	}
	public void setOrigConsumeTitle(String origConsumeTitle) {
		this.origConsumeTitle = origConsumeTitle;
	}

	public String getOwnerCardNo() {
		return this.ownerCardNo;
	}
	public void setOwnerCardNo(String ownerCardNo) {
		this.ownerCardNo = ownerCardNo;
	}

	public String getOwnerCustomerId() {
		return this.ownerCustomerId;
	}
	public void setOwnerCustomerId(String ownerCustomerId) {
		this.ownerCustomerId = ownerCustomerId;
	}

	public String getOwnerLoginId() {
		return this.ownerLoginId;
	}
	public void setOwnerLoginId(String ownerLoginId) {
		this.ownerLoginId = ownerLoginId;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerNick() {
		return this.ownerNick;
	}
	public void setOwnerNick(String ownerNick) {
		this.ownerNick = ownerNick;
	}

	public String getOwnerOpenId() {
		return this.ownerOpenId;
	}
	public void setOwnerOpenId(String ownerOpenId) {
		this.ownerOpenId = ownerOpenId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPeerpayerRealName() {
		return this.peerpayerRealName;
	}
	public void setPeerpayerRealName(String peerpayerRealName) {
		this.peerpayerRealName = peerpayerRealName;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getServiceFee() {
		return this.serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getTotalRefundFee() {
		return this.totalRefundFee;
	}
	public void setTotalRefundFee(String totalRefundFee) {
		this.totalRefundFee = totalRefundFee;
	}

	public String getTradeFrom() {
		return this.tradeFrom;
	}
	public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}

}
