package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序本地商品免审更新商品接口
 *
 * @author auto create
 * @since 1.0, 2025-05-21 16:23:30
 */
public class AlipayOpenAppLocalitemDirectModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4668335744412363319L;

	/**
	 * 商品属性列表
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/**
	 * 导购信息
	 */
	@ApiListField("guide_info")
	@ApiField("guide_info_v_o")
	private List<GuideInfoVO> guideInfo;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。该字段特殊可选，与out_item_id不能同时为空，优先使用item_id。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一。该字段特殊可选，与item_id不能同时为空，优先使用item_id。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品的售卖状态，有值时更新。
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * sku数组
	 */
	@ApiListField("skus")
	@ApiField("local_item_direct_modify_sku")
	private List<LocalItemDirectModifySku> skus;

	/**
	 * start_time描述售卖开始时间，end_time描述售卖结束时间，时间格式均为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("sold_time")
	private TimeRangeStructVO soldTime;

	public List<AppItemAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<AppItemAttrVO> attrs) {
		this.attrs = attrs;
	}

	public List<GuideInfoVO> getGuideInfo() {
		return this.guideInfo;
	}
	public void setGuideInfo(List<GuideInfoVO> guideInfo) {
		this.guideInfo = guideInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public List<LocalItemDirectModifySku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<LocalItemDirectModifySku> skus) {
		this.skus = skus;
	}

	public TimeRangeStructVO getSoldTime() {
		return this.soldTime;
	}
	public void setSoldTime(TimeRangeStructVO soldTime) {
		this.soldTime = soldTime;
	}

}
