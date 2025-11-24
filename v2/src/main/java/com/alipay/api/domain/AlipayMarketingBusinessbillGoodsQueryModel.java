package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营收款单商品信息查询
 *
 * @author auto create
 * @since 1.0, 2025-04-15 14:33:40
 */
public class AlipayMarketingBusinessbillGoodsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5868377221264872351L;

	/**
	 * 支付宝分配的场景编码
	 */
	@ApiField("activity_scene")
	private String activityScene;

	/**
	 * 根据商品编码查询
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 依据商品型号模糊查询
	 */
	@ApiField("goods_model_number")
	private String goodsModelNumber;

	/**
	 * 根据商品名称模糊查询
	 */
	@ApiField("goods_title")
	private String goodsTitle;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityScene() {
		return this.activityScene;
	}
	public void setActivityScene(String activityScene) {
		this.activityScene = activityScene;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsModelNumber() {
		return this.goodsModelNumber;
	}
	public void setGoodsModelNumber(String goodsModelNumber) {
		this.goodsModelNumber = goodsModelNumber;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
