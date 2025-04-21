package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料申请门店信息同步
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:30:37
 */
public class AlipayOpenSpNordermaterialsapplyShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4476475154375627693L;

	/**
	 * 创建申请单时，返回的申请单ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 门店所处区县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 门店所处城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 物料快递收货地址，用于后续接收物料的快递
	 */
	@ApiField("delivery_address")
	private String deliveryAddress;

	/**
	 * 门店所处的具体详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 门店所属的商户名称，如果没有可以与门店名同名
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 支付宝上对应的点餐小程序ID
	 */
	@ApiField("order_app_id")
	private String orderAppId;

	/**
	 * 用于判断门店的幂等标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 门店所处的省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 返佣pid，在带有门店信息下支持提前落位，否则仍然需要在后面铺设回传时传递
	 */
	@ApiField("rebate_pid")
	private String rebatePid;

	/**
	 * 收件人姓名，用于后续接收物料的快递
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件人电话，用于后续接收物料的快递
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 填写蚂蚁体系的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOrderAppId() {
		return this.orderAppId;
	}
	public void setOrderAppId(String orderAppId) {
		this.orderAppId = orderAppId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRebatePid() {
		return this.rebatePid;
	}
	public void setRebatePid(String rebatePid) {
		this.rebatePid = rebatePid;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
