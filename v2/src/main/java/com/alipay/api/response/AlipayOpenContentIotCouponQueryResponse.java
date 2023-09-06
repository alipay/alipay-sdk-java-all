package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.content.iot.coupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:41:42
 */
public class AlipayOpenContentIotCouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3297229215554674127L;

	/** 
	 * 加密后的下一步rpc操作信息，用于客户编排操作流程
	 */
	@ApiField("btn_act")
	private String btnAct;

	/** 
	 * 活动ID，用于后续的领券确认动作，来源于商家在B站的配置
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 组件模板类型，取值来自于业务方自定义，目前只有CommonDataH5一种
	 */
	@ApiField("component_template")
	private String componentTemplate;

	/** 
	 * 加密后的营销组件内容，数据来源于mrchpromoprod
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 活动具体类型，定义来源于mrchpromoprod
	 */
	@ApiField("item_type")
	private String itemType;

	/** 
	 * 返回的券信息是否为空，用于流程编排时的决策节点判断。为true时，可以进行领券操作。
	 */
	@ApiField("nonempty_coupon_list")
	private Boolean nonemptyCouponList;

	/** 
	 * 发券类型，来自于mrchpromoprod，枚举值包括ITEM_DISCOUNT_VOUCHER、GLOBAL_FIX_VOUCHER、GLOBAL_DISCOUNT_VOUCHER、ITEM_FIX_VOUCHER、ITEM_SPECIAL_VOUCHER共5种
	 */
	@ApiField("prize_type")
	private String prizeType;

	/** 
	 * 加密后的服务端查询到的店铺信息，数据来源于商家平台mif
	 */
	@ApiField("shop_info")
	private String shopInfo;

	/** 
	 * 发券信息
	 */
	@ApiField("url")
	private String url;

	/** 
	 * 加密后的语音播报信息，数据来源于mrchpromoprod
	 */
	@ApiField("voice_broadcast")
	private String voiceBroadcast;

	public void setBtnAct(String btnAct) {
		this.btnAct = btnAct;
	}
	public String getBtnAct( ) {
		return this.btnAct;
	}

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setComponentTemplate(String componentTemplate) {
		this.componentTemplate = componentTemplate;
	}
	public String getComponentTemplate( ) {
		return this.componentTemplate;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType( ) {
		return this.itemType;
	}

	public void setNonemptyCouponList(Boolean nonemptyCouponList) {
		this.nonemptyCouponList = nonemptyCouponList;
	}
	public Boolean getNonemptyCouponList( ) {
		return this.nonemptyCouponList;
	}

	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}
	public String getPrizeType( ) {
		return this.prizeType;
	}

	public void setShopInfo(String shopInfo) {
		this.shopInfo = shopInfo;
	}
	public String getShopInfo( ) {
		return this.shopInfo;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

	public void setVoiceBroadcast(String voiceBroadcast) {
		this.voiceBroadcast = voiceBroadcast;
	}
	public String getVoiceBroadcast( ) {
		return this.voiceBroadcast;
	}

}
