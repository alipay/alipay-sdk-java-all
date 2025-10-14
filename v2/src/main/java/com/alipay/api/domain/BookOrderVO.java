package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约单
 *
 * @author auto create
 * @since 1.0, 2025-09-19 18:00:49
 */
public class BookOrderVO extends AlipayObject {

	private static final long serialVersionUID = 7484435642891167497L;

	/**
	 * 下单时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 外部预约订单号，服务商下唯—
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 订单状态:31-待接种，91-已接种，81-已取消
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 外部医院id，服务商下唯—
	 */
	@ApiField("store_code")
	private String storeCode;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
