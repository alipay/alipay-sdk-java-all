package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 子订单信息
 *
 * @author auto create
 * @since 1.0, 2024-08-13 09:55:45
 */
public class SubOrderDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2417614121388619798L;

	/**
	 * 门票描述信息
	 */
	@ApiField("good_desc")
	private String goodDesc;

	/**
	 * 商品id
	 */
	@ApiField("good_id")
	private String goodId;

	/**
	 * 门票中文描述
	 */
	@ApiField("good_name")
	private String goodName;

	/**
	 * 门票数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 子订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 游客信息
	 */
	@ApiListField("passagers")
	@ApiField("ticket_passager_info")
	private List<TicketPassagerInfo> passagers;

	public String getGoodDesc() {
		return this.goodDesc;
	}
	public void setGoodDesc(String goodDesc) {
		this.goodDesc = goodDesc;
	}

	public String getGoodId() {
		return this.goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	public String getGoodName() {
		return this.goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<TicketPassagerInfo> getPassagers() {
		return this.passagers;
	}
	public void setPassagers(List<TicketPassagerInfo> passagers) {
		this.passagers = passagers;
	}

}
