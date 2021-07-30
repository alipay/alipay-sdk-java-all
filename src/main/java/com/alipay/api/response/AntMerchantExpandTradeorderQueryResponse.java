package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemOrderOpenData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.tradeorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:55
 */
public class AntMerchantExpandTradeorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4445566438641552152L;

	/** 
	 * 订单金额；单位：分
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 业务序列号
	 */
	@ApiField("biz_seq")
	private String bizSeq;

	/** 
	 * 买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 订单扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 订单修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 支付时间
	 */
	@ApiField("gmt_paid")
	private Date gmtPaid;

	/** 
	 * 商品订单列表
	 */
	@ApiListField("item_orders")
	@ApiField("item_order_open_data")
	private List<ItemOrderOpenData> itemOrders;

	/** 
	 * 订单物流状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/** 
	 * 订单描述
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 商家补贴金额；单位：分
	 */
	@ApiField("merchant_subsidy_amount")
	private Long merchantSubsidyAmount;

	/** 
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 外部业务类型；TO_SHOP(到店)、GAS(加油)
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/** 
	 * 平台商ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 平台补贴金额；单位：分
	 */
	@ApiField("partner_subsidy_amount")
	private Long partnerSubsidyAmount;

	/** 
	 * 订单实际支付金额；单位：分
	 */
	@ApiField("real_amount")
	private Long realAmount;

	/** 
	 * 卖家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 订单状态；INIT(初始化)、WAIT_PAY(待支付)、PAID(已支付)、TIMEOUT_CLOSED(超时关闭)、SUCCESS_FINISHED(订单成功完结)、REFUNDED(已退款)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 业务类型；GAS_SERVICE(加油业务)，SHOP_SERVICE(到店业务)
	 */
	@ApiField("type")
	private String type;

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

	public void setBizSeq(String bizSeq) {
		this.bizSeq = bizSeq;
	}
	public String getBizSeq( ) {
		return this.bizSeq;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setGmtPaid(Date gmtPaid) {
		this.gmtPaid = gmtPaid;
	}
	public Date getGmtPaid( ) {
		return this.gmtPaid;
	}

	public void setItemOrders(List<ItemOrderOpenData> itemOrders) {
		this.itemOrders = itemOrders;
	}
	public List<ItemOrderOpenData> getItemOrders( ) {
		return this.itemOrders;
	}

	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}
	public String getLogisticsStatus( ) {
		return this.logisticsStatus;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMerchantSubsidyAmount(Long merchantSubsidyAmount) {
		this.merchantSubsidyAmount = merchantSubsidyAmount;
	}
	public Long getMerchantSubsidyAmount( ) {
		return this.merchantSubsidyAmount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}
	public String getOutBizType( ) {
		return this.outBizType;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPartnerSubsidyAmount(Long partnerSubsidyAmount) {
		this.partnerSubsidyAmount = partnerSubsidyAmount;
	}
	public Long getPartnerSubsidyAmount( ) {
		return this.partnerSubsidyAmount;
	}

	public void setRealAmount(Long realAmount) {
		this.realAmount = realAmount;
	}
	public Long getRealAmount( ) {
		return this.realAmount;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
