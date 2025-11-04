package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗商业化订单回流接口
 *
 * @author auto create
 * @since 1.0, 2023-07-11 10:36:17
 */
public class AlipayCommerceMedicalCommercialorderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5758379566176235924L;

	/**
	 * 支付金额，精确到小数点后2位，单位为元。
当订单状态为“已支付”、“使用中”、“已完成”、“已出报告”、“已退款”、“部分退款”时必填
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 支付宝收单系统生成的交易订单号。当订单状态为“已支付”、“使用中”、“已完成”、“已出报告”、“已退款”、“部分退款”时必填
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 支付宝用户open_id
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("buyer_uid")
	private String buyerUid;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private MedicalCommercialOrderUploadExtInfo extInfo;

	/**
	 * 商品编码，商品入驻时可以获取，app_code于out_goods_id需要相匹配
	 */
	@ApiField("goods_app_code")
	private String goodsAppCode;

	/**
	 * 商户自定义的商品描述
	 */
	@ApiField("goods_desc")
	private String goodsDesc;

	/**
	 * 商户自定义的商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商户侧的订单详情页链接
	 */
	@ApiField("merchant_order_detail_url")
	private String merchantOrderDetailUrl;

	/**
	 * 订单金额，精确到小数点后2位，单位为元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单创建时间，格式为"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单修改时间，订单信息变更时必须变化，保持最新，格式为"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("order_modified_time")
	private String orderModifiedTime;

	/**
	 * 订单状态，和订单类型强相关，状态之间的跳转有限制。详见集成文档
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型，固定值COMMERCIAL_ORDER
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商户自身订单号，需要保证同一商户pid下out_biz_no的唯一性，作为订单唯一标识。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 妇幼：OBSTETRICS_AND_PEDIATRICS
医美：MEDICAL_COSMETOLOGY
体检：MEDICAL_EXAMINATION
疫苗：VACCINE
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 商户自定义的外部商品id，与入驻光华的app_code匹配
	 */
	@ApiField("out_goods_id")
	private String outGoodsId;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getBuyerUid() {
		return this.buyerUid;
	}
	public void setBuyerUid(String buyerUid) {
		this.buyerUid = buyerUid;
	}

	public MedicalCommercialOrderUploadExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(MedicalCommercialOrderUploadExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getGoodsAppCode() {
		return this.goodsAppCode;
	}
	public void setGoodsAppCode(String goodsAppCode) {
		this.goodsAppCode = goodsAppCode;
	}

	public String getGoodsDesc() {
		return this.goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getMerchantOrderDetailUrl() {
		return this.merchantOrderDetailUrl;
	}
	public void setMerchantOrderDetailUrl(String merchantOrderDetailUrl) {
		this.merchantOrderDetailUrl = merchantOrderDetailUrl;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(String orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
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

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getOutGoodsId() {
		return this.outGoodsId;
	}
	public void setOutGoodsId(String outGoodsId) {
		this.outGoodsId = outGoodsId;
	}

}
