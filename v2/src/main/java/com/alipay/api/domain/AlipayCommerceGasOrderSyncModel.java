package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加油行业订单同步
 *
 * @author auto create
 * @since 1.0, 2024-06-24 16:30:52
 */
public class AlipayCommerceGasOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1563761583856543167L;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 优惠金额 单位 元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 优惠信息
	 */
	@ApiListField("discount_list")
	@ApiField("gas_discount_info")
	private List<GasDiscountInfo> discountList;

	/**
	 * 扩展信息，用于业务扩展
	 */
	@ApiField("ext_info")
	private ExtensionMap extInfo;

	/**
	 * 商品信息
	 */
	@ApiListField("goods_info")
	@ApiField("goods_info_detail")
	private List<GoodsInfoDetail> goodsInfo;

	/**
	 * 机构编码，具体机构编码与支付宝小二约定
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 机构应用的支付宝pid
	 */
	@ApiField("inst_pid")
	private String instPid;

	/**
	 * 订单最后修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 加油：oil，充值：recharge
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 机构侧交易流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单实际支付金额 单位 元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单支付时间
	 */
	@ApiField("payment_time")
	private Date paymentTime;

	/**
	 * 具体值与支付宝小二约定
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 订单总金额 单位 元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易方式
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<GasDiscountInfo> getDiscountList() {
		return this.discountList;
	}
	public void setDiscountList(List<GasDiscountInfo> discountList) {
		this.discountList = discountList;
	}

	public ExtensionMap getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ExtensionMap extInfo) {
		this.extInfo = extInfo;
	}

	public List<GoodsInfoDetail> getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(List<GoodsInfoDetail> goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getInstPid() {
		return this.instPid;
	}
	public void setInstPid(String instPid) {
		this.instPid = instPid;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
