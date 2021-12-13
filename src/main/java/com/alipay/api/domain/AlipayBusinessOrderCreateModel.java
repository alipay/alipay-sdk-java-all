package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商业订单创建
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:37:10
 */
public class AlipayBusinessOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6729977963286361728L;

	/**
	 * 买家身份信息。注：本接口只支持传入type为USER_ID，issuer为ALIPAY
	 */
	@ApiField("buyer_identity")
	private UserIdentity buyerIdentity;

	/**
	 * 订单控制信息，比如超时信息。
	 */
	@ApiField("control_info")
	private ControlInfo controlInfo;

	/**
	 * 订单经营环境信息
	 */
	@ApiField("env_info")
	private EnvInfo envInfo;

	/**
	 * 订单商品列表
	 */
	@ApiListField("item_list")
	@ApiField("item_detail")
	private List<ItemDetail> itemList;

	/**
	 * 商户外部订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单创建指定营销信息，如果不传入该字段，表明不咨询前置营销
	 */
	@ApiField("selected_marketing")
	private MarketingSelectionInfo selectedMarketing;

	/**
	 * 卖家身份信息。注：只支持传入type为USER_ID，issuer为ALIPAY
	 */
	@ApiField("seller_identity")
	private UserIdentity sellerIdentity;

	/**
	 * 订单标题
	 */
	@ApiField("title")
	private String title;

	public UserIdentity getBuyerIdentity() {
		return this.buyerIdentity;
	}
	public void setBuyerIdentity(UserIdentity buyerIdentity) {
		this.buyerIdentity = buyerIdentity;
	}

	public ControlInfo getControlInfo() {
		return this.controlInfo;
	}
	public void setControlInfo(ControlInfo controlInfo) {
		this.controlInfo = controlInfo;
	}

	public EnvInfo getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(EnvInfo envInfo) {
		this.envInfo = envInfo;
	}

	public List<ItemDetail> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemDetail> itemList) {
		this.itemList = itemList;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public MarketingSelectionInfo getSelectedMarketing() {
		return this.selectedMarketing;
	}
	public void setSelectedMarketing(MarketingSelectionInfo selectedMarketing) {
		this.selectedMarketing = selectedMarketing;
	}

	public UserIdentity getSellerIdentity() {
		return this.sellerIdentity;
	}
	public void setSellerIdentity(UserIdentity sellerIdentity) {
		this.sellerIdentity = sellerIdentity;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
