package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单优惠前置咨询
 *
 * @author auto create
 * @since 1.0, 2021-03-30 19:28:46
 */
public class AlipayMarketingCampaignOrderVoucherConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6513782749715594725L;

	/**
	 * 商品咨询请求列表（当需要咨询单品券时必传，如果某商品不希望参与本次单品优惠咨询则不传递对应信息即可）
	 */
	@ApiListField("item_consult_list")
	@ApiField("item_consult_request")
	private List<ItemConsultRequest> itemConsultList;

	/**
	 * 订单金额（如同时享受商户自有优惠请先扣除后传入），单位为元，最多2位小数
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 场景码：默认(DEFAULT)
	 */
	@ApiListField("scene_code")
	@ApiField("string")
	private List<String> sceneCode;

	/**
	 * 券指定的核销appid
	 */
	@ApiField("specified_app_id")
	private String specifiedAppId;

	public List<ItemConsultRequest> getItemConsultList() {
		return this.itemConsultList;
	}
	public void setItemConsultList(List<ItemConsultRequest> itemConsultList) {
		this.itemConsultList = itemConsultList;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSpecifiedAppId() {
		return this.specifiedAppId;
	}
	public void setSpecifiedAppId(String specifiedAppId) {
		this.specifiedAppId = specifiedAppId;
	}

}
