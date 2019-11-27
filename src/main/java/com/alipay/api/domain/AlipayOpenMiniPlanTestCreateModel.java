package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序运营投放计划创建
 *
 * @author auto create
 * @since 1.0, 2019-10-02 14:56:27
 */
public class AlipayOpenMiniPlanTestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3619446922362943422L;

	/**
	 * 投放小程序场景为被投放小程序的appId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 已支持的 TINYAPP:小程序,  PUBLICAPP:生活号
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 投放配置场景内容
	 */
	@ApiListField("plan_content")
	@ApiField("plan_content")
	private List<PlanContent> planContent;

	/**
	 * 商户自定义投放计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 用来标识配置业务场景
PAYMENT_SUCCESS:支付宝钱包商户自运营支付后推荐,DRAGONFLY_IOT_PAYMENT:蜻蜓端支付后推荐,T_LIGHT_SHOP:轻店支付后推荐
	 */
	@ApiField("scene")
	private String scene;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public List<PlanContent> getPlanContent() {
		return this.planContent;
	}
	public void setPlanContent(List<PlanContent> planContent) {
		this.planContent = planContent;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
