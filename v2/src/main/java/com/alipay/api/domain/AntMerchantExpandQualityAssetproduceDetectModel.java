package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应商品检反馈接口
 *
 * @author auto create
 * @since 1.0, 2024-11-01 10:46:17
 */
public class AntMerchantExpandQualityAssetproduceDetectModel extends AlipayObject {

	private static final long serialVersionUID = 7145511894447443415L;

	/**
	 * 供应商传入本次品检的物料数量(单位是个)，系统对数量做正确性校验
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 供应商传入生产指令ID，传入后会对该生产指令ID真实性做存在性的校验
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

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

	public List<QualityDetectDetail> getQualityDetectDetail() {
		return this.qualityDetectDetail;
	}
	public void setQualityDetectDetail(List<QualityDetectDetail> qualityDetectDetail) {
		this.qualityDetectDetail = qualityDetectDetail;
	}

}
