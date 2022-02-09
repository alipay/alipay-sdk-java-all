package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv 会员CRM数据回流
 *
 * @author auto create
 * @since 1.0, 2019-10-18 19:10:20
 */
public class KoubeiMemberDataIsvCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1558239154774966346L;

	/**
	 * 会员卡最近一次激活时间，格式：yyyy-MM-dd HH:MM:ss
	 */
	@ApiField("gmt_member_card_last_active")
	private String gmtMemberCardLastActive;

	/**
	 * 会员卡领取时间（开卡时间），格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_merber_card_create")
	private String gmtMerberCardCreate;

	/**
	 * 会员卡卡号：唯一标识会员卡的ID，partner_id+member_card_id是唯一主键，若partner_id+member_card_id已存在，则做更新会员卡操作。
	 */
	@ApiField("member_card_id")
	private String memberCardId;

	/**
	 * 会员卡类型：
微卡、炫酷卡、儿童卡、璀璨卡、金卡银卡、白金卡等
	 */
	@ApiField("member_card_type")
	private String memberCardType;

	/**
	 * 会员用户身份识别ID
	 */
	@ApiField("member_ship")
	private MemberShip memberShip;

	/**
	 * 会员来源：
1：weixin（微信）；2：alipay（支付宝）；3：offline（线下会员卡）；4：other（其他）
	 */
	@ApiField("member_source")
	private String memberSource;

	/**
	 * 会员来源描述：如美团、饿了么等
	 */
	@ApiField("member_source_desc")
	private String memberSourceDesc;

	/**
	 * 会员状态：
1：生效；0：失效
	 */
	@ApiField("member_status")
	private String memberStatus;

	/**
	 * 外部记录
	 */
	@ApiField("outer_member_info")
	private OuterMemberInfo outerMemberInfo;

	/**
	 * 商户的PID
	 */
	@ApiField("parter_id")
	private String parterId;

	/**
	 * 会员卡领取的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getGmtMemberCardLastActive() {
		return this.gmtMemberCardLastActive;
	}
	public void setGmtMemberCardLastActive(String gmtMemberCardLastActive) {
		this.gmtMemberCardLastActive = gmtMemberCardLastActive;
	}

	public String getGmtMerberCardCreate() {
		return this.gmtMerberCardCreate;
	}
	public void setGmtMerberCardCreate(String gmtMerberCardCreate) {
		this.gmtMerberCardCreate = gmtMerberCardCreate;
	}

	public String getMemberCardId() {
		return this.memberCardId;
	}
	public void setMemberCardId(String memberCardId) {
		this.memberCardId = memberCardId;
	}

	public String getMemberCardType() {
		return this.memberCardType;
	}
	public void setMemberCardType(String memberCardType) {
		this.memberCardType = memberCardType;
	}

	public MemberShip getMemberShip() {
		return this.memberShip;
	}
	public void setMemberShip(MemberShip memberShip) {
		this.memberShip = memberShip;
	}

	public String getMemberSource() {
		return this.memberSource;
	}
	public void setMemberSource(String memberSource) {
		this.memberSource = memberSource;
	}

	public String getMemberSourceDesc() {
		return this.memberSourceDesc;
	}
	public void setMemberSourceDesc(String memberSourceDesc) {
		this.memberSourceDesc = memberSourceDesc;
	}

	public String getMemberStatus() {
		return this.memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public OuterMemberInfo getOuterMemberInfo() {
		return this.outerMemberInfo;
	}
	public void setOuterMemberInfo(OuterMemberInfo outerMemberInfo) {
		this.outerMemberInfo = outerMemberInfo;
	}

	public String getParterId() {
		return this.parterId;
	}
	public void setParterId(String parterId) {
		this.parterId = parterId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
