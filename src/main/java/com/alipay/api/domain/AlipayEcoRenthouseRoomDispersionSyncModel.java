package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分散式(整租/合租)房源同步
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:48:52
 */
public class AlipayEcoRenthouseRoomDispersionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7242246613161457965L;

	/**
	 * 阿里短号
	 */
	@ApiField("ali_short_num")
	private String aliShortNum;

	/**
	 * 户型-房
数值范围：1-26
	 */
	@ApiField("bedroom_count")
	private Long bedroomCount;

	/**
	 * 可入住时间YYYY-MM-DD。大于今日，且小于等于185天
	 */
	@ApiField("checkin_time")
	private String checkinTime;

	/**
	 * 小区同步请求号
	 */
	@ApiField("comm_req_id")
	private String commReqId;

	/**
	 * 佣金
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * 佣金类型（p：百分比，m：金额）
	 */
	@ApiField("commission_type")
	private String commissionType;

	/**
	 * 小区Code和小区请求号必输入其一
小区Code,详见文档
http://ecopublic.oss-cn-hangzhou.aliyuncs.com/eco/tpmogo/CommunityInfos/CommunityInfos.xls
	 */
	@ApiField("community_code")
	private String communityCode;

	/**
	 * 费用说明
	 */
	@ApiField("fee_remark")
	private String feeRemark;

	/**
	 * 公寓面积	数值范围：5.00㎡-300.00㎡，支持小数点后面2位
	 */
	@ApiField("flat_area")
	private String flatArea;

	/**
	 * 门牌-栋（楼号）
	 */
	@ApiField("flat_building")
	private String flatBuilding;

	/**
	 * 分散式合租公共区域物品配置，分散式整租不用设置
1:WIFI;3:热水器;4:洗衣机;5:冰箱;6:电视;7:微波炉;8:燃气灶;9:抽油烟机;10:电磁炉;14:沙发;
	 */
	@ApiListField("flat_configs")
	@ApiField("string")
	private List<String> flatConfigs;

	/**
	 * 门牌-单元
	 */
	@ApiField("flat_unit")
	private String flatUnit;

	/**
	 * 所在楼层
	 */
	@ApiField("floor_count")
	private Long floorCount;

	/**
	 * 押金	数值范围：0-￥420000.00
	 */
	@ApiField("foregift_amount")
	private String foregiftAmount;

	/**
	 * 免押金开始时间 YYYY-MM-dd
	 */
	@ApiField("free_begin_date")
	private String freeBeginDate;

	/**
	 * 免押金结束时间 YYYY-MM-dd
	 */
	@ApiField("free_end_date")
	private String freeEndDate;

	/**
	 * 通过"文件上传"接口返回的房源图片url路径。房间照片可录入0~10张,目前仅支持jpg、png、jpeg格式
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 房源描述
	 */
	@ApiField("intro")
	private String intro;

	/**
	 * 可签约至YYYY-MM-DD
	 */
	@ApiField("max_lease_time")
	private String maxLeaseTime;

	/**
	 * 多少天起可租
	 */
	@ApiField("min_rent_days")
	private Long minRentDays;

	/**
	 * 其它费用
	 */
	@ApiListField("other_amount")
	@ApiField("eco_renthouse_other_amount")
	private List<EcoRenthouseOtherAmount> otherAmount;

	/**
	 * 管家姓名
	 */
	@ApiField("owners_name")
	private String ownersName;

	/**
	 * 管家手机号码，必须为400开头
	 */
	@ApiField("owners_tel")
	private String ownersTel;

	/**
	 * 户型-厅	
数值范围：0-10
	 */
	@ApiField("parlor_count")
	private Long parlorCount;

	/**
	 * 付款方式-付	
1：付一，2：付二
	 */
	@ApiField("pay_type")
	private Long payType;

	/**
	 * 付款方式列表，包括上述单独传递的付款方式。如果2种都传递，默认覆盖单独传递的付款方式。
	 */
	@ApiListField("pay_type_list")
	@ApiField("eco_dis_renthousepay_type_list")
	private List<EcoDisRenthousepayTypeList> payTypeList;

	/**
	 * 出租状态	数值范围：1未租、2已租
	 */
	@ApiField("rent_status")
	private Long rentStatus;

	/**
	 * 出租类型	1：整租，2：合租
	 */
	@ApiField("rent_type")
	private Long rentType;

	/**
	 * 租金	数值范围：￥100.00 - ￥35000.00 ，支持小数点后面2位
	 */
	@ApiField("room_amount")
	private String roomAmount;

	/**
	 * 房间面积	数值范围：5.00㎡-300.00㎡，支持小数点后面2位
	 */
	@ApiField("room_area")
	private String roomArea;

	/**
	 * KA内部存储的房源编号
	 */
	@ApiField("room_code")
	private Long roomCode;

	/**
	 * 分散式房间物品配置：
分散式整租房间配置
2:空调;3:热水器;4:洗衣机;5:冰箱;6:电视;7:微波炉;8:燃气灶;9:抽油烟机;10:电磁炉;11:床;11:WIFI;12:书桌;13:衣柜;14:沙发;15:阳台;
分散式合租房间配置
2:空调;6:电视;11:床;12:书桌;13:衣柜;15:阳台;16:独卫;
	 */
	@ApiListField("room_configs")
	@ApiField("string")
	private List<String> roomConfigs;

	/**
	 * 分散式合租房间内对应每个卧室朝向
根据rent_type区分是否必填，合租必填，整租否。
	 */
	@ApiField("room_face")
	private Long roomFace;

	/**
	 * 分散式合租房间内对应每个卧室名称。A_Z字母之一表示。
根据rent_type区分是否必填，合租必填，整租否。
	 */
	@ApiField("room_name")
	private String roomName;

	/**
	 * 门牌-室
	 */
	@ApiField("room_num")
	private String roomNum;

	/**
	 * 房源初始上下架状态
上架状态租房平台会展示该房间信息，下架状态反之
	 */
	@ApiField("room_status")
	private Long roomStatus;

	/**
	 * 房源对应的店铺编号
	 */
	@ApiField("room_store_no")
	private String roomStoreNo;

	/**
	 * 户型-卫	
数值范围：0-10
	 */
	@ApiField("toilet_count")
	private Long toiletCount;

	/**
	 * 房屋总楼层
	 */
	@ApiField("total_floor_count")
	private String totalFloorCount;

	public String getAliShortNum() {
		return this.aliShortNum;
	}
	public void setAliShortNum(String aliShortNum) {
		this.aliShortNum = aliShortNum;
	}

	public Long getBedroomCount() {
		return this.bedroomCount;
	}
	public void setBedroomCount(Long bedroomCount) {
		this.bedroomCount = bedroomCount;
	}

	public String getCheckinTime() {
		return this.checkinTime;
	}
	public void setCheckinTime(String checkinTime) {
		this.checkinTime = checkinTime;
	}

	public String getCommReqId() {
		return this.commReqId;
	}
	public void setCommReqId(String commReqId) {
		this.commReqId = commReqId;
	}

	public String getCommission() {
		return this.commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCommissionType() {
		return this.commissionType;
	}
	public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}

	public String getCommunityCode() {
		return this.communityCode;
	}
	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public String getFeeRemark() {
		return this.feeRemark;
	}
	public void setFeeRemark(String feeRemark) {
		this.feeRemark = feeRemark;
	}

	public String getFlatArea() {
		return this.flatArea;
	}
	public void setFlatArea(String flatArea) {
		this.flatArea = flatArea;
	}

	public String getFlatBuilding() {
		return this.flatBuilding;
	}
	public void setFlatBuilding(String flatBuilding) {
		this.flatBuilding = flatBuilding;
	}

	public List<String> getFlatConfigs() {
		return this.flatConfigs;
	}
	public void setFlatConfigs(List<String> flatConfigs) {
		this.flatConfigs = flatConfigs;
	}

	public String getFlatUnit() {
		return this.flatUnit;
	}
	public void setFlatUnit(String flatUnit) {
		this.flatUnit = flatUnit;
	}

	public Long getFloorCount() {
		return this.floorCount;
	}
	public void setFloorCount(Long floorCount) {
		this.floorCount = floorCount;
	}

	public String getForegiftAmount() {
		return this.foregiftAmount;
	}
	public void setForegiftAmount(String foregiftAmount) {
		this.foregiftAmount = foregiftAmount;
	}

	public String getFreeBeginDate() {
		return this.freeBeginDate;
	}
	public void setFreeBeginDate(String freeBeginDate) {
		this.freeBeginDate = freeBeginDate;
	}

	public String getFreeEndDate() {
		return this.freeEndDate;
	}
	public void setFreeEndDate(String freeEndDate) {
		this.freeEndDate = freeEndDate;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getIntro() {
		return this.intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getMaxLeaseTime() {
		return this.maxLeaseTime;
	}
	public void setMaxLeaseTime(String maxLeaseTime) {
		this.maxLeaseTime = maxLeaseTime;
	}

	public Long getMinRentDays() {
		return this.minRentDays;
	}
	public void setMinRentDays(Long minRentDays) {
		this.minRentDays = minRentDays;
	}

	public List<EcoRenthouseOtherAmount> getOtherAmount() {
		return this.otherAmount;
	}
	public void setOtherAmount(List<EcoRenthouseOtherAmount> otherAmount) {
		this.otherAmount = otherAmount;
	}

	public String getOwnersName() {
		return this.ownersName;
	}
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	public String getOwnersTel() {
		return this.ownersTel;
	}
	public void setOwnersTel(String ownersTel) {
		this.ownersTel = ownersTel;
	}

	public Long getParlorCount() {
		return this.parlorCount;
	}
	public void setParlorCount(Long parlorCount) {
		this.parlorCount = parlorCount;
	}

	public Long getPayType() {
		return this.payType;
	}
	public void setPayType(Long payType) {
		this.payType = payType;
	}

	public List<EcoDisRenthousepayTypeList> getPayTypeList() {
		return this.payTypeList;
	}
	public void setPayTypeList(List<EcoDisRenthousepayTypeList> payTypeList) {
		this.payTypeList = payTypeList;
	}

	public Long getRentStatus() {
		return this.rentStatus;
	}
	public void setRentStatus(Long rentStatus) {
		this.rentStatus = rentStatus;
	}

	public Long getRentType() {
		return this.rentType;
	}
	public void setRentType(Long rentType) {
		this.rentType = rentType;
	}

	public String getRoomAmount() {
		return this.roomAmount;
	}
	public void setRoomAmount(String roomAmount) {
		this.roomAmount = roomAmount;
	}

	public String getRoomArea() {
		return this.roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public Long getRoomCode() {
		return this.roomCode;
	}
	public void setRoomCode(Long roomCode) {
		this.roomCode = roomCode;
	}

	public List<String> getRoomConfigs() {
		return this.roomConfigs;
	}
	public void setRoomConfigs(List<String> roomConfigs) {
		this.roomConfigs = roomConfigs;
	}

	public Long getRoomFace() {
		return this.roomFace;
	}
	public void setRoomFace(Long roomFace) {
		this.roomFace = roomFace;
	}

	public String getRoomName() {
		return this.roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomNum() {
		return this.roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public Long getRoomStatus() {
		return this.roomStatus;
	}
	public void setRoomStatus(Long roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getRoomStoreNo() {
		return this.roomStoreNo;
	}
	public void setRoomStoreNo(String roomStoreNo) {
		this.roomStoreNo = roomStoreNo;
	}

	public Long getToiletCount() {
		return this.toiletCount;
	}
	public void setToiletCount(Long toiletCount) {
		this.toiletCount = toiletCount;
	}

	public String getTotalFloorCount() {
		return this.totalFloorCount;
	}
	public void setTotalFloorCount(String totalFloorCount) {
		this.totalFloorCount = totalFloorCount;
	}

}
