package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HotelRoomFaceInfoRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.hoteldevice.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:11:17
 */
public class AlipayOpenIotmbsHoteldeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5432826739861248471L;

	/** 
	 * 设备绑定的人脸数据列表
	 */
	@ApiListField("face_list")
	@ApiField("hotel_room_face_info_res")
	private List<HotelRoomFaceInfoRes> faceList;

	/** 
	 * 下发设备开启的功能列表
	 */
	@ApiListField("function_list")
	@ApiField("string")
	private List<String> functionList;

	/** 
	 * 刷脸组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/** 
	 * 设备绑定的酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/** 
	 * 心跳同步间隔时间，单位秒
	 */
	@ApiField("poll_time")
	private String pollTime;

	/** 
	 * 设备绑定的房间号
	 */
	@ApiField("room_no")
	private String roomNo;

	/** 
	 * 0:未入住，1:入住
	 */
	@ApiField("room_status")
	private String roomStatus;

	public void setFaceList(List<HotelRoomFaceInfoRes> faceList) {
		this.faceList = faceList;
	}
	public List<HotelRoomFaceInfoRes> getFaceList( ) {
		return this.faceList;
	}

	public void setFunctionList(List<String> functionList) {
		this.functionList = functionList;
	}
	public List<String> getFunctionList( ) {
		return this.functionList;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelName( ) {
		return this.hotelName;
	}

	public void setPollTime(String pollTime) {
		this.pollTime = pollTime;
	}
	public String getPollTime( ) {
		return this.pollTime;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomNo( ) {
		return this.roomNo;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	public String getRoomStatus( ) {
		return this.roomStatus;
	}

}
