package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 酒店基础信息配置
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:57:48
 */
public class AlipayCommerceHotelBasicinfoSetModel extends AlipayObject {

	private static final long serialVersionUID = 1121328941345974658L;

	/**
	 * 入住成功结果图片URL
	 */
	@ApiField("checkin_success_image")
	private String checkinSuccessImage;

	/**
	 * 是否启用会员功能
	 */
	@ApiField("enable_member")
	private String enableMember;

	/**
	 * 是否开启订单号查询：Y/N
默认是Y
	 */
	@ApiField("enable_order_id_query")
	private String enableOrderIdQuery;

	/**
	 * 是否开启手机号查询：Y/N,默认是Y
	 */
	@ApiField("enable_phone_query")
	private String enablePhoneQuery;

	/**
	 * 是否开启预定号查询Y/N
默认是N
	 */
	@ApiField("enable_reservation_no_query")
	private String enableReservationNoQuery;

	/**
	 * 酒店bian'm
	 */
	@ApiField("hotel_code")
	private String hotelCode;

	/**
	 * 酒店描述
	 */
	@ApiField("hotel_description")
	private String hotelDescription;

	/**
	 * 酒店集团code
	 */
	@ApiField("hotel_group_code")
	private String hotelGroupCode;

	/**
	 * 酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/**
	 * 房卡制作图片链接，推荐大小570*503,已废弃
	 */
	@ApiField("keycard_production_image")
	private String keycardProductionImage;

	/**
	 * null
	 */
	@ApiListField("registration_agreement")
	@ApiField("string")
	private List<String> registrationAgreement;

	/**
	 * 会员注册提示
	 */
	@ApiField("registration_sub_title")
	private String registrationSubTitle;

	/**
	 * 房间号样式类型
	 */
	@ApiField("room_no_pattern_type")
	private String roomNoPatternType;

	/**
	 * 酒店主题样式配置
	 */
	@ApiField("theme")
	private HotelThemeVO theme;

	public String getCheckinSuccessImage() {
		return this.checkinSuccessImage;
	}
	public void setCheckinSuccessImage(String checkinSuccessImage) {
		this.checkinSuccessImage = checkinSuccessImage;
	}

	public String getEnableMember() {
		return this.enableMember;
	}
	public void setEnableMember(String enableMember) {
		this.enableMember = enableMember;
	}

	public String getEnableOrderIdQuery() {
		return this.enableOrderIdQuery;
	}
	public void setEnableOrderIdQuery(String enableOrderIdQuery) {
		this.enableOrderIdQuery = enableOrderIdQuery;
	}

	public String getEnablePhoneQuery() {
		return this.enablePhoneQuery;
	}
	public void setEnablePhoneQuery(String enablePhoneQuery) {
		this.enablePhoneQuery = enablePhoneQuery;
	}

	public String getEnableReservationNoQuery() {
		return this.enableReservationNoQuery;
	}
	public void setEnableReservationNoQuery(String enableReservationNoQuery) {
		this.enableReservationNoQuery = enableReservationNoQuery;
	}

	public String getHotelCode() {
		return this.hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getHotelDescription() {
		return this.hotelDescription;
	}
	public void setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
	}

	public String getHotelGroupCode() {
		return this.hotelGroupCode;
	}
	public void setHotelGroupCode(String hotelGroupCode) {
		this.hotelGroupCode = hotelGroupCode;
	}

	public String getHotelName() {
		return this.hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getKeycardProductionImage() {
		return this.keycardProductionImage;
	}
	public void setKeycardProductionImage(String keycardProductionImage) {
		this.keycardProductionImage = keycardProductionImage;
	}

	public List<String> getRegistrationAgreement() {
		return this.registrationAgreement;
	}
	public void setRegistrationAgreement(List<String> registrationAgreement) {
		this.registrationAgreement = registrationAgreement;
	}

	public String getRegistrationSubTitle() {
		return this.registrationSubTitle;
	}
	public void setRegistrationSubTitle(String registrationSubTitle) {
		this.registrationSubTitle = registrationSubTitle;
	}

	public String getRoomNoPatternType() {
		return this.roomNoPatternType;
	}
	public void setRoomNoPatternType(String roomNoPatternType) {
		this.roomNoPatternType = roomNoPatternType;
	}

	public HotelThemeVO getTheme() {
		return this.theme;
	}
	public void setTheme(HotelThemeVO theme) {
		this.theme = theme;
	}

}
