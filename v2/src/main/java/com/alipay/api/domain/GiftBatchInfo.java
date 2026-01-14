package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 礼物效果信息
 *
 * @author auto create
 * @since 1.0, 2024-09-19 13:57:52
 */
public class GiftBatchInfo extends AlipayObject {

	private static final long serialVersionUID = 6675193276279936819L;

	/**
	 * 成组列表
	 */
	@ApiListField("batch_list")
	@ApiField("batch_list")
	private List<BatchList> batchList;

	/**
	 * 成组子标题
	 */
	@ApiField("batch_sub_title")
	private String batchSubTitle;

	/**
	 * 用于定义具体礼物
	 */
	@ApiField("gift_id")
	private String giftId;

	public List<BatchList> getBatchList() {
		return this.batchList;
	}
	public void setBatchList(List<BatchList> batchList) {
		this.batchList = batchList;
	}

	public String getBatchSubTitle() {
		return this.batchSubTitle;
	}
	public void setBatchSubTitle(String batchSubTitle) {
		this.batchSubTitle = batchSubTitle;
	}

	public String getGiftId() {
		return this.giftId;
	}
	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}

}
