package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证的流水信息
 *
 * @author auto create
 * @since 1.0, 2019-08-16 20:14:03
 */
public class TicketTransInfo extends AlipayObject {

	private static final long serialVersionUID = 2235134799344638374L;

	/**
	 * 流水创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 最后修改时间，也就是流水状态更新为成功的时间
	 */
	@ApiField("last_modify_time")
	private Date lastModifyTime;

	/**
	 * 流水涉及凭证数量，若为普通商品则为1， 若为次卡则为操作的凭证份数
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 凭证流水id
	 */
	@ApiField("ticket_trans_id")
	private String ticketTransId;

	/**
	 * 流水类型
	 */
	@ApiField("ticket_trans_type")
	private String ticketTransType;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastModifyTime() {
		return this.lastModifyTime;
	}
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTicketTransId() {
		return this.ticketTransId;
	}
	public void setTicketTransId(String ticketTransId) {
		this.ticketTransId = ticketTransId;
	}

	public String getTicketTransType() {
		return this.ticketTransType;
	}
	public void setTicketTransType(String ticketTransType) {
		this.ticketTransType = ticketTransType;
	}

}
