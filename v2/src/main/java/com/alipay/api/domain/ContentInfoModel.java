package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业场景运营内容信息
 *
 * @author auto create
 * @since 1.0, 2019-01-29 14:19:28
 */
public class ContentInfoModel extends AlipayObject {

	private static final long serialVersionUID = 3157934412214562928L;

	/**
	 * 展台
	 */
	@ApiField("booth")
	private String booth;

	/**
	 * 内容id 加密串
	 */
	@ApiField("content_id_str")
	private String contentIdStr;

	/**
	 * 扩展信息列表
	 */
	@ApiField("ext_info")
	private ContentExtInfoModel extInfo;

	/**
	 * 内容跳转地址
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 内容对应的图片 logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 权益领取状态:
noReceive ( 未领取 ) 
received ( 已领取 )
todayEnded ( 暂时缺货 ) 
ended ( 已抢光 ) 
stoped ( 已结束)
notBegin ( 未开始 )
	 */
	@ApiField("receive_status")
	private String receiveStatus;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 内容副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 内容主标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 阵地
	 */
	@ApiField("touch_point")
	private String touchPoint;

	public String getBooth() {
		return this.booth;
	}
	public void setBooth(String booth) {
		this.booth = booth;
	}

	public String getContentIdStr() {
		return this.contentIdStr;
	}
	public void setContentIdStr(String contentIdStr) {
		this.contentIdStr = contentIdStr;
	}

	public ContentExtInfoModel getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ContentExtInfoModel extInfo) {
		this.extInfo = extInfo;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getReceiveStatus() {
		return this.receiveStatus;
	}
	public void setReceiveStatus(String receiveStatus) {
		this.receiveStatus = receiveStatus;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTouchPoint() {
		return this.touchPoint;
	}
	public void setTouchPoint(String touchPoint) {
		this.touchPoint = touchPoint;
	}

}
