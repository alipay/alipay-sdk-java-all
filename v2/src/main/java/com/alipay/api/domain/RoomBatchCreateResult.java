package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量创建房间结果
 *
 * @author auto create
 * @since 1.0, 2026-09-29 11:10:14
 */
public class RoomBatchCreateResult extends AlipayObject {

	private static final long serialVersionUID = 4119911981613566781L;

	/**
	 * 失败编码
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 失败描述
	 */
	@ApiField("fail_msg")
	private String failMsg;

	/**
	 * 外部房间号
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 小区id加上外部房间号
	 */
	@ApiField("room_id")
	private String roomId;

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getFailMsg() {
		return this.failMsg;
	}
	public void setFailMsg(String failMsg) {
		this.failMsg = failMsg;
	}

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
