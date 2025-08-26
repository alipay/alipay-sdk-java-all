package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保租房户型
 *
 * @author auto create
 * @since 1.0, 2024-06-20 15:27:39
 */
public class HouseMode extends AlipayObject {

	private static final long serialVersionUID = 8211267483324145786L;

	/**
	 * 厨房数量
	 */
	@ApiField("cook_num")
	private Long cookNum;

	/**
	 * 户型描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 月租金，单位元
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 建筑面积，单位平方米
	 */
	@ApiField("floorage")
	private String floorage;

	/**
	 * 厅数量，客厅餐厅等
	 */
	@ApiField("hall_num")
	private Long hallNum;

	/**
	 * 户型图，使用的是文件上传的fileId
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 卧室数量
	 */
	@ApiField("room_num")
	private Long roomNum;

	/**
	 * 卫生间数量
	 */
	@ApiField("toilet_num")
	private Long toiletNum;

	public Long getCookNum() {
		return this.cookNum;
	}
	public void setCookNum(Long cookNum) {
		this.cookNum = cookNum;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getFloorage() {
		return this.floorage;
	}
	public void setFloorage(String floorage) {
		this.floorage = floorage;
	}

	public Long getHallNum() {
		return this.hallNum;
	}
	public void setHallNum(Long hallNum) {
		this.hallNum = hallNum;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getRoomNum() {
		return this.roomNum;
	}
	public void setRoomNum(Long roomNum) {
		this.roomNum = roomNum;
	}

	public Long getToiletNum() {
		return this.toiletNum;
	}
	public void setToiletNum(Long toiletNum) {
		this.toiletNum = toiletNum;
	}

}
