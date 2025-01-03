package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期单通道前置发奖
 *
 * @author auto create
 * @since 1.0, 2024-11-05 11:49:02
 */
public class AlipayPcreditHuabeiFqAwardReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 8599177546872871223L;

	/**
	 * bankAgentMode表示间联，pid需要穿isv_pid
normalOrderMode表示直连，pid即商户的pid
platformBusinessMode表示直付通
	 */
	@ApiField("acquire_mode")
	private String acquireMode;

	/**
	 * true-有优惠
false-无优惠
	 */
	@ApiField("discount")
	private Boolean discount;

	/**
	 * 交易的商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 产生交易的商品数量
	 */
	@ApiField("goods_num")
	private String goodsNum;

	/**
	 * 交易商品的类目名称
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 所选行业名称，纯文本即可
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 间联下传isv_pid，直连下传pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 产生交易的收单产品
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 线下间联场景offline
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 即二级商户的id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 商品价格(分)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 产生交易支付的地点
	 */
	@ApiField("trade_place")
	private String tradePlace;

	/**
	 * 产生支付的方式
	 */
	@ApiField("trading")
	private String trading;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAcquireMode() {
		return this.acquireMode;
	}
	public void setAcquireMode(String acquireMode) {
		this.acquireMode = acquireMode;
	}

	public Boolean getDiscount() {
		return this.discount;
	}
	public void setDiscount(Boolean discount) {
		this.discount = discount;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNum() {
		return this.goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
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

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradePlace() {
		return this.tradePlace;
	}
	public void setTradePlace(String tradePlace) {
		this.tradePlace = tradePlace;
	}

	public String getTrading() {
		return this.trading;
	}
	public void setTrading(String trading) {
		this.trading = trading;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
