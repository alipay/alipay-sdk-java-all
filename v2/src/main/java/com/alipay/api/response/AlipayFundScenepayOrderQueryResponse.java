package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScenePayBusinessParamDTO;
import com.alipay.api.domain.ScenePayParticipantInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-01 13:48:16
 */
public class AlipayFundScenepayOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3366475716352446173L;

	/** 
	 * 交易中包含的业务优惠金额
单位：元
	 */
	@ApiField("biz_amount")
	private String bizAmount;

	/** 
	 * 场景支付业务单号，由场景支付单创建接口获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 业务扩展参数
	 */
	@ApiField("business_params")
	private ScenePayBusinessParamDTO businessParams;

	/** 
	 * 用户uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 交易付款时间
单位：年月日 时分秒
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 是否使用预期优惠
使用-true
未使用-false
	 */
	@ApiField("is_use_expected_discount")
	private String isUseExpectedDiscount;

	/** 
	 * 场景支付业务单状态，可取值有：
INIT：初始状态
PROCESSING：处理中
CLOSED：关单
SUCCESS：成功
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部业务号，请求唯一幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 外部商户单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 参与者信息
	 */
	@ApiField("partner_info")
	private ScenePayParticipantInfoDTO partnerInfo;

	/** 
	 * 当交易发生退款时，该字段不为空，会把每次退款时的明细整合一起发送
	 */
	@ApiField("refund_detail_list")
	private String refundDetailList;

	/** 
	 * 支付宝交易的总金额
单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝侧交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBizAmount(String bizAmount) {
		this.bizAmount = bizAmount;
	}
	public String getBizAmount( ) {
		return this.bizAmount;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setBusinessParams(ScenePayBusinessParamDTO businessParams) {
		this.businessParams = businessParams;
	}
	public ScenePayBusinessParamDTO getBusinessParams( ) {
		return this.businessParams;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setIsUseExpectedDiscount(String isUseExpectedDiscount) {
		this.isUseExpectedDiscount = isUseExpectedDiscount;
	}
	public String getIsUseExpectedDiscount( ) {
		return this.isUseExpectedDiscount;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPartnerInfo(ScenePayParticipantInfoDTO partnerInfo) {
		this.partnerInfo = partnerInfo;
	}
	public ScenePayParticipantInfoDTO getPartnerInfo( ) {
		return this.partnerInfo;
	}

	public void setRefundDetailList(String refundDetailList) {
		this.refundDetailList = refundDetailList;
	}
	public String getRefundDetailList( ) {
		return this.refundDetailList;
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
