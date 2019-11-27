package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv创建相应场景下跳转内容的接口
 *
 * @author auto create
 * @since 1.0, 2017-12-22 11:49:19
 */
public class KoubeiMarketingDataOpenResourceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7545242789397261279L;

	/**
	 * 各个场景展示的内容及跳转链接
	 */
	@ApiListField("content_list")
	@ApiField("content_model")
	private List<ContentModel> contentList;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 场景码，目前支持的场景码：1. order_detail（订单详情）2. pay_result（支付结果）3. shop_detail（店铺详情）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public List<ContentModel> getContentList() {
		return this.contentList;
	}
	public void setContentList(List<ContentModel> contentList) {
		this.contentList = contentList;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
