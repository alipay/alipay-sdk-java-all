package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建口碑餐饮订单
 *
 * @author auto create
 * @since 1.0, 2019-08-30 20:12:00
 */
public class KoubeiQualityTestShieldOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6566889249343757369L;

	/**
	 * 枚举类型
ADD_DISH: C端加菜
DELETE_DISH: C端减菜
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 加购单号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜品信息
	 */
	@ApiListField("dish_list")
	@ApiField("shield_dish_list")
	private List<ShieldDishList> dishList;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 口碑订单号
第一次加购时不填，在后付订单上继续加购时需要传入
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 点餐类型
ADVANCE_PAYMENT：先付；
AFTER_PAYMENT：后付；
	 */
	@ApiField("pay_style")
	private String payStyle;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 桌码，扫桌码订单必传
	 */
	@ApiField("table_no")
	private String tableNo;

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public List<ShieldDishList> getDishList() {
		return this.dishList;
	}
	public void setDishList(List<ShieldDishList> dishList) {
		this.dishList = dishList;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayStyle() {
		return this.payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTableNo() {
		return this.tableNo;
	}
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

}
