package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集中式房间列表
 *
 * @author auto create
 * @since 1.0, 2018-06-20 10:37:58
 */
public class EcoRenthouseRoomInfoList extends AlipayObject {

	private static final long serialVersionUID = 7284537121183317575L;

	/**
	 * 房间参与免押金的到期日期YYYY-MM-dd
	 */
	@ApiField("deposit_end_time")
	private Date depositEndTime;

	/**
	 * KA内部存储的房房间ID
	 */
	@ApiField("ka_room_id")
	private String kaRoomId;

	/**
	 * KA内部存储的房源编号
	 */
	@ApiField("room_code")
	private String roomCode;

	/**
	 * KA内部存储的房房间号
	 */
	@ApiField("room_num")
	private String roomNum;

	public Date getDepositEndTime() {
		return this.depositEndTime;
	}
	public void setDepositEndTime(Date depositEndTime) {
		this.depositEndTime = depositEndTime;
	}

	public String getKaRoomId() {
		return this.kaRoomId;
	}
	public void setKaRoomId(String kaRoomId) {
		this.kaRoomId = kaRoomId;
	}

	public String getRoomCode() {
		return this.roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getRoomNum() {
		return this.roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

}
