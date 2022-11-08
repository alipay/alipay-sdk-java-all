package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费记录卡信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 19:13:54
 */
public class TimeCardConsumeCardInfo extends AlipayObject {

	private static final long serialVersionUID = 6864685899596727153L;

	/**
	 * 卡实例ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 卡的logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 状态 初始化INIT/已生效VALID/已失效INVALID/退款失效REFUND_INVALID
	 */
	@ApiField("status")
	private String status;

	/**
	 * 名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
