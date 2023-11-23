package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预订单模型
 *
 * @author auto create
 * @since 1.0, 2019-01-23 09:29:32
 */
public class AdvanceOrder extends AlipayObject {

	private static final long serialVersionUID = 1597433774418897624L;

	/**
	 * 预订单编号
	 */
	@ApiField("advance_order_id")
	private String advanceOrderId;

	/**
	 * 业务场景码，分类：SCAN_PURCHASE（扫码购场景）
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 订单创建渠道，商户自行定义用于区分商户的数据来源。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 扩展字段，json格式。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 订单包含的商品列表信息，json格式，其它说明详见商品明细说明
	 */
	@ApiListField("goods_details")
	@ApiField("mall_goods_detail")
	private List<MallGoodsDetail> goodsDetails;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 商户操作员（业务员）编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 卖家的支付宝用户ID
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 预订单状态，状态包含：（初始化：INIT，待付款：WAIT_PAY,  关闭状态：CLOSE）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 店铺名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商户机具终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 订单未优惠的总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAdvanceOrderId() {
		return this.advanceOrderId;
	}
	public void setAdvanceOrderId(String advanceOrderId) {
		this.advanceOrderId = advanceOrderId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<MallGoodsDetail> getGoodsDetails() {
		return this.goodsDetails;
	}
	public void setGoodsDetails(List<MallGoodsDetail> goodsDetails) {
		this.goodsDetails = goodsDetails;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
