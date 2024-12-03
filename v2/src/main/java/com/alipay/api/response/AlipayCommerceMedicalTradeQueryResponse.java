package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubsidyAmountParam;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 17:00:37
 */
public class AlipayCommerceMedicalTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2565234858898667199L;

	/** 
	 * 医保个账支付金额
	 */
	@ApiField("account_amount")
	private String accountAmount;

	/** 
	 * 支付宝交易流水号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 商户门店对应的收单银行ID
	 */
	@ApiField("bank_id")
	private String bankId;

	/** 
	 * 商户门店对应的收单银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 银行订单号
	 */
	@ApiField("bank_order_id")
	private String bankOrderId;

	/** 
	 * 即医院上传处方明细的收费批次号
	 */
	@ApiField("chrg_bch_no")
	private String chrgBchNo;

	/** 
	 * 医保支付成功时间
	 */
	@ApiField("gmt_medical_paid")
	private String gmtMedicalPaid;

	/** 
	 * 商户创单时间
	 */
	@ApiField("gmt_out_create")
	private String gmtOutCreate;

	/** 
	 * 自费支付成功时间
	 */
	@ApiField("gmt_own_paid")
	private String gmtOwnPaid;

	/** 
	 * 退款时间
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/** 
	 * 医保基金支付金额
	 */
	@ApiField("gov_amount")
	private String govAmount;

	/** 
	 * 医院支付订单号
	 */
	@ApiField("med_org_ord")
	private String medOrgOrd;

	/** 
	 * 医保支付状态描述
	 */
	@ApiField("medical_pay_msg")
	private String medicalPayMsg;

	/** 
	 * 医保支付状态
	 */
	@ApiField("medical_pay_status")
	private String medicalPayStatus;

	/** 
	 * 请求移动支付中心返回的“重定向完成医保结算确认地址”
	 */
	@ApiField("nathsa_direct_url")
	private String nathsaDirectUrl;

	/** 
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 新国标定点医药机构编码
	 */
	@ApiField("org_no")
	private String orgNo;

	/** 
	 * 医保其他支付金额
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/** 
	 * 该笔交易对应的外部交易流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 自费支付状态描述
	 */
	@ApiField("own_pay_msg")
	private String ownPayMsg;

	/** 
	 * 自费交易状态
	 */
	@ApiField("own_pay_status")
	private String ownPayStatus;

	/** 
	 * 医保订单号
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/** 
	 * 用户自费实付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/** 
	 * 已退款总金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 订单支付类型
	 */
	@ApiField("rels_pay_flag")
	private String relsPayFlag;

	/** 
	 * 如果是亲情账户支付，会返回主账户脱敏姓名
	 */
	@ApiField("rels_pay_user_name")
	private String relsPayUserName;

	/** 
	 * 补充描述
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 医保数据请求透传结构体
	 */
	@ApiField("request_content")
	private String requestContent;

	/** 
	 * 医保数据返回透传结构体
	 */
	@ApiField("response_content")
	private String responseContent;

	/** 
	 * 平台分配给商户的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 外部门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 补充计算金额参数列表
	 */
	@ApiListField("subsidy_amount_params")
	@ApiField("subsidy_amount_param")
	private List<SubsidyAmountParam> subsidyAmountParams;

	/** 
	 * 交易总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易总状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setAccountAmount(String accountAmount) {
		this.accountAmount = accountAmount;
	}
	public String getAccountAmount( ) {
		return this.accountAmount;
	}

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankId( ) {
		return this.bankId;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setBankOrderId(String bankOrderId) {
		this.bankOrderId = bankOrderId;
	}
	public String getBankOrderId( ) {
		return this.bankOrderId;
	}

	public void setChrgBchNo(String chrgBchNo) {
		this.chrgBchNo = chrgBchNo;
	}
	public String getChrgBchNo( ) {
		return this.chrgBchNo;
	}

	public void setGmtMedicalPaid(String gmtMedicalPaid) {
		this.gmtMedicalPaid = gmtMedicalPaid;
	}
	public String getGmtMedicalPaid( ) {
		return this.gmtMedicalPaid;
	}

	public void setGmtOutCreate(String gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}
	public String getGmtOutCreate( ) {
		return this.gmtOutCreate;
	}

	public void setGmtOwnPaid(String gmtOwnPaid) {
		this.gmtOwnPaid = gmtOwnPaid;
	}
	public String getGmtOwnPaid( ) {
		return this.gmtOwnPaid;
	}

	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public String getGmtRefund( ) {
		return this.gmtRefund;
	}

	public void setGovAmount(String govAmount) {
		this.govAmount = govAmount;
	}
	public String getGovAmount( ) {
		return this.govAmount;
	}

	public void setMedOrgOrd(String medOrgOrd) {
		this.medOrgOrd = medOrgOrd;
	}
	public String getMedOrgOrd( ) {
		return this.medOrgOrd;
	}

	public void setMedicalPayMsg(String medicalPayMsg) {
		this.medicalPayMsg = medicalPayMsg;
	}
	public String getMedicalPayMsg( ) {
		return this.medicalPayMsg;
	}

	public void setMedicalPayStatus(String medicalPayStatus) {
		this.medicalPayStatus = medicalPayStatus;
	}
	public String getMedicalPayStatus( ) {
		return this.medicalPayStatus;
	}

	public void setNathsaDirectUrl(String nathsaDirectUrl) {
		this.nathsaDirectUrl = nathsaDirectUrl;
	}
	public String getNathsaDirectUrl( ) {
		return this.nathsaDirectUrl;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getOrgNo( ) {
		return this.orgNo;
	}

	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}
	public String getOtherAmount( ) {
		return this.otherAmount;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setOwnPayMsg(String ownPayMsg) {
		this.ownPayMsg = ownPayMsg;
	}
	public String getOwnPayMsg( ) {
		return this.ownPayMsg;
	}

	public void setOwnPayStatus(String ownPayStatus) {
		this.ownPayStatus = ownPayStatus;
	}
	public String getOwnPayStatus( ) {
		return this.ownPayStatus;
	}

	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getPayOrderId( ) {
		return this.payOrderId;
	}

	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}
	public String getRealAmount( ) {
		return this.realAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRelsPayFlag(String relsPayFlag) {
		this.relsPayFlag = relsPayFlag;
	}
	public String getRelsPayFlag( ) {
		return this.relsPayFlag;
	}

	public void setRelsPayUserName(String relsPayUserName) {
		this.relsPayUserName = relsPayUserName;
	}
	public String getRelsPayUserName( ) {
		return this.relsPayUserName;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	public String getRequestContent( ) {
		return this.requestContent;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}
	public String getResponseContent( ) {
		return this.responseContent;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setSubsidyAmountParams(List<SubsidyAmountParam> subsidyAmountParams) {
		this.subsidyAmountParams = subsidyAmountParams;
	}
	public List<SubsidyAmountParam> getSubsidyAmountParams( ) {
		return this.subsidyAmountParams;
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

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
