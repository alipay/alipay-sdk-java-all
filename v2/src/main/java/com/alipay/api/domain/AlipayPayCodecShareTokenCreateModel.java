package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝吱口令发放合规接口
 *
 * @author auto create
 * @since 1.0, 2023-11-07 17:20:14
 */
public class AlipayPayCodecShareTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8767375424177548536L;

	/**
	 * 业务标识，类似于业务主键，诸如pid、uid、门店id 用于幂等标识
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	/**
	 * 吱口令的业务类型，新增业务请联系吱口令PD分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 吱口令解码面板上的右下方按钮文案
	 */
	@ApiField("btn_right")
	private String btnRight;

	/**
	 * 吱口令解码面板上右下方按钮的链接、一般是活动页面或业务跳转地址,注意该地址必须是小程序地址,
格式为:alipays://platformapi/startapp?appId=开头
	 */
	@ApiField("btn_right_href")
	private String btnRightHref;

	/**
	 * 展示在吱口令解码的面板上的描述文案
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片地址: 建议在支付宝文件上传接口的图片地址
尺寸：宽高比满足1:1(建议108*108px)
格式：png、jpg
大小：不超过100kb
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 启用时间，如果为空，则默认给接口调用时候系统的当前时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 1000*3600*24（一天）,默认30D，最大值不超过180D
	 */
	@ApiField("timeout")
	private Long timeout;

	/**
	 * 展示在吱口令解码的面板上的标题字段
	 */
	@ApiField("title")
	private String title;

	public String getBizLinkedId() {
		return this.bizLinkedId;
	}
	public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBtnRight() {
		return this.btnRight;
	}
	public void setBtnRight(String btnRight) {
		this.btnRight = btnRight;
	}

	public String getBtnRightHref() {
		return this.btnRightHref;
	}
	public void setBtnRightHref(String btnRightHref) {
		this.btnRightHref = btnRightHref;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Long getTimeout() {
		return this.timeout;
	}
	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
