package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新建桌台
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:25:56
 */
public class KoubeiCateringPosDeskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1167131399933415526L;

	/**
	 * 餐区ID
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 桌位名称前缀
	 */
	@ApiField("desk_name")
	private String deskName;

	/**
	 * 桌位最大可坐人数
	 */
	@ApiField("max_num")
	private Long maxNum;

	/**
	 * 批量添加桌位的数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getDeskName() {
		return this.deskName;
	}
	public void setDeskName(String deskName) {
		this.deskName = deskName;
	}

	public Long getMaxNum() {
		return this.maxNum;
	}
	public void setMaxNum(Long maxNum) {
		this.maxNum = maxNum;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
