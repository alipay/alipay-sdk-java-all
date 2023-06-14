package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbOrderActivityModel;
import com.alipay.api.domain.KbOrderFundsVoucherModel;
import com.alipay.api.domain.KbOrderShopModel;
import com.alipay.api.domain.KbOrderVoucherModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:42:03
 */
public class KoubeiTradeOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8893396763169315688L;

	/** 
	 * 订单对应活动信息，多个商品情况下可能对应多个活动，故为列表;可根据此活动号查询活动名，以标注该购买的商品隶属于哪个活动。
	 */
	@ApiListField("activity_infos")
	@ApiField("kb_order_activity_model")
	private List<KbOrderActivityModel> activityInfos;

	/** 
	 * 购买用户UID，对应买家登陆的支付宝账号
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 联系方式，买家下单时写入，便于卖家联系买家
	 */
	@ApiField("contact")
	private String contact;

	/** 
	 * 订单资金流水，具体字段如下：
funds_voucher_no:资金凭证ID；
gmt_create:资金流转发生时间;
amount:金额；
shop_id:门店ID；
store_id:外部门店ID,即ISV系统中的门店ID，用于与口碑的对应
account:资金流入账户;
trans_type:资金刘庄类型,PAY/SETTLE/REFUND分别对应支付／打款／退款
	 */
	@ApiListField("funds_vouchers")
	@ApiField("kb_order_funds_voucher_model")
	private List<KbOrderFundsVoucherModel> fundsVouchers;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 订单最后修改时间(支付/核销/过期退款||用户主动退款)
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部业务流水编号,推荐:yyyymmddhhmmssSSS99999999(年月日时分秒+8位随机码)，开发者可根据该编号与口碑订单一一对应。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 购买门店所属商家PID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 实付金额，单位为元，消费者实际支付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/** 
	 * 卖家用户收款账号识别码
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 购买店铺信息，详细字段如下：
shop_id:门店ID;
 store_id:外部门店ID,即ISV系统中的门店ID，用于与口碑的对应;
shop_name:门店名称;
	 */
	@ApiField("shop")
	private KbOrderShopModel shop;

	/** 
	 * UNPAY：未支付／待支付  PAY：已支付  FINISH:已完成  CLOSE：已关闭
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 总金额，单位为元，此金额为交易创建金额，为商品优惠前价格*数量。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 订单支付流水号
	 */
	@ApiField("trans_no")
	private String transNo;

	/** 
	 * 凭证列表，每笔订单会根据购买商品种类数量生成凭证信息；如果交易未成功（比如交易超时关闭等），则不会返回该字段。
具体字段如下：
voucher_id：商品凭证ID;
item_id:商品ID;
shop_id:门店ID;
 store_id:外部门店ID,即ISV系统中的门店ID，用于与口碑的对应;
funds_voucher_no:凭证对应资金凭证ID，发货凭证列表,根据funds_voucher_no可从funds_vouchers获取订单资金流;
status:凭证状态，参照凭证状态对照表
refund_type：退款类型，ROLE_DAEMON（超期未使用），ROLE_USER（消费者主动）；
refund_reason：退款理由，由消费者选择或填写内容，系统退款可以为空。
	 */
	@ApiListField("vouchers")
	@ApiField("kb_order_voucher_model")
	private List<KbOrderVoucherModel> vouchers;

	public void setActivityInfos(List<KbOrderActivityModel> activityInfos) {
		this.activityInfos = activityInfos;
	}
	public List<KbOrderActivityModel> getActivityInfos( ) {
		return this.activityInfos;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContact( ) {
		return this.contact;
	}

	public void setFundsVouchers(List<KbOrderFundsVoucherModel> fundsVouchers) {
		this.fundsVouchers = fundsVouchers;
	}
	public List<KbOrderFundsVoucherModel> getFundsVouchers( ) {
		return this.fundsVouchers;
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

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}
	public String getRealAmount( ) {
		return this.realAmount;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
	}

	public void setShop(KbOrderShopModel shop) {
		this.shop = shop;
	}
	public KbOrderShopModel getShop( ) {
		return this.shop;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	public String getTransNo( ) {
		return this.transNo;
	}

	public void setVouchers(List<KbOrderVoucherModel> vouchers) {
		this.vouchers = vouchers;
	}
	public List<KbOrderVoucherModel> getVouchers( ) {
		return this.vouchers;
	}

}
