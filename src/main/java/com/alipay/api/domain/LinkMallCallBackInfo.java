package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * linkmall回调信息
 *
 * @author auto create
 * @since 1.0, 2021-10-08 15:26:15
 */
public class LinkMallCallBackInfo extends AlipayObject {

	private static final long serialVersionUID = 6381953851893282344L;

	/**
	 * 操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 业务ID
	 */
	@ApiField("bizid")
	private String bizid;

	/**
	 * 存储回调上下文信息
	 */
	@ApiField("extinfo")
	private String extinfo;

	/**
	 * linkedmall用户ID
	 */
	@ApiField("lmuserid")
	private String lmuserid;

	/**
	 * 优惠模板ID
	 */
	@ApiField("promotionid")
	private String promotionid;

	/**
	 * 优惠实例ID，对应拉菲返回的outerInstanceId
	 */
	@ApiField("promotioninstanceid")
	private String promotioninstanceid;

	/**
	 * 用户的淘宝ID
	 */
	@ApiField("taobaoid")
	private String taobaoid;

	/**
	 * Long ms的时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizid() {
		return this.bizid;
	}
	public void setBizid(String bizid) {
		this.bizid = bizid;
	}

	public String getExtinfo() {
		return this.extinfo;
	}
	public void setExtinfo(String extinfo) {
		this.extinfo = extinfo;
	}

	public String getLmuserid() {
		return this.lmuserid;
	}
	public void setLmuserid(String lmuserid) {
		this.lmuserid = lmuserid;
	}

	public String getPromotionid() {
		return this.promotionid;
	}
	public void setPromotionid(String promotionid) {
		this.promotionid = promotionid;
	}

	public String getPromotioninstanceid() {
		return this.promotioninstanceid;
	}
	public void setPromotioninstanceid(String promotioninstanceid) {
		this.promotioninstanceid = promotioninstanceid;
	}

	public String getTaobaoid() {
		return this.taobaoid;
	}
	public void setTaobaoid(String taobaoid) {
		this.taobaoid = taobaoid;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
