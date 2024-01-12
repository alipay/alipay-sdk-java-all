package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑码绑定的门店和桌号信息
 *
 * @author auto create
 * @since 1.0, 2017-09-05 16:47:43
 */
public class KbCodeBindInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3187663642378918545L;

	/**
	 * 商家餐桌摆放的区域名称（预留字段，暂不使用）
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 餐桌最大就餐人数（预留字段，暂不使用）
	 */
	@ApiField("max_pepole_num")
	private Long maxPepoleNum;

	/**
	 * 餐桌就餐的最少人数（预留字段，暂不使用）
	 */
	@ApiField("min_pepole_num")
	private String minPepoleNum;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * table_no对应的中文名称。（预留字段，暂不使用）
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 商家收银系统录入的点菜桌号（生成桌码时，必填）
	 */
	@ApiField("table_no")
	private String tableNo;

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getMaxPepoleNum() {
		return this.maxPepoleNum;
	}
	public void setMaxPepoleNum(Long maxPepoleNum) {
		this.maxPepoleNum = maxPepoleNum;
	}

	public String getMinPepoleNum() {
		return this.minPepoleNum;
	}
	public void setMinPepoleNum(String minPepoleNum) {
		this.minPepoleNum = minPepoleNum;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableNo() {
		return this.tableNo;
	}
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

}
