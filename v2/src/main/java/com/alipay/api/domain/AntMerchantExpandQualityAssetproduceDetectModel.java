package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应商品检反馈接口
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:39:48
 */
public class AntMerchantExpandQualityAssetproduceDetectModel extends AlipayObject {

	private static final long serialVersionUID = 8895423688939687787L;

	/**
	 * 供应商传入本次品检的物料数量(单位是个)，系统对数量做正确性校验
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 当品检类型为 生产品检的时候，供应商传入生产指令ID，传入后会对该生产指令ID真实性做存在性的校验
当品检类型为 仓发品检的时候，为配送指令
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 时间戳，nfc_detect_type = NFC_DETECT_DELIVERY 时必填，精度为秒级的10位UTC时间
	 */
	@ApiField("delivery_time")
	private Long deliveryTime;

	/**
	 * 发货物流单号，nfc_detect_type = NFC_DETECT_DELIVERY 时必填
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 不传默认生产品检 NFC_DETECT_PRODUCE，传 NFC_DETECT_DELIVERY 仓发品检
	 */
	@ApiField("nfc_detect_type")
	private String nfcDetectType;

	/**
	 * 品检详情信息，其中有唯一序号代表实体物料，有品检的内容项代表需要品检的具体内容
	 */
	@ApiListField("quality_detect_detail")
	@ApiField("quality_detect_detail")
	private List<QualityDetectDetail> qualityDetectDetail;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public Long getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Long deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getNfcDetectType() {
		return this.nfcDetectType;
	}
	public void setNfcDetectType(String nfcDetectType) {
		this.nfcDetectType = nfcDetectType;
	}

	public List<QualityDetectDetail> getQualityDetectDetail() {
		return this.qualityDetectDetail;
	}
	public void setQualityDetectDetail(List<QualityDetectDetail> qualityDetectDetail) {
		this.qualityDetectDetail = qualityDetectDetail;
	}

}
