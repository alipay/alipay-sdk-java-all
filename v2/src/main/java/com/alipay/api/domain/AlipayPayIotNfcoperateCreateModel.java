package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * NFC货柜海报创建
 *
 * @author auto create
 * @since 1.0, 2025-03-25 21:01:45
 */
public class AlipayPayIotNfcoperateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1552194137854893661L;

	/**
	 * 设备id集合
	 */
	@ApiListField("device_ids")
	@ApiField("string")
	private List<String> deviceIds;

	/**
	 * 投放活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 图片文件地址
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 货柜对应的商家id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 编辑操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 为活动投放名称
	 */
	@ApiField("poster_name")
	private String posterName;

	/**
	 * 活动投放开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public List<String> getDeviceIds() {
		return this.deviceIds;
	}
	public void setDeviceIds(List<String> deviceIds) {
		this.deviceIds = deviceIds;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPosterName() {
		return this.posterName;
	}
	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
