package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证查询返回模型
 *
 * @author auto create
 * @since 1.0, 2019-09-25 10:32:42
 */
public class TicketCodeQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 4783998595536975671L;

	/**
	 * 当前可用份数
	 */
	@ApiField("available_quantity")
	private String availableQuantity;

	/**
	 * 凭证生效时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("effect_date")
	private String effectDate;

	/**
	 * 凭证失效时间 格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 商品编码
	 */
	@ApiListField("item_goods_ids")
	@ApiField("string")
	private List<String> itemGoodsIds;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 凭证核销方式
	 */
	@ApiField("ticket_display_mode")
	private String ticketDisplayMode;

	/**
	 * ticket id
	 */
	@ApiField("ticket_id")
	private String ticketId;

	/**
	 * 券状态
	 */
	@ApiField("ticket_status")
	private String ticketStatus;

	/**
	 * 是否次卡
	 */
	@ApiField("time_cards")
	private Boolean timeCards;

	/**
	 * 初始份数
	 */
	@ApiField("total_quantity")
	private String totalQuantity;

	public String getAvailableQuantity() {
		return this.availableQuantity;
	}
	public void setAvailableQuantity(String availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public String getEffectDate() {
		return this.effectDate;
	}
	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public List<String> getItemGoodsIds() {
		return this.itemGoodsIds;
	}
	public void setItemGoodsIds(List<String> itemGoodsIds) {
		this.itemGoodsIds = itemGoodsIds;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getTicketDisplayMode() {
		return this.ticketDisplayMode;
	}
	public void setTicketDisplayMode(String ticketDisplayMode) {
		this.ticketDisplayMode = ticketDisplayMode;
	}

	public String getTicketId() {
		return this.ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketStatus() {
		return this.ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Boolean getTimeCards() {
		return this.timeCards;
	}
	public void setTimeCards(Boolean timeCards) {
		this.timeCards = timeCards;
	}

	public String getTotalQuantity() {
		return this.totalQuantity;
	}
	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
