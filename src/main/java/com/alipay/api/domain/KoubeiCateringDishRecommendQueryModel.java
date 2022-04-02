package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 点餐菜品推荐
 *
 * @author auto create
 * @since 1.0, 2017-12-22 14:47:14
 */
public class KoubeiCateringDishRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2835548275865417878L;

	/**
	 * 【已废弃】用户已点的主菜品ID，传入时作为推荐菜品参考。
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 当dish_list[]不为空的时候，dish_id是必填字段。
若type=QUICK_ORDER or DESIGN_FOR_YOU；则 dish_list内容为空。
若type=ASSOCIATION_RECOMAND；则dish_List为关联推荐的主菜品；
若type=CART_RECOMAND；则dish_list为购物车的已点菜品。
	 */
	@ApiListField("dish_list")
	@ApiField("dishes")
	private List<Dishes> dishList;

	/**
	 * 点餐门店所属的商家PID
	 */
	@ApiField("merchent_pid")
	private String merchentPid;

	/**
	 * 用餐人数（当type=QUICK_ORDER时，该字段必填）
	 */
	@ApiField("people")
	private String people;

	/**
	 * 门店客单价（单位分）
	 */
	@ApiField("per_price")
	private String perPrice;

	/**
	 * 点餐的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * QUICK_ORDER:一键下单
DESIGN_FOR_YOU:为你定制
ASSOCIATION_RECOMAND:关联推荐
CART_RECOMAND:购物车菜品推荐
type为空默认设置为：DESIGN_FOR_YOU（为你定制）
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public List<Dishes> getDishList() {
		return this.dishList;
	}
	public void setDishList(List<Dishes> dishList) {
		this.dishList = dishList;
	}

	public String getMerchentPid() {
		return this.merchentPid;
	}
	public void setMerchentPid(String merchentPid) {
		this.merchentPid = merchentPid;
	}

	public String getPeople() {
		return this.people;
	}
	public void setPeople(String people) {
		this.people = people;
	}

	public String getPerPrice() {
		return this.perPrice;
	}
	public void setPerPrice(String perPrice) {
		this.perPrice = perPrice;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
