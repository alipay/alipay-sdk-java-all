package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广关系复杂类型
 *
 * @author auto create
 * @since 1.0, 2022-01-18 15:20:17
 */
public class PromotionRelationDTO extends AlipayObject {

	private static final long serialVersionUID = 6579519924895517456L;

	/**
	 * 申请推广时填写的申请理由
	 */
	@ApiField("apply_reason")
	private String applyReason;

	/**
	 * 服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 服务商品名称
	 */
	@ApiField("commodity_name")
	private String commodityName;

	/**
	 * 推广关系创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 推广服务商联系人名称
	 */
	@ApiField("promoter_contact_name")
	private String promoterContactName;

	/**
	 * 推广服务商联系电话
	 */
	@ApiField("promoter_contact_phone")
	private String promoterContactPhone;

	/**
	 * 推广服务商的名称
	 */
	@ApiField("promoter_name")
	private String promoterName;

	/**
	 * 推广服务商的pid
	 */
	@ApiField("promoter_pid")
	private String promoterPid;

	/**
	 * 推广任务id
	 */
	@ApiField("promotion_id")
	private String promotionId;

	/**
	 * 推广任务的名称
	 */
	@ApiField("promotion_name")
	private String promotionName;

	public String getApplyReason() {
		return this.applyReason;
	}
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityName() {
		return this.commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPromoterContactName() {
		return this.promoterContactName;
	}
	public void setPromoterContactName(String promoterContactName) {
		this.promoterContactName = promoterContactName;
	}

	public String getPromoterContactPhone() {
		return this.promoterContactPhone;
	}
	public void setPromoterContactPhone(String promoterContactPhone) {
		this.promoterContactPhone = promoterContactPhone;
	}

	public String getPromoterName() {
		return this.promoterName;
	}
	public void setPromoterName(String promoterName) {
		this.promoterName = promoterName;
	}

	public String getPromoterPid() {
		return this.promoterPid;
	}
	public void setPromoterPid(String promoterPid) {
		this.promoterPid = promoterPid;
	}

	public String getPromotionId() {
		return this.promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return this.promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

}
