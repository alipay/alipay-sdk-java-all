package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜谱明细
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:52
 */
public class KbdishCookDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4745894778812771489L;

	/**
	 * 菜谱大类
	 */
	@ApiField("catetory_big_id")
	private String catetoryBigId;

	/**
	 * 菜谱小类
	 */
	@ApiField("catetory_small_id")
	private String catetorySmallId;

	/**
	 * 菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 打标
	 */
	@ApiField("flag")
	private String flag;

	/**
	 * 价格明细
	 */
	@ApiListField("kb_cook_sku_price_list")
	@ApiField("kbdish_cook_price_info")
	private List<KbdishCookPriceInfo> kbCookSkuPriceList;

	/**
	 * 排序值
	 */
	@ApiField("sort")
	private String sort;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getCatetoryBigId() {
		return this.catetoryBigId;
	}
	public void setCatetoryBigId(String catetoryBigId) {
		this.catetoryBigId = catetoryBigId;
	}

	public String getCatetorySmallId() {
		return this.catetorySmallId;
	}
	public void setCatetorySmallId(String catetorySmallId) {
		this.catetorySmallId = catetorySmallId;
	}

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getFlag() {
		return this.flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<KbdishCookPriceInfo> getKbCookSkuPriceList() {
		return this.kbCookSkuPriceList;
	}
	public void setKbCookSkuPriceList(List<KbdishCookPriceInfo> kbCookSkuPriceList) {
		this.kbCookSkuPriceList = kbCookSkuPriceList;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
