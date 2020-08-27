package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 桌台信息
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:24:47
 */
public class DeskEntity extends AlipayObject {

	private static final long serialVersionUID = 4277667358241828855L;

	/**
	 * 餐区ID
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 餐桌名称
	 */
	@ApiField("desk_name")
	private String deskName;

	/**
	 * 桌位编码
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 桌台ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 桌位人数
	 */
	@ApiField("max_num")
	private Long maxNum;

	/**
	 * 二维码id
	 */
	@ApiField("qr_code_id")
	private String qrCodeId;

	/**
	 * 餐桌二维码关系ID
	 */
	@ApiField("relation_id")
	private String relationId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 桌位排序
	 */
	@ApiField("sort_num")
	private Long sortNum;

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

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getMaxNum() {
		return this.maxNum;
	}
	public void setMaxNum(Long maxNum) {
		this.maxNum = maxNum;
	}

	public String getQrCodeId() {
		return this.qrCodeId;
	}
	public void setQrCodeId(String qrCodeId) {
		this.qrCodeId = qrCodeId;
	}

	public String getRelationId() {
		return this.relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getSortNum() {
		return this.sortNum;
	}
	public void setSortNum(Long sortNum) {
		this.sortNum = sortNum;
	}

}
