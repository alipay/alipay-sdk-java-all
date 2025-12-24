package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝会员阿里云权益同步接口
 *
 * @author auto create
 * @since 1.0, 2020-08-27 20:10:45
 */
public class AlipayUserAliyunbenefitSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5797511415978812334L;

	/**
	 * 阿里云商品类目编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 阿里云商品Id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 权益的名称
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 主图地址
	 */
	@ApiField("main_pic")
	private String mainPic;

	/**
	 * 用于表示该接口的操作，CREATE表示创建，EDIT表示编辑权益，OFF_LINE表示下线权益，其他码则不进行任何操作
	 */
	@ApiField("op_action")
	private String opAction;

	/**
	 * 权益发起同步的时间戳，对于同一变更内容的同步，多次请求，必须保证每次请求的时间戳一样
	 */
	@ApiField("op_timestamp")
	private Long opTimestamp;

	/**
	 * 当前选品操作人的信息
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 商品的划线价，以分为单位，12500表示125元
	 */
	@ApiField("reserve_price")
	private Long reservePrice;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商品的SKU信息
	 */
	@ApiListField("sku_infos")
	@ApiField("sku_info")
	private List<SkuInfo> skuInfos;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getMainPic() {
		return this.mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}

	public String getOpAction() {
		return this.opAction;
	}
	public void setOpAction(String opAction) {
		this.opAction = opAction;
	}

	public Long getOpTimestamp() {
		return this.opTimestamp;
	}
	public void setOpTimestamp(Long opTimestamp) {
		this.opTimestamp = opTimestamp;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getReservePrice() {
		return this.reservePrice;
	}
	public void setReservePrice(Long reservePrice) {
		this.reservePrice = reservePrice;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<SkuInfo> getSkuInfos() {
		return this.skuInfos;
	}
	public void setSkuInfos(List<SkuInfo> skuInfos) {
		this.skuInfos = skuInfos;
	}

}
