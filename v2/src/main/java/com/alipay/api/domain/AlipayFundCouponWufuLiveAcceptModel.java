package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播间领取惊喜福卡或万能福
 *
 * @author auto create
 * @since 1.0, 2021-01-14 17:25:11
 */
public class AlipayFundCouponWufuLiveAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 2672528932676928729L;

	/**
	 * 发卡类型：WAN_NENG_FU-万能福，SURPRISE_CARD-惊喜福卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 业务流水号
	 */
	@ApiField("front_biz_no")
	private String frontBizNo;

	/**
	 * 淘宝主播ID
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 淘宝用户ID
	 */
	@ApiField("taobao_id")
	private String taobaoId;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getFrontBizNo() {
		return this.frontBizNo;
	}
	public void setFrontBizNo(String frontBizNo) {
		this.frontBizNo = frontBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTaobaoId() {
		return this.taobaoId;
	}
	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}

}
