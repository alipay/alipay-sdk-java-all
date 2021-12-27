package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手淘我的淘宝页面支付宝小卡片信息的数据模型，数据用于展现支付宝卡片需要的信息
 *
 * @author auto create
 * @since 1.0, 2019-11-18 17:59:17
 */
public class AlipayMiniCardData extends AlipayObject {

	private static final long serialVersionUID = 8545439464398231839L;

	/**
	 * 行动点链接，用户点击卡片的button时跳转到支付宝相应页面的链接地址
	 */
	@ApiField("action_link")
	private String actionLink;

	/**
	 * 行动点文案，在卡片的button处展现
	 */
	@ApiField("action_text")
	private String actionText;

	/**
	 * 应用英文名，固定值，用于手淘识别卡片所属类型为支付宝卡片
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务码，拼音或者数字，用于我淘搜集相关卡片的展现信息，便于分析各个卡片的点击率等数据情况
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 卡片类型，数字表示相应的不同卡片类型，包括1.提醒类（暂不支持） 2.玩法权益类 3.内容类（暂不支持） 4.商品类（暂不支持） 5.工具类，数字对应手淘约定的几种卡片类型
	 */
	@ApiField("card_type")
	private Long cardType;

	/**
	 * 权益图链接，权益类卡片的权益图片，图片链接由运营进行配置
	 */
	@ApiField("coupon_pic")
	private String couponPic;

	/**
	 * 支付宝卡片标题文字内容，标题组合起来的文案为我的支付宝：XXXX积分，目前固定展现蚂蚁会员的用户积分
	 */
	@ApiField("edit_text")
	private String editText;

	/**
	 * 图文卡片中的图片链接（图片卡片文字用subText表示）
	 */
	@ApiField("item_pic")
	private String itemPic;

	/**
	 * 主文本，工具类卡片展示的主文本文案
	 */
	@ApiField("main_text")
	private String mainText;

	/**
	 * 子文本，工具类卡片展示的子文本文案
	 */
	@ApiField("sub_text")
	private String subText;

	public String getActionLink() {
		return this.actionLink;
	}
	public void setActionLink(String actionLink) {
		this.actionLink = actionLink;
	}

	public String getActionText() {
		return this.actionText;
	}
	public void setActionText(String actionText) {
		this.actionText = actionText;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Long getCardType() {
		return this.cardType;
	}
	public void setCardType(Long cardType) {
		this.cardType = cardType;
	}

	public String getCouponPic() {
		return this.couponPic;
	}
	public void setCouponPic(String couponPic) {
		this.couponPic = couponPic;
	}

	public String getEditText() {
		return this.editText;
	}
	public void setEditText(String editText) {
		this.editText = editText;
	}

	public String getItemPic() {
		return this.itemPic;
	}
	public void setItemPic(String itemPic) {
		this.itemPic = itemPic;
	}

	public String getMainText() {
		return this.mainText;
	}
	public void setMainText(String mainText) {
		this.mainText = mainText;
	}

	public String getSubText() {
		return this.subText;
	}
	public void setSubText(String subText) {
		this.subText = subText;
	}

}
