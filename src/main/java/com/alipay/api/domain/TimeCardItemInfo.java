package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡商品信息
 *
 * @author auto create
 * @since 1.0, 2022-04-20 10:37:57
 */
public class TimeCardItemInfo extends AlipayObject {

	private static final long serialVersionUID = 1149623133794573844L;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private TimeCardItemExtendInfo extendInfo;

	/**
	 * 次卡商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 卡的logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 原价，精确到分
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 现价，精确到分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 状态：已上架ONLINE/已下架OFFLINE
	 */
	@ApiField("status")
	private String status;

	/**
	 * 次数
	 */
	@ApiField("times")
	private String times;

	/**
	 * 名称
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public TimeCardItemExtendInfo getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(TimeCardItemExtendInfo extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimes() {
		return this.times;
	}
	public void setTimes(String times) {
		this.times = times;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
