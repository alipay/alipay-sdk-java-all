package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单修改
 *
 * @author auto create
 * @since 1.0, 2025-08-26 10:26:21
 */
public class AlipayOpenMiniOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1279459848798157245L;

	/**
	 * 收货地址
	 */
	@ApiField("address_info")
	private MiniReceiverAddressInfoDTO addressInfo;

	/**
	 * 分账条款
	 */
	@ApiField("alloc_amount_info")
	private AllocAmountInfoDTO allocAmountInfo;

	/**
	 * 履约信息
	 */
	@ApiField("delivery_detail")
	private MiniDeliveryInfoUpdateDTO deliveryDetail;

	/**
	 * 商品修改信息
	 */
	@ApiListField("item_infos")
	@ApiField("goods_info_modify_d_t_o")
	private List<GoodsInfoModifyDTO> itemInfos;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 订单价格修改信息
	 */
	@ApiField("price_info")
	private PriceInfoModifyDTO priceInfo;

	/**
	 * 发件人地址：工程师上门地址、快递上门地址
	 */
	@ApiField("send_address_info")
	private MiniOrderAddressInfoDTO sendAddressInfo;

	/**
	 * 阶段付款计划列表，请在修改付款计划时传入
	 */
	@ApiListField("stage_pay_plans")
	@ApiField("stage_pay_plan_d_t_o")
	private List<StagePayPlanDTO> stagePayPlans;

	/**
	 * 二级商户信息
	 */
	@ApiField("sub_merchant")
	private SubMerchantModifyDTO subMerchant;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public MiniReceiverAddressInfoDTO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(MiniReceiverAddressInfoDTO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public AllocAmountInfoDTO getAllocAmountInfo() {
		return this.allocAmountInfo;
	}
	public void setAllocAmountInfo(AllocAmountInfoDTO allocAmountInfo) {
		this.allocAmountInfo = allocAmountInfo;
	}

	public MiniDeliveryInfoUpdateDTO getDeliveryDetail() {
		return this.deliveryDetail;
	}
	public void setDeliveryDetail(MiniDeliveryInfoUpdateDTO deliveryDetail) {
		this.deliveryDetail = deliveryDetail;
	}

	public List<GoodsInfoModifyDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<GoodsInfoModifyDTO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public PriceInfoModifyDTO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(PriceInfoModifyDTO priceInfo) {
		this.priceInfo = priceInfo;
	}

	public MiniOrderAddressInfoDTO getSendAddressInfo() {
		return this.sendAddressInfo;
	}
	public void setSendAddressInfo(MiniOrderAddressInfoDTO sendAddressInfo) {
		this.sendAddressInfo = sendAddressInfo;
	}

	public List<StagePayPlanDTO> getStagePayPlans() {
		return this.stagePayPlans;
	}
	public void setStagePayPlans(List<StagePayPlanDTO> stagePayPlans) {
		this.stagePayPlans = stagePayPlans;
	}

	public SubMerchantModifyDTO getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchantModifyDTO subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
