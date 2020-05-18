package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 验证结果反馈
 *
 * @author auto create
 * @since 1.0, 2019-08-14 15:13:41
 */
public class AlipayDataDataserviceVerificationResultSendModel extends AlipayObject {

	private static final long serialVersionUID = 4372289345396267368L;

	/**
	 * 部署单记录id
	 */
	@ApiField("record_id")
	private Long recordId;

	/**
	 * 验证结果列表
	 */
	@ApiListField("result_items")
	@ApiField("dx_verify_result_item")
	private List<DxVerifyResultItem> resultItems;

	public Long getRecordId() {
		return this.recordId;
	}
	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public List<DxVerifyResultItem> getResultItems() {
		return this.resultItems;
	}
	public void setResultItems(List<DxVerifyResultItem> resultItems) {
		this.resultItems = resultItems;
	}

}
