package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券权益实体
 *
 * @author auto create
 * @since 1.0, 2024-11-04 10:28:02
 */
public class PromoActActivity extends AlipayObject {

	private static final long serialVersionUID = 8251851292989569671L;

	/**
	 * JUMP代表c端点击去使用时跳转到使用地址，CLOSE代表关闭弹层
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 券id
	 */
	@ApiField("promo_activity_id")
	private String promoActivityId;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getPromoActivityId() {
		return this.promoActivityId;
	}
	public void setPromoActivityId(String promoActivityId) {
		this.promoActivityId = promoActivityId;
	}

}
