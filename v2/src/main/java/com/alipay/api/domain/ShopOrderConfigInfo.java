package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 点餐设置中每一个店铺的配置信息
 *
 * @author auto create
 * @since 1.0, 2020-08-10 14:33:38
 */
public class ShopOrderConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 2472798697142242881L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 店铺营业状态：
可枚举：
(1)OPEN 营业
(2)CLOSE 休息
	 */
	@ApiField("order_entry_status")
	private String orderEntryStatus;

	/**
	 * 点餐一般营业营业时间配置
	 */
	@ApiListField("order_normal_business_time")
	@ApiField("normal_business_time_rule")
	private List<NormalBusinessTimeRule> orderNormalBusinessTime;

	/**
	 * 点餐特殊营业时间规则配置
	 */
	@ApiListField("order_special_business_time")
	@ApiField("special_business_time_rule")
	private List<SpecialBusinessTimeRule> orderSpecialBusinessTime;

	/**
	 * OPEN表示打开点餐服务
CLOSED表示关闭点餐服务
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 预点餐（轻快餐自提）相关设置。若字段为空，表示无需修改。
	 */
	@ApiField("pre_order_config")
	private PreOrderConfigInfo preOrderConfig;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部门店编号；最长32位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性。
	 */
	@ApiField("store_id")
	private String storeId;

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getOrderEntryStatus() {
		return this.orderEntryStatus;
	}
	public void setOrderEntryStatus(String orderEntryStatus) {
		this.orderEntryStatus = orderEntryStatus;
	}

	public List<NormalBusinessTimeRule> getOrderNormalBusinessTime() {
		return this.orderNormalBusinessTime;
	}
	public void setOrderNormalBusinessTime(List<NormalBusinessTimeRule> orderNormalBusinessTime) {
		this.orderNormalBusinessTime = orderNormalBusinessTime;
	}

	public List<SpecialBusinessTimeRule> getOrderSpecialBusinessTime() {
		return this.orderSpecialBusinessTime;
	}
	public void setOrderSpecialBusinessTime(List<SpecialBusinessTimeRule> orderSpecialBusinessTime) {
		this.orderSpecialBusinessTime = orderSpecialBusinessTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public PreOrderConfigInfo getPreOrderConfig() {
		return this.preOrderConfig;
	}
	public void setPreOrderConfig(PreOrderConfigInfo preOrderConfig) {
		this.preOrderConfig = preOrderConfig;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
