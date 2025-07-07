package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupDeliveryRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.delivery.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-31 16:17:22
 */
public class AlipayMerchantGroupDeliveryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4428584296245488255L;

	/** 
	 * 推广计划配置记录列表
	 */
	@ApiListField("delivery_record_list")
	@ApiField("group_delivery_record_v_o")
	private List<GroupDeliveryRecordVO> deliveryRecordList;

	/** 
	 * 推广计划总条数。取值单位是"条"。
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDeliveryRecordList(List<GroupDeliveryRecordVO> deliveryRecordList) {
		this.deliveryRecordList = deliveryRecordList;
	}
	public List<GroupDeliveryRecordVO> getDeliveryRecordList( ) {
		return this.deliveryRecordList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
