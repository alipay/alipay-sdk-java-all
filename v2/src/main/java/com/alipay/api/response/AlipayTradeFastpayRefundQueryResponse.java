package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DepositBackInfo;
import com.alipay.api.domain.EnterprisePayInfo;
import com.alipay.api.domain.RefundChargeInfo;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.RefundRoyaltyResult;
import com.alipay.api.domain.VoucherDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.fastpay.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 16:17:22
 */
public class AlipayTradeFastpayRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1465792718282928483L;

	/** 
	 * 银行卡冲退信息；
默认不返回该信息，需要在入参的query_options中指定"deposit_back_info"值时才返回该字段信息。
	 */
	@ApiField("deposit_back_info")
	private DepositBackInfo depositBackInfo;

	/** 
	 * 银行卡冲退信息列表。
默认不返回该信息，需要在入参的query_options中指定"deposit_back_info_list"值时才返回该字段信息。
	 */
	@ApiListField("deposit_back_info_list")
	@ApiField("deposit_back_info")
	private List<DepositBackInfo> depositBackInfoList;

	/** 
	 * 因公付退款信息，只有入参的query_options中指定enterprise_pay_info时才返回该字段信息
	 */
	@ApiField("enterprise_pay_info")
	private EnterprisePayInfo enterprisePayInfo;

	/** 
	 * 退款失败错误码。只在使用异步退款接口情况下才会返回该字段
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 退款时间。默认不返回该信息，需要在入参的query_options中指定"gmt_refund_pay"值时才返回该字段信息。
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/** 
	 * 行业特殊信息（例如在医保卡支付退款中，医保局向商户返回医疗信息）。
	 */
	@ApiField("industry_sepc_detail")
	private String industrySepcDetail;

	/** 
	 * 本笔退款对应的退款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 创建交易传入的商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 当用户使用芝麻信用先享后付时，且当前的操作为预授权撤销动作时，会返回该字段，代表当前撤销的预授权金额，单位元。
	 */
	@ApiField("pre_auth_cancel_fee")
	private String preAuthCancelFee;

	/** 
	 * 本次退款金额中买家退款金额。单位：元。
该字段默认不返回；
	 */
	@ApiField("present_refund_buyer_amount")
	private String presentRefundBuyerAmount;

	/** 
	 * 本次退款金额中平台优惠退款金额。单位：元。
该字段默认不返回；
	 */
	@ApiField("present_refund_discount_amount")
	private String presentRefundDiscountAmount;

	/** 
	 * 本次退款金额中商家优惠退款金额。单位：元。
该字段默认不返回；
	 */
	@ApiField("present_refund_mdiscount_amount")
	private String presentRefundMdiscountAmount;

	/** 
	 * 本次退款请求，对应的退款金额。单位：元。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 若支付渠道包含医保统筹、个账，则显示退款的渠道信息。如统筹OUTSIDEGOVCARD，个账OUTSIDEACCCARD
	 */
	@ApiField("refund_channel_list")
	private String refundChannelList;

	/** 
	 * 若支付渠道包含医保统筹、个账，全渠道退款成功时返回SUCCESS，全失败时返回FAIL，部分成功时返回PART_SUCCESS
	 */
	@ApiField("refund_channel_status")
	private String refundChannelStatus;

	/** 
	 * 本次退款针对收款方的退收费金额；单位：元。
只在机构间联模式下返回，其它场景下不返回该字段；
	 */
	@ApiField("refund_charge_amount")
	private String refundChargeAmount;

	/** 
	 * 退费信息
	 */
	@ApiListField("refund_charge_info_list")
	@ApiField("refund_charge_info")
	private List<RefundChargeInfo> refundChargeInfoList;

	/** 
	 * 本次退款使用的资金渠道；
默认不返回该信息，需要在入参的query_options中指定"refund_detail_item_list"值时才返回该字段信息。
	 */
	@ApiListField("refund_detail_item_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> refundDetailItemList;

	/** 
	 * 本次退款金额中退惠营宝的金额。单位：元。
	 */
	@ApiField("refund_hyb_amount")
	private String refundHybAmount;

	/** 
	 * 发起退款时，传入的退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/** 
	 * 退分账明细信息，当前仅在直付通产品中返回。
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_result")
	private List<RefundRoyaltyResult> refundRoyaltys;

	/** 
	 * 退款清算编号，用于清算对账使用；
只在机构间联模式下返回，其它场景下不返回该字段；
	 */
	@ApiField("refund_settlement_id")
	private String refundSettlementId;

	/** 
	 * 退款状态。枚举值：
REFUND_SUCCESS 退款处理成功；
未返回该字段表示退款请求未收到或者退款失败；
注：如果退款查询发起时间早于退款时间，或者间隔退款发起时间太短，可能出现退款查询时还没处理成功，后面又处理成功的情况，建议商户在退款发起后间隔10秒以上再发起退款查询请求。
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 本交易支付时使用的所有优惠券信息。 只有在query_options中指定refund_voucher_detail_list时才返回该字段信息。
	 */
	@ApiListField("refund_voucher_detail_list")
	@ApiField("voucher_detail")
	private List<VoucherDetail> refundVoucherDetailList;

	/** 
	 * 本次商户实际退回金额；单位：元。
默认不返回该信息，需要在入参的query_options中指定"refund_detail_item_list"值时才返回该字段信息。
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	/** 
	 * 该笔退款所对应的交易的订单金额。单位：元。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setDepositBackInfo(DepositBackInfo depositBackInfo) {
		this.depositBackInfo = depositBackInfo;
	}
	public DepositBackInfo getDepositBackInfo( ) {
		return this.depositBackInfo;
	}

	public void setDepositBackInfoList(List<DepositBackInfo> depositBackInfoList) {
		this.depositBackInfoList = depositBackInfoList;
	}
	public List<DepositBackInfo> getDepositBackInfoList( ) {
		return this.depositBackInfoList;
	}

	public void setEnterprisePayInfo(EnterprisePayInfo enterprisePayInfo) {
		this.enterprisePayInfo = enterprisePayInfo;
	}
	public EnterprisePayInfo getEnterprisePayInfo( ) {
		return this.enterprisePayInfo;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setGmtRefundPay(Date gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public Date getGmtRefundPay( ) {
		return this.gmtRefundPay;
	}

	public void setIndustrySepcDetail(String industrySepcDetail) {
		this.industrySepcDetail = industrySepcDetail;
	}
	public String getIndustrySepcDetail( ) {
		return this.industrySepcDetail;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPreAuthCancelFee(String preAuthCancelFee) {
		this.preAuthCancelFee = preAuthCancelFee;
	}
	public String getPreAuthCancelFee( ) {
		return this.preAuthCancelFee;
	}

	public void setPresentRefundBuyerAmount(String presentRefundBuyerAmount) {
		this.presentRefundBuyerAmount = presentRefundBuyerAmount;
	}
	public String getPresentRefundBuyerAmount( ) {
		return this.presentRefundBuyerAmount;
	}

	public void setPresentRefundDiscountAmount(String presentRefundDiscountAmount) {
		this.presentRefundDiscountAmount = presentRefundDiscountAmount;
	}
	public String getPresentRefundDiscountAmount( ) {
		return this.presentRefundDiscountAmount;
	}

	public void setPresentRefundMdiscountAmount(String presentRefundMdiscountAmount) {
		this.presentRefundMdiscountAmount = presentRefundMdiscountAmount;
	}
	public String getPresentRefundMdiscountAmount( ) {
		return this.presentRefundMdiscountAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundChannelList(String refundChannelList) {
		this.refundChannelList = refundChannelList;
	}
	public String getRefundChannelList( ) {
		return this.refundChannelList;
	}

	public void setRefundChannelStatus(String refundChannelStatus) {
		this.refundChannelStatus = refundChannelStatus;
	}
	public String getRefundChannelStatus( ) {
		return this.refundChannelStatus;
	}

	public void setRefundChargeAmount(String refundChargeAmount) {
		this.refundChargeAmount = refundChargeAmount;
	}
	public String getRefundChargeAmount( ) {
		return this.refundChargeAmount;
	}

	public void setRefundChargeInfoList(List<RefundChargeInfo> refundChargeInfoList) {
		this.refundChargeInfoList = refundChargeInfoList;
	}
	public List<RefundChargeInfo> getRefundChargeInfoList( ) {
		return this.refundChargeInfoList;
	}

	public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}
	public List<TradeFundBill> getRefundDetailItemList( ) {
		return this.refundDetailItemList;
	}

	public void setRefundHybAmount(String refundHybAmount) {
		this.refundHybAmount = refundHybAmount;
	}
	public String getRefundHybAmount( ) {
		return this.refundHybAmount;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getRefundReason( ) {
		return this.refundReason;
	}

	public void setRefundRoyaltys(List<RefundRoyaltyResult> refundRoyaltys) {
		this.refundRoyaltys = refundRoyaltys;
	}
	public List<RefundRoyaltyResult> getRefundRoyaltys( ) {
		return this.refundRoyaltys;
	}

	public void setRefundSettlementId(String refundSettlementId) {
		this.refundSettlementId = refundSettlementId;
	}
	public String getRefundSettlementId( ) {
		return this.refundSettlementId;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setRefundVoucherDetailList(List<VoucherDetail> refundVoucherDetailList) {
		this.refundVoucherDetailList = refundVoucherDetailList;
	}
	public List<VoucherDetail> getRefundVoucherDetailList( ) {
		return this.refundVoucherDetailList;
	}

	public void setSendBackFee(String sendBackFee) {
		this.sendBackFee = sendBackFee;
	}
	public String getSendBackFee( ) {
		return this.sendBackFee;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
