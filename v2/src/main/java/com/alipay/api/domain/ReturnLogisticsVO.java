package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退货物流信息（退货退款场景）
 *
 * @author auto create
 * @since 1.0, 2026-09-09 16:43:19
 */
public class ReturnLogisticsVO extends AlipayObject {

	private static final long serialVersionUID = 2453929542539943197L;

	/**
	 * 退货凭证图片列表，用户寄回时上传的图片URL，上限6张
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 用户退货退款上传物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 退货说明，用户寄回商品时填写的备注信息
	 */
	@ApiField("remark")
	private String remark;

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
