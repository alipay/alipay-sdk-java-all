package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传商户操作行为信息
 *
 * @author auto create
 * @since 1.0, 2016-04-12 10:10:31
 */
public class AlipayOpenServicemarketIsvShopActionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5557749679821377145L;

	/**
	 * 商户操作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 用户操作实体具体信息（这里是菜品实体信息）,如果entiy 是shop_dish 则 actiond_detail_dish 为必填字段
	 */
	@ApiField("actiond_detail_dish")
	private IsvShopDish actiondDetailDish;

	/**
	 * 用户操作实体具体信息（这里是餐桌实体信息）,如果entiy 是shop_table 则 actiond_detail_shop 为必填字段
	 */
	@ApiField("actiond_detail_shop")
	private IsvShopTable actiondDetailShop;

	/**
	 * 商户操作行为发生的时间，格式必须是 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * 操作对象的类型名字(shop_table、shop_dish)
	 */
	@ApiField("entity")
	private String entity;

	/**
	 * 操作的店铺对象信息
	 */
	@ApiField("outer_shop_do")
	private OuterShopDO outerShopDo;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public IsvShopDish getActiondDetailDish() {
		return this.actiondDetailDish;
	}
	public void setActiondDetailDish(IsvShopDish actiondDetailDish) {
		this.actiondDetailDish = actiondDetailDish;
	}

	public IsvShopTable getActiondDetailShop() {
		return this.actiondDetailShop;
	}
	public void setActiondDetailShop(IsvShopTable actiondDetailShop) {
		this.actiondDetailShop = actiondDetailShop;
	}

	public String getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getEntity() {
		return this.entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}

	public OuterShopDO getOuterShopDo() {
		return this.outerShopDo;
	}
	public void setOuterShopDo(OuterShopDO outerShopDo) {
		this.outerShopDo = outerShopDo;
	}

}
