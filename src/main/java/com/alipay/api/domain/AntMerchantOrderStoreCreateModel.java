package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店插件服务订单业务能力
 *
 * @author auto create
 * @since 1.0, 2020-03-13 16:22:04
 */
public class AntMerchantOrderStoreCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3352665574322281966L;

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
	 * 扩展参数:
CONSUMER_COUNT ：到店人数, 样例：3
SERVICE_ITEM：服务项目，样例: ["洗头","美发"]
SERVICE_TIME: 到店时间，样例: 2020-03-10 09:00:00
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
	 * 订单超时时间，默认60分钟
	 */
	@ApiField("invalid_time")
	private Long invalidTime;

	/**
	 * 订单的描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 插件业务场景code，预约为ShopService
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 线下门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 线上店的ID
	 */
	@ApiField("store_open_id")
	private String storeOpenId;

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

	public Long getInvalidTime() {
		return this.invalidTime;
	}
	public void setInvalidTime(Long invalidTime) {
		this.invalidTime = invalidTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreOpenId() {
		return this.storeOpenId;
	}
	public void setStoreOpenId(String storeOpenId) {
		this.storeOpenId = storeOpenId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
