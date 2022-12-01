package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 座位信息
 *
 * @author auto create
 * @since 1.0, 2021-08-30 10:47:52
 */
public class SeatInfo extends AlipayObject {

	private static final long serialVersionUID = 5527388832744551281L;

	/**
	 * 座位等级
	 */
	@ApiField("seat_class")
	private String seatClass;

	/**
	 * 座位号
	 */
	@ApiField("seat_no")
	private String seatNo;

	public String getSeatClass() {
		return this.seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public String getSeatNo() {
		return this.seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

}
