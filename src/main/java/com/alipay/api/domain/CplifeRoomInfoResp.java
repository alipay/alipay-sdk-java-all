package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业社区平台房屋信息Mapping关系.
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:09:00
 */
public class CplifeRoomInfoResp extends AlipayObject {

	private static final long serialVersionUID = 7394991523392994565L;

	/**
	 * 商户系统小区房屋唯一ID标示.
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 支付宝系统房间唯一标示.
	 */
	@ApiField("room_id")
	private String roomId;

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

}
