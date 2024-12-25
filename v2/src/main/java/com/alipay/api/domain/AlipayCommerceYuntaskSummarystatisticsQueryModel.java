package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云店汇总数据统计查询
 *
 * @author auto create
 * @since 1.0, 2024-04-24 10:06:52
 */
public class AlipayCommerceYuntaskSummarystatisticsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6851839758611725422L;

	/**
	 * 业务场景，枚举值有MERCHANT、SHOP、HUNTER
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 商家pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 任务id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
