package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店订单对象
 *
 * @author auto create
 * @since 1.0, 2020-03-05 16:16:23
 */
public class StoreOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 8346965123836758461L;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 联系电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 业务场景对应的扩展字段
	 */
	@ApiListField("ext")
	@ApiField("order_ext")
	private List<OrderExt> ext;

	/**
	 * 订单相关的商品信息
	 */
	@ApiListField("goods_info_list")
	@ApiField("store_order_good")
	private List<StoreOrderGood> goodsInfoList;

	/**
	 * 订单的描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单的ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public List<OrderExt> getExt() {
		return this.ext;
	}
	public void setExt(List<OrderExt> ext) {
		this.ext = ext;
	}

	public List<StoreOrderGood> getGoodsInfoList() {
		return this.goodsInfoList;
	}
	public void setGoodsInfoList(List<StoreOrderGood> goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
