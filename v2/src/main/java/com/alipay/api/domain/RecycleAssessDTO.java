package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收估价信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:41:26
 */
public class RecycleAssessDTO extends AlipayObject {

	private static final long serialVersionUID = 1117285618127354578L;

	/**
	 * 估价单id
	 */
	@ApiField("estimate_bill_id")
	private String estimateBillId;

	/**
	 * 估价结果id
	 */
	@ApiField("estimate_result_id")
	private String estimateResultId;

	/**
	 * 回收商信息
	 */
	@ApiField("merchant_info")
	private RecycleMerchantInfo merchantInfo;

	/**
	 * 价格列表
	 */
	@ApiListField("price_info_list")
	@ApiField("recycle_price_info")
	private List<RecyclePriceInfo> priceInfoList;

	/**
	 * 价格类型
	 */
	@ApiField("price_type")
	private String priceType;

	public String getEstimateBillId() {
		return this.estimateBillId;
	}
	public void setEstimateBillId(String estimateBillId) {
		this.estimateBillId = estimateBillId;
	}

	public String getEstimateResultId() {
		return this.estimateResultId;
	}
	public void setEstimateResultId(String estimateResultId) {
		this.estimateResultId = estimateResultId;
	}

	public RecycleMerchantInfo getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(RecycleMerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public List<RecyclePriceInfo> getPriceInfoList() {
		return this.priceInfoList;
	}
	public void setPriceInfoList(List<RecyclePriceInfo> priceInfoList) {
		this.priceInfoList = priceInfoList;
	}

	public String getPriceType() {
		return this.priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

}
