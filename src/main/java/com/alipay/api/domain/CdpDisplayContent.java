package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C端展示的投放内容查询接口，用来获取C端当前展示的投放内容，供ISV页面同步展示。
 *
 * @author auto create
 * @since 1.0, 2018-03-15 11:46:44
 */
public class CdpDisplayContent extends AlipayObject {

	private static final long serialVersionUID = 8669289569377433588L;

	/**
	 * 点击投放内容跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 投放中的扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 投放生效结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 投放生效开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 投放图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 投放文本内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 投放类型字段（当前只有红包），红包redPacket、提示tips、全景ar、广告ad
	 */
	@ApiField("type")
	private String type;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
